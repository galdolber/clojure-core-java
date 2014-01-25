package clojure;

import clojure.lang.*;

public final class core_fn__6299 extends clojure.lang.AFunction {
 static {
 }
 public core_fn__6299() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object vec1, java.lang.Object f2, java.lang.Object init3) {
  return ((java.lang.Object)((clojure.lang.PersistentVector)vec1).kvreduce((clojure.lang.IFn)((clojure.lang.IFn)f2), ((java.lang.Object)init3)));
 }
}
