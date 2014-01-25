package clojure;

import clojure.lang.*;

public final class core_create_ns extends clojure.lang.AFunction {
 static {
 }
 public core_create_ns() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sym1) {
  return ((clojure.lang.Namespace)clojure.lang.Namespace.findOrCreate((clojure.lang.Symbol)((clojure.lang.Symbol)sym1)));
 }
}
