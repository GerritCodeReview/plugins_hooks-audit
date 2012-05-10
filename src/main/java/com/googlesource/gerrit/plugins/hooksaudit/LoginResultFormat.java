package com.googlesource.gerrit.plugins.hooksaudit;

import com.google.gerrit.common.auth.userpass.LoginResult;

public class LoginResultFormat implements AuditFormatter<LoginResult> {

  public static final Class<LoginResult> CLASS = LoginResult.class;

  @Override
  public String format(LoginResult loginResult) {
    return String.format("%1$s %2$s", loginResult.success, loginResult.success
        ? "" : loginResult.getError());
  }
}
