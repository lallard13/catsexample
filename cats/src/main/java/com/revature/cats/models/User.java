package com.revature.cats.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(schema = "cat", name = "users")
public class User {

  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  @Column(name = "username")
  private String username;
//  @Column(name = "password")
//  private String password;
  @OneToMany(mappedBy = "owner", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  @JsonIgnoreProperties({"owner"})
  private List<Cat> Cats;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }
  
  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<Cat> getCats() {
    return Cats;
  }

  public void setCats(List<Cat> cats) {
    Cats = cats;
  }

  @Override
  public String toString() {
    return "User [userId=" + userId + ", username=" + username + "]";
  }


}
