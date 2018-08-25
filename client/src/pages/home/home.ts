import { Component, OnInit } from '@angular/core';
import { Apollo, gql } from 'apollo-angular-boost';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage implements OnInit {



  constructor(private apollo: Apollo) {

  }

  ngOnInit() {
    var data = this.apollo
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
        console.log(result.data);
      });
  }

}
