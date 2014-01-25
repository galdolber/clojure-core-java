package clojure;

import clojure.lang.*;

public final class core_unchecked_int extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Integer.valueOf(clojure.lang.RT.uncheckedIntCast(((java.lang.Object)x1)));
 }
}
