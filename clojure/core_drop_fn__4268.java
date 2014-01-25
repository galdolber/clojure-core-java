package clojure;

import clojure.lang.*;

public final class core_drop_fn__4268 extends clojure.lang.AFunction {
 static {
 }
 Object step3;
 Object coll2;
 Object n1;
 public core_drop_fn__4268(final Object step3, final Object coll2, final Object n1) {
  super();
  this.step3 = step3;
  this.coll2 = coll2;
  this.n1 = n1;
 }
 public java.lang.Object invoke() {
  return ((IFn)this.step3).invoke(this.n1, this.coll2);
 }
}
