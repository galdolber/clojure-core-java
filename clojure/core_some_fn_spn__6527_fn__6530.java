package clojure;

import clojure.lang.*;

public final class core_some_fn_spn__6527_fn__6530 extends clojure.lang.AFunction {
 static {
 }
 Object x1;
 Object y2;
 public core_some_fn_spn__6527_fn__6530(final Object x1, final Object y2) {
  super();
  this.x1 = x1;
  this.y2 = y2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6481_SHARP_1) {
  {
   Object or__3968__auto__2 = ((IFn)p1__6481_SHARP_1).invoke(this.x1);
   Object __r4310 = or__3968__auto__2;
   if (__r4310 != null && !(__r4310 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return ((IFn)p1__6481_SHARP_1).invoke(this.y2);
   }
  }
 }
}
