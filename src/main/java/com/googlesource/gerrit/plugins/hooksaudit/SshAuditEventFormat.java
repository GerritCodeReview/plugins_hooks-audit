package com.googlesource.gerrit.plugins.hooksaudit;

import com.google.gerrit.audit.SshAuditEvent;

public class SshAuditEventFormat implements AuditFormatter<SshAuditEvent> {
  protected static final Class<?> CLASS = SshAuditEvent.class;

  @Override
  public String format(SshAuditEvent result) {
    return "SSH";
  }

}
