package de.mdaehnert.graphql.mobile.models.entities;

import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue
  private Integer id;

  // Lazy optimizes the request, because since GraphQL it will automatically load only the objects, which the client really requested.
  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private List<BlogPost> blogPosts;

  @Column
  private String name;

  @Column
  private String birthdate;


  public Integer getId() { return id; }
  public void setId(Integer id) { this.id = id; }

  public List<BlogPost> getBlogPosts() { return blogPosts; }
  public void setBlogPosts(List<BlogPost> blogPosts) { this.blogPosts = blogPosts; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getBirthdate() { return birthdate; }
  public void setBirthdate(String birthdate) { this.birthdate = birthdate; }
}
