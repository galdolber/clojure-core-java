package clojure;

import clojure.lang.*;

public final class core_unchecked_add extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_add() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((java.lang.Number)clojure.lang.Numbers.unchecked_add(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
}
