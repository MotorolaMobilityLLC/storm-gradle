package com.corp.base.lang;

import com.google.common.base.Preconditions;

import javax.annotation.Nullable;

/** Methods manipulating objects. */
public final class ObjectUtil {

  private ObjectUtil() {}

  /**
   * Returns value but if null then returns not null default value.
   * NOTE: do not use this method if defaultValue requires processing as it will force evaluation.
   */
  public static <E> E valueElseDefault(@Nullable E value, E defaultValue) {
    return value != null ? value : Preconditions.checkNotNull(defaultValue);
  }
}
