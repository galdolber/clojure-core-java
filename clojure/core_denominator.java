package clojure;

import clojure.lang.*;

public final class core_denominator extends clojure.lang.AFunction {
 static {
 }
 public core_denominator() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object r1) {
  return ((java.math.BigInteger)((clojure.lang.Ratio)r1).denominator);
 }
}
