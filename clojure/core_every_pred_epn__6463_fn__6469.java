package clojure;

import clojure.lang.*;

public final class core_every_pred_epn__6463_fn__6469 extends clojure.lang.AFunction {
 static {
 }
 Object x1;
 Object y2;
 Object z3;
 public core_every_pred_epn__6463_fn__6469(final Object x1, final Object y2, final Object z3) {
  super();
  this.x1 = x1;
  this.y2 = y2;
  this.z3 = z3;
 }
 public java.lang.Object invoke(java.lang.Object p1__6418_SHARP_1) {
  {
   Object and__3966__auto__2 = ((IFn)p1__6418_SHARP_1).invoke(this.x1);
   Object __r4237 = and__3966__auto__2;
   if (__r4237 != null && !(__r4237 == Boolean.FALSE)) {
    {
     Object and__3966__auto__3 = ((IFn)p1__6418_SHARP_1).invoke(this.y2);
     Object __r4239 = and__3966__auto__3;
     if (__r4239 != null && !(__r4239 == Boolean.FALSE)) {
      return ((IFn)p1__6418_SHARP_1).invoke(this.z3);
     } else {
      return and__3966__auto__3;
     }
    }
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
