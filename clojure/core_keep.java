package clojure;

import clojure.lang.*;

public final class core_keep extends clojure.lang.AFunction {
 static {
 }
 public core_keep() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_keep_fn__6402(f1, coll2)));
 }
}
