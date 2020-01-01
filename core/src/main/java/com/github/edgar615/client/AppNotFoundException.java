package com.github.edgar615.client;

public class AppNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public AppNotFoundException() {
    super("application not found");
  }

}
