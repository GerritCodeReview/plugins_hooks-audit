package com.googlesource.gerrit.plugins.hooksaudit;

import com.google.gerrit.audit.AuditEvent;
import com.google.gerrit.audit.SshAuditEvent;

public class AuditEventFormat implements AuditFormatter<SshAuditEvent> {
  public static final Class<?> CLASS = AuditEvent.class;
  
  @Override
  public String format(SshAuditEvent result) {
    return "";
  }

}
