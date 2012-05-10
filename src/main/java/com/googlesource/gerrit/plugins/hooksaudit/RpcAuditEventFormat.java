package com.googlesource.gerrit.plugins.hooksaudit;

import com.google.gerrit.audit.HttpAuditEvent;
import com.google.gerrit.audit.RpcAuditEvent;

public class RpcAuditEventFormat implements AuditFormatter<HttpAuditEvent> {
  protected static final Class<?> CLASS = RpcAuditEvent.class;

  @Override
  public String format(HttpAuditEvent result) {
    return "RPC-" + result.httpMethod + ", Status:" + result.httpStatus;
  }
}
