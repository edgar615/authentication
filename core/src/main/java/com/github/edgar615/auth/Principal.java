package com.github.edgar615.auth;

import java.util.Map;

/**
 * 用户的接口
 * Created by Administrator on 2017/11/13.
 */
public interface Principal {

  /**
   * 返回用户ID
   * @return 用户ID
   */
  Long getUserId();

  /**
   * 返回用户名
   * @return 用户名
   */
  String getUsername();

  /**
   * 返回用户姓名
   * @return 用户姓名
   */
  String getName();

  Map<String, Object> ext();
}
