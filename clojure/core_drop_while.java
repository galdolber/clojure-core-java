package clojure;

import clojure.lang.*;

public final class core_drop_while extends clojure.lang.AFunction {
 static {
 }
 public core_drop_while() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  {
   Object step3 = new clojure.core_drop_while_step__4275();
   return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_drop_while_fn__4278(pred1, coll2, step3)));
  }
 }
}
