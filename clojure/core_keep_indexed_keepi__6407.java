package clojure;

import clojure.lang.*;

public final class core_keep_indexed_keepi__6407 extends clojure.lang.AFunction {
 static {
 }
 Object f1;
 public core_keep_indexed_keepi__6407(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object idx1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_keep_indexed_keepi__6407_fn__6408(this.f1, coll2, this, idx1)));
 }
}
