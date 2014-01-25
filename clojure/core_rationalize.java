package clojure;

import clojure.lang.*;

public final class core_rationalize extends clojure.lang.AFunction {
 static {
 }
 public core_rationalize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1) {
  return ((java.lang.Number)clojure.lang.Numbers.rationalize((java.lang.Number)((java.lang.Number)num1)));
 }
}
