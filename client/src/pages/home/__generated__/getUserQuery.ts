/* tslint:disable */
// This file was automatically generated and should not be edited.

// ====================================================
// GraphQL query operation: getUserQuery
// ====================================================

export interface getUserQuery_getUser_blogPosts {
  __typename: "BlogPost";
  id: number;
  subject: string;
}

export interface getUserQuery_getUser {
  __typename: "User";
  id: number;
  name: string;
  blogPosts: (getUserQuery_getUser_blogPosts | null)[] | null;
}

export interface getUserQuery {
  getUser: getUserQuery_getUser | null;
}

export interface getUserQueryVariables {
  id: number;
}
