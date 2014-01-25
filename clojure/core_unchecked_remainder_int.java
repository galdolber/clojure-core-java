package clojure;

import clojure.lang.*;

public final class core_unchecked_remainder_int extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_remainder_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return Integer.valueOf(clojure.lang.Numbers.unchecked_int_remainder((int)RT.intCast(x1), (int)RT.intCast(y2)));
 }
}
