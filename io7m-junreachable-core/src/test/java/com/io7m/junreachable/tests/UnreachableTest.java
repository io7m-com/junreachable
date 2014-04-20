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

package com.io7m.junreachable.tests;

import org.junit.Test;

import com.io7m.junreachable.UnreachableCodeException;

public final class UnreachableTest
{
  enum T
  {
    A,
    B,
    C
  }

  int f(
    final T t)
  {
    assert t != null;

    switch (t) {
      case A:
      {
        return 1;
      }
      case B:
      {
        return 2;
      }
      case C:
      {
        return 3;
      }
    }

    throw new UnreachableCodeException();
  }

  @Test public void testUnreachable()
  {
    System.out.println(this.f(T.A));
  }
}
