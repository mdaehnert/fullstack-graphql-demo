package de.mdaehnert.graphql.mobile.models.repositories;

import de.mdaehnert.graphql.mobile.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepo extends Repository<User, Integer> {

  @Query("select t from User t where t.id = ?1")
  User getUser(int id);


}
