package clojure;

import clojure.lang.*;

public final class core_filter extends clojure.lang.AFunction {
 static {
 }
 public core_filter() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_filter_fn__4251(coll2, pred1)));
 }
}
