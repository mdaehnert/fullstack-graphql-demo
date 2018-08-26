import { Component } from '@angular/core';
import {Apollo, gql} from 'apollo-angular-boost';
import {getUserQuery, getUserQuery_getUser_blogPosts} from "./__generated__/getUserQuery";

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  blogPosts: getUserQuery_getUser_blogPosts[]| null;

  constructor(private apollo: Apollo) { }

  loadBlogPosts() {
    this.apollo.query<getUserQuery>({
      query: gql`
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
      `,
      variables: {id: 1001}
    }).subscribe(result => {
      this.blogPosts = result.data.getUser.blogPosts;
    });
  }

}
