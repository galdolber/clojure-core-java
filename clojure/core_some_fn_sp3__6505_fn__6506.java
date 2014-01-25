package clojure;

import clojure.lang.*;

public final class core_some_fn_sp3__6505_fn__6506 extends clojure.lang.AFunction {
 static {
 }
 Object p11;
 Object p22;
 Object p33;
 public core_some_fn_sp3__6505_fn__6506(final Object p11, final Object p22, final Object p33) {
  super();
  this.p11 = p11;
  this.p22 = p22;
  this.p33 = p33;
 }
 public java.lang.Object invoke(java.lang.Object p1__6479_SHARP_1) {
  {
   Object or__3968__auto__2 = ((IFn)this.p11).invoke(p1__6479_SHARP_1);
   Object __r4274 = or__3968__auto__2;
   if (__r4274 != null && !(__r4274 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    {
     Object or__3968__auto__3 = ((IFn)this.p22).invoke(p1__6479_SHARP_1);
     Object __r4276 = or__3968__auto__3;
     if (__r4276 != null && !(__r4276 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      return ((IFn)this.p33).invoke(p1__6479_SHARP_1);
     }
    }
   }
  }
 }
}
