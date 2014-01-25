package clojure;

import clojure.lang.*;

public final class core_cycle extends clojure.lang.AFunction {
 static {
 }
 public core_cycle() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_cycle_fn__4281(coll1)));
 }
}
