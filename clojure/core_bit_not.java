package clojure;

import clojure.lang.*;

public final class core_bit_not extends clojure.lang.AFunction {
 static {
 }
 public core_bit_not() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Numbers.num(clojure.lang.Numbers.not(((java.lang.Object)x1)));
 }
}
