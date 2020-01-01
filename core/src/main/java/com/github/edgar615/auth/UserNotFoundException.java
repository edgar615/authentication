package com.github.edgar615.auth;

public class UserNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public UserNotFoundException() {
    super("user not found");
  }

}
