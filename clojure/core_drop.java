package clojure;

import clojure.lang.*;

public final class core_drop extends clojure.lang.AFunction {
 static {
 }
 public core_drop() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  {
   Object step3 = new clojure.core_drop_step__4265();
   return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_drop_fn__4268(step3, coll2, n1)));
  }
 }
}
