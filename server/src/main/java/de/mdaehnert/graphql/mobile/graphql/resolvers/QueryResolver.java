package de.mdaehnert.graphql.mobile.graphql.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

  public List<String> getUser(int id) {
    return null;
  }

}
