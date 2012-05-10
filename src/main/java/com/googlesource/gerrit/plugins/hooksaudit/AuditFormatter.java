package com.googlesource.gerrit.plugins.hooksaudit;

public abstract interface AuditFormatter {

  String format(Object result);
}
