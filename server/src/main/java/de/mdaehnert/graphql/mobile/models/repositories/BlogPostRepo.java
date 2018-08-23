package de.mdaehnert.graphql.mobile.models.repositories;

import de.mdaehnert.graphql.mobile.models.entities.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepo extends CrudRepository<BlogPost, Integer> {

}
