package clojure.core;

import clojure.lang.*;

public final class reducers_do_rfn_fn__6671 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "remove");
 }
 Object k2;
 public reducers_do_rfn_fn__6671(final Object k2) {
  super();
  this.k2 = k2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6670_SHARP_1) {
  Object __r4387 = ((IFn)const__0.getRawRoot()).invoke(p1__6670_SHARP_1);
  if (__r4387 != null && !(__r4387 == Boolean.FALSE)) {
   Object __r4388;
   Object __r4389 = ((IFn)const__1.getRawRoot()).invoke(p1__6670_SHARP_1);
   if (__r4389 != null && !(__r4389 == Boolean.FALSE)) {
    __r4388 = const__2.getRawRoot();
   } else {
    __r4388 = const__3.getRawRoot();
   }
   return ((IFn)__r4388).invoke(((IFn)const__4.getRawRoot()).invoke(RT.set(this.k2), p1__6670_SHARP_1));
  } else {
   return p1__6670_SHARP_1;
  }
 }
}
