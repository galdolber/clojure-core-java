package clojure;

import clojure.lang.*;

public final class core_int extends clojure.lang.AFunction {
 static {
 }
 public core_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)x1)));
 }
}
