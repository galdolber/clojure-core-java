package clojure;

import clojure.lang.*;

public final class core_some_fn_spn__6527_fn__6533 extends clojure.lang.AFunction {
 static {
 }
 Object x1;
 Object y2;
 Object z3;
 public core_some_fn_spn__6527_fn__6533(final Object x1, final Object y2, final Object z3) {
  super();
  this.x1 = x1;
  this.y2 = y2;
  this.z3 = z3;
 }
 public java.lang.Object invoke(java.lang.Object p1__6482_SHARP_1) {
  {
   Object or__3968__auto__2 = ((IFn)p1__6482_SHARP_1).invoke(this.x1);
   Object __r4312 = or__3968__auto__2;
   if (__r4312 != null && !(__r4312 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    {
     Object or__3968__auto__3 = ((IFn)p1__6482_SHARP_1).invoke(this.y2);
     Object __r4314 = or__3968__auto__3;
     if (__r4314 != null && !(__r4314 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      return ((IFn)p1__6482_SHARP_1).invoke(this.z3);
     }
    }
   }
  }
 }
}
