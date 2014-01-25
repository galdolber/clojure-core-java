package clojure;

import clojure.lang.*;

public final class core_take_while extends clojure.lang.AFunction {
 static {
 }
 public core_take_while() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_take_while_fn__4261(pred1, coll2)));
 }
}
