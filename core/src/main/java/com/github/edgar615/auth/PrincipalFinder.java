package com.github.edgar615.auth;

/**
 * 查找用户信息
 */
@Deprecated
public interface PrincipalFinder {

  /**
   * 根据身份标识查询用户信息
   * @param identifer 身份标识
   * @return 用户信息
   */
  Principal find(String identifer);
}
