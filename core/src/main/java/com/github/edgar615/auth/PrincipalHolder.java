package com.github.edgar615.auth;

public class PrincipalHolder {

  private static final ThreadLocal<Principal> PRINCIPAL_HOLDER = new ThreadLocal<>();

  private PrincipalHolder() {
    throw new AssertionError("Not instantiable: " + PrincipalHolder.class);
  }

  public static void set(Principal principal) {
    PRINCIPAL_HOLDER.set(principal);
  }

  public static Principal get() {
    return PRINCIPAL_HOLDER.get();
  }

  public static Principal getAndCheck() {
    Principal principal = PRINCIPAL_HOLDER.get();
    if (principal == null) {
      throw new UserNotFoundException();
    }
    return principal;
  }

  public static void clear() {
    PRINCIPAL_HOLDER.remove();
  }

}
