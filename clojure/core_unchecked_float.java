package clojure;

import clojure.lang.*;

public final class core_unchecked_float extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_float() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Float.valueOf(clojure.lang.RT.uncheckedFloatCast(((java.lang.Object)x1)));
 }
}
