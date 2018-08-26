import { Component } from '@angular/core';
import {Apollo, gql} from 'apollo-angular-boost';
import {getUserQuery, getUserQuery_getUser_blogPosts} from "./__generated__/getUserQuery";


const QUERY_GET_USER = gql`
  query getUserQuery($id: Int!) {
    getUser(id: $id) {
      id
      name
      blogPosts {
        id
        subject
      }
    }
  }
`;

const MUTATION_ADD_POST = gql`
  mutation addBlogPostMutation($newPost: BlogPostInput!) {
    addBlogPost(newPost: $newPost) {
      id
      createdAt
      subject
      content
    }
  }
`;


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  blogPosts: getUserQuery_getUser_blogPosts[]| null;
  subject: string;
  content: string;

  constructor(private apollo: Apollo) { }

  loadBlogPosts() {
    this.apollo.query<getUserQuery>({
      query: QUERY_GET_USER,
      variables: {id: 1001}
    }).subscribe(result => {
      this.blogPosts = result.data.getUser.blogPosts;
    });
  }

  addBlogPost() {
    console.log(this.subject);
    console.log(this.content);

    this.apollo.mutate({
      mutation: MUTATION_ADD_POST,
      variables: {
        newPost: {
          subject: this.subject,
          content: this.content,
          userId: 1001
        }
      },
      refetchQueries: [{
        query: QUERY_GET_USER,
        variables: {id: 1001}
      }]
    }).subscribe(_ => {});
  }

}
