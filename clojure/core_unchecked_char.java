package clojure;

import clojure.lang.*;

public final class core_unchecked_char extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_char() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Character.valueOf(clojure.lang.RT.uncheckedCharCast(((java.lang.Object)x1)));
 }
}
