import { Component } from '@angular/core';
import { Apollo, gql } from 'apollo-angular-boost';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  blogPosts: any;

  constructor(private apollo: Apollo) { }

  loadBlogPosts() {
    this.apollo
      .query({
        query: gql`
          query testQueries($id: Int!) {
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
        this.blogPosts = result.data['getUser'].blogPosts;
      }
    );
  }

}
