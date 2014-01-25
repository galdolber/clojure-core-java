package clojure;

import clojure.lang.*;

public final class core_drop_while_fn__4278 extends clojure.lang.AFunction {
 static {
 }
 Object pred1;
 Object coll2;
 Object step3;
 public core_drop_while_fn__4278(final Object pred1, final Object coll2, final Object step3) {
  super();
  this.pred1 = pred1;
  this.coll2 = coll2;
  this.step3 = step3;
 }
 public java.lang.Object invoke() {
  return ((IFn)this.step3).invoke(this.pred1, this.coll2);
 }
}
