package clojure;

import clojure.lang.*;

public final class core_bit_shift_left extends clojure.lang.AFunction {
 static {
 }
 public core_bit_shift_left() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object n2) {
  return Numbers.num(clojure.lang.Numbers.shiftLeft(((java.lang.Object)x1), ((java.lang.Object)n2)));
 }
}
