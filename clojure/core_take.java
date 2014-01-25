package clojure;

import clojure.lang.*;

public final class core_take extends clojure.lang.AFunction {
 static {
 }
 public core_take() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_take_fn__4257(coll2, n1)));
 }
}
