package clojure;

import clojure.lang.*;

public final class core_bit_clear extends clojure.lang.AFunction {
 static {
 }
 public core_bit_clear() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object n2) {
  return Numbers.num(clojure.lang.Numbers.clearBit(((java.lang.Object)x1), ((java.lang.Object)n2)));
 }
}
