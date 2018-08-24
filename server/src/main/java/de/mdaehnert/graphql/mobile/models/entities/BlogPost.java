package de.mdaehnert.graphql.mobile.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "blogpost")
public class BlogPost {

  @Id
  @GeneratedValue
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  private User user;

  @Column
  private String createdAt;

  @Column
  private String subject;

  @Column
  private String content;


  public Integer getId() { return id; }
  public void setId(Integer id) { this.id = id; }

  public User getUser() { return user; }
  public void setUser(User user) { this.user = user; }

  public String getCreatedAt() { return createdAt; }
  public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

  public String getSubject() { return subject; }
  public void setSubject(String subject) { this.subject = subject; }

  public String getContent() { return content; }
  public void setContent(String content) { this.content = content; }

}
