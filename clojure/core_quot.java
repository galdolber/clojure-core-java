package clojure;

import clojure.lang.*;

public final class core_quot extends clojure.lang.AFunction {
 static {
 }
 public core_quot() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1, java.lang.Object div2) {
  return ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)num1), ((java.lang.Object)div2)));
 }
}
