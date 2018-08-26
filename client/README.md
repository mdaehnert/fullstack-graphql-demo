# Client

## Introduction

The client consists of an Ionic application which holds one of the best stacks of Single Page Applications (SPA) you can get: Angular with TypeScript.


## Setup new project

1. download and install [nodejs](https://nodejs.org/en/download/)
1. install ionic with ```npm i -g ionic```
1. create skeleton ```ionic start client sidemenu```
1. install and setup [Apollo GraphQL](https://www.apollographql.com/docs/angular/basics/setup.html)


## Download schema and generate TypeScript objects of queries

1. execute ```npm i -g apollo```
1. download schema ```apollo schema:download --endpoint=http://localhost:8080/graphql schema.json```
1. place queries inside *.graphl files
1. generate TypeScript objects ```apollo codegen:generate --schema=schema.json --target=typescript --addTypename```

## Start

1. call ```npm run start``` to start the client


## Issues

* After registration of GraphQL in app.module.ts.
  * #1 - fixed it: https://github.com/apollographql/graphql-subscriptions/issues/83 --> Add "lib": ["esnext.asynciterable"] in tsconfig.json
  * #2 - fixed it: https://github.com/prisma/graphql-yoga/issues/310 --> Update TypeScript to typescript@2.8.3
