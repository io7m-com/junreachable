/*
 * Copyright © 2014 <code@io7m.com> http://io7m.com
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.junreachable;

/**
 * <p>
 * The type of exceptions thrown upon reaching code that was expected to be
 * unreachable.
 * </p>
 * <p>
 * As correctly written programs should never raise exceptions of this type,
 * their use in code is intended to document the fact that a statement is
 * expected to be unreachable (but that the compiler cannot prove is actually
 * unreachable).
 * </p>
 */

public final class UnreachableCodeException extends RuntimeException
{
  private static final long serialVersionUID = 8833315566898771380L;

  /**
   * Construct a new exception without a specific cause.
   */

  public UnreachableCodeException()
  {
    super("Unexpectedly reached unreachable code: report this bug");
  }

  /**
   * Construct a new exception with the given cause.
   * 
   * @param x
   *          The cause
   */

  public UnreachableCodeException(
    final Throwable x)
  {
    super("Unexpectedly reached unreachable code: report this bug", x);
  }
}
