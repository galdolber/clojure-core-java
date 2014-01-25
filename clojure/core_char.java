package clojure;

import clojure.lang.*;

public final class core_char extends clojure.lang.AFunction {
 static {
 }
 public core_char() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Character.valueOf(clojure.lang.RT.charCast(((java.lang.Object)x1)));
 }
}
