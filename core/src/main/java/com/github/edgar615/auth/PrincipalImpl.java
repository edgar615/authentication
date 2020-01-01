package com.github.edgar615.auth;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/13.
 */
public class PrincipalImpl implements Principal {

  private Long userId;

  private String username;

  private String name;

  private final Map<String, Object> ext = new HashMap<>();

  @Override
  public Map<String, Object> ext() {
    return ImmutableMap.copyOf(ext);
  }

  @Override
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  @Override
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addExt(String name, Object value) {
    this.ext.put(name, value);
  }
}
