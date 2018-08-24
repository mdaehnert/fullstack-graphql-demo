package de.mdaehnert.graphql.mobile.models.inputs;

public class BlogPostInput {

  private String subject;
  private String content;
  private int userId;


  public String getSubject() { return subject; }
  public void setSubject(String subject) { this.subject = subject; }

  public String getContent() { return content; }
  public void setContent(String content) { this.content = content; }

  public int getUserId() { return userId; }
  public void setUserId(int userId) { this.userId = userId; }

}
