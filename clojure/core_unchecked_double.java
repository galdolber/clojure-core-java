package clojure;

import clojure.lang.*;

public final class core_unchecked_double extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_double() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Double.valueOf(clojure.lang.RT.uncheckedDoubleCast(((java.lang.Object)x1)));
 }
}
