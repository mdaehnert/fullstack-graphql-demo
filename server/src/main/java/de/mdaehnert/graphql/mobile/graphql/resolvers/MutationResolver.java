package de.mdaehnert.graphql.mobile.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import de.mdaehnert.graphql.mobile.models.entities.BlogPost;
import de.mdaehnert.graphql.mobile.models.inputs.BlogPostInput;
import de.mdaehnert.graphql.mobile.models.repositories.BlogPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MutationResolver implements GraphQLMutationResolver {

  @Autowired
  BlogPostRepo blogPostRepo;

  public BlogPost addBlogPost(BlogPostInput input) {
    // Of course I should have been using some kind of mapper. But for the demonstration it was sufficient.
    // Why don't you try "JMapper". It will make your life easier.
    BlogPost blogPost = new BlogPost();
    blogPost.setSubject(input.getSubject());
    blogPost.setContent(input.getContent());

    return blogPostRepo.save(blogPost);
  }

}
