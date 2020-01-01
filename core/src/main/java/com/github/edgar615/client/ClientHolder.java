package com.github.edgar615.client;

public class ClientHolder {

  private static final ThreadLocal<AppInfo> CLIENT_HOLDER = new ThreadLocal<>();

  private ClientHolder() {
    throw new AssertionError("Not instantiable: " + ClientHolder.class);
  }

  public static void set(AppInfo principal) {
    CLIENT_HOLDER.set(principal);
  }

  public static AppInfo get() {
    return CLIENT_HOLDER.get();
  }

  public static AppInfo getAndCheck() {
    AppInfo appInfo = CLIENT_HOLDER.get();
    if (appInfo == null) {
      throw new AppNotFoundException();
    }
    return appInfo;
  }

  public static void clear() {
    CLIENT_HOLDER.remove();
  }

}
