package clojure;

import clojure.lang.*;

public final class core_find_var extends clojure.lang.AFunction {
 static {
 }
 public core_find_var() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sym1) {
  return ((clojure.lang.Var)clojure.lang.Var.find((clojure.lang.Symbol)((clojure.lang.Symbol)sym1)));
 }
}
