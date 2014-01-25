package clojure;

import clojure.lang.*;

public final class core_map_indexed_mapi__6395 extends clojure.lang.AFunction {
 static {
 }
 Object f1;
 public core_map_indexed_mapi__6395(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object idx1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_map_indexed_mapi__6395_fn__6396(coll2, this, idx1, this.f1)));
 }
}
