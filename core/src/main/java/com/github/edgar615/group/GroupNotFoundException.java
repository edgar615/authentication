package com.github.edgar615.group;

public class GroupNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public GroupNotFoundException() {
    super("group not found");
  }

}
