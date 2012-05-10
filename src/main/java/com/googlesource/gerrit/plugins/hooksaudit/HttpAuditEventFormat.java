package com.googlesource.gerrit.plugins.hooksaudit;

import com.google.gerrit.audit.HttpAuditEvent;

public class HttpAuditEventFormat implements AuditFormatter<HttpAuditEvent> {
  protected static final Class<?> CLASS = HttpAuditEvent.class;

  @Override
  public String format(HttpAuditEvent result) {
    return "HTTP-" + result.httpMethod + ", Status:" + result.httpStatus;
  }
}
