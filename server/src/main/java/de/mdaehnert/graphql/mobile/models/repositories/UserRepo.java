package de.mdaehnert.graphql.mobile.models.repositories;

import de.mdaehnert.graphql.mobile.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

}
