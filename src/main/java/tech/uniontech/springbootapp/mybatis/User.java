package tech.uniontech.springbootapp.mybatis;

import java.io.Serializable;

public class User implements Serializable{
  private Integer id;
  private String username;
  private Integer age;

  public Integer getAge() {
      return age;
  }

  public Integer getId() {
      return id;
  }

  public String getUsername() {
      return username;
  }
}
