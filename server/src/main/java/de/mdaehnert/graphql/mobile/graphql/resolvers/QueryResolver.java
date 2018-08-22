package de.mdaehnert.graphql.mobile.graphql.resolvers;

import de.mdaehnert.graphql.mobile.models.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import de.mdaehnert.graphql.mobile.models.User;

@Component
public class QueryResolver implements GraphQLQueryResolver {

  @Autowired
  UserRepo userRepo;

  public User getUser(int id) {
    return userRepo.getUser(id);
  }

}
