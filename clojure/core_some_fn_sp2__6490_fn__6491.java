package clojure;

import clojure.lang.*;

public final class core_some_fn_sp2__6490_fn__6491 extends clojure.lang.AFunction {
 static {
 }
 Object p11;
 Object p22;
 public core_some_fn_sp2__6490_fn__6491(final Object p11, final Object p22) {
  super();
  this.p11 = p11;
  this.p22 = p22;
 }
 public java.lang.Object invoke(java.lang.Object p1__6478_SHARP_1) {
  {
   Object or__3968__auto__2 = ((IFn)this.p11).invoke(p1__6478_SHARP_1);
   Object __r4252 = or__3968__auto__2;
   if (__r4252 != null && !(__r4252 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return ((IFn)this.p22).invoke(p1__6478_SHARP_1);
   }
  }
 }
}
