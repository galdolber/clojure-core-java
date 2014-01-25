package clojure;

import clojure.lang.*;

public final class core_every_pred_ep3__6441_fn__6442 extends clojure.lang.AFunction {
 static {
 }
 Object p11;
 Object p22;
 Object p33;
 public core_every_pred_ep3__6441_fn__6442(final Object p11, final Object p22, final Object p33) {
  super();
  this.p11 = p11;
  this.p22 = p22;
  this.p33 = p33;
 }
 public java.lang.Object invoke(java.lang.Object p1__6415_SHARP_1) {
  {
   Object and__3966__auto__2 = ((IFn)this.p11).invoke(p1__6415_SHARP_1);
   Object __r4183 = and__3966__auto__2;
   if (__r4183 != null && !(__r4183 == Boolean.FALSE)) {
    {
     Object and__3966__auto__3 = ((IFn)this.p22).invoke(p1__6415_SHARP_1);
     Object __r4185 = and__3966__auto__3;
     if (__r4185 != null && !(__r4185 == Boolean.FALSE)) {
      return ((IFn)this.p33).invoke(p1__6415_SHARP_1);
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
