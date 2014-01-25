package clojure;

import clojure.lang.*;

public final class core_merge_fn__4301 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_merge_fn__4301() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4299_SHARP_1, java.lang.Object p2__4300_SHARP_2) {
  Object __r2533 = null;
  {
   Object or__3968__auto__3 = p1__4299_SHARP_1;
   Object __r2534;
   Object __r2535 = or__3968__auto__3;
   if (__r2535 != null && !(__r2535 == Boolean.FALSE)) {
    __r2534 = or__3968__auto__3;
   } else {
    __r2534 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   __r2533 = __r2534;
  }
  return ((IFn)const__0.getRawRoot()).invoke(__r2533, p2__4300_SHARP_2);
 }
}
