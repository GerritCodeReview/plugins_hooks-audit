package com.googlesource.gerrit.plugins.hooksaudit;

public interface AuditFormatter<T> {

  String format(T result);
}
