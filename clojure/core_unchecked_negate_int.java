package clojure;

import clojure.lang.*;

public final class core_unchecked_negate_int extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_negate_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Integer.valueOf(clojure.lang.Numbers.unchecked_int_negate((int)RT.intCast(x1)));
 }
}
