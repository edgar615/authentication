package com.github.edgar615.group;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/13.
 */
public interface GroupInfo {

  Long getGroupId();

  String getName();

  Map<String, Object> ext();
}