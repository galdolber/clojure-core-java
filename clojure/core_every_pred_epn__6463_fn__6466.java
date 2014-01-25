package clojure;

import clojure.lang.*;

public final class core_every_pred_epn__6463_fn__6466 extends clojure.lang.AFunction {
 static {
 }
 Object x1;
 Object y2;
 public core_every_pred_epn__6463_fn__6466(final Object x1, final Object y2) {
  super();
  this.x1 = x1;
  this.y2 = y2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6417_SHARP_1) {
  {
   Object and__3966__auto__2 = ((IFn)p1__6417_SHARP_1).invoke(this.x1);
   Object __r4235 = and__3966__auto__2;
   if (__r4235 != null && !(__r4235 == Boolean.FALSE)) {
    return ((IFn)p1__6417_SHARP_1).invoke(this.y2);
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
