package clojure;

import clojure.lang.*;

public final class core_every_pred_ep2__6426_fn__6427 extends clojure.lang.AFunction {
 static {
 }
 Object p11;
 Object p22;
 public core_every_pred_ep2__6426_fn__6427(final Object p11, final Object p22) {
  super();
  this.p11 = p11;
  this.p22 = p22;
 }
 public java.lang.Object invoke(java.lang.Object p1__6414_SHARP_1) {
  {
   Object and__3966__auto__2 = ((IFn)this.p11).invoke(p1__6414_SHARP_1);
   Object __r4151 = and__3966__auto__2;
   if (__r4151 != null && !(__r4151 == Boolean.FALSE)) {
    return ((IFn)this.p22).invoke(p1__6414_SHARP_1);
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
