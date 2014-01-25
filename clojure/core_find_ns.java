package clojure;

import clojure.lang.*;

public final class core_find_ns extends clojure.lang.AFunction {
 static {
 }
 public core_find_ns() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sym1) {
  return ((clojure.lang.Namespace)clojure.lang.Namespace.find((clojure.lang.Symbol)((clojure.lang.Symbol)sym1)));
 }
}
