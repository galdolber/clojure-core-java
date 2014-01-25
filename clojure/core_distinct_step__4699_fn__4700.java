package clojure;

import clojure.lang.*;

public final class core_distinct_step__4699_fn__4700 extends clojure.lang.AFunction {
 static {
 }
 Object seen2;
 Object xs1;
 Object step0;
 public core_distinct_step__4699_fn__4700(final Object seen2, final Object xs1, final Object step0) {
  super();
  this.seen2 = seen2;
  this.xs1 = xs1;
  this.step0 = step0;
 }
 public java.lang.Object invoke() {
  return ((IFn)new clojure.core_distinct_step__4699_fn__4700_fn__4702(this.step0)).invoke(this.xs1, this.seen2);
 }
}
