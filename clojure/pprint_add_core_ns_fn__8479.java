package clojure;

import clojure.lang.*;

public final class pprint_add_core_ns_fn__8479 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "namespace");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "special-symbol?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "name");
 }
 Object core2;
 public pprint_add_core_ns_fn__8479(final Object core2) {
  super();
  this.core2 = core2;
 }
 public java.lang.Object invoke(java.lang.Object p1__8478_SHARP_1) {
  {
   Object vec__84802 = p1__8478_SHARP_1;
   Object s3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__84802), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object f4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__84802), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r6198 = null;
   {
    Object or__3968__auto__5 = ((IFn)const__4.getRawRoot()).invoke(s3);
    Object __r6199;
    Object __r6200 = or__3968__auto__5;
    if (__r6200 != null && !(__r6200 == Boolean.FALSE)) {
     __r6199 = or__3968__auto__5;
    } else {
     __r6199 = ((IFn)const__5.getRawRoot()).invoke(s3);
    }
    __r6198 = __r6199;
   }
   Object __r6201 = ((IFn)const__3.getRawRoot()).invoke(__r6198);
   if (__r6201 != null && !(__r6201 == Boolean.FALSE)) {
    return RT.vector(((IFn)const__6.getRawRoot()).invoke(this.core2, ((IFn)const__7.getRawRoot()).invoke(s3)), f4);
   } else {
    return p1__8478_SHARP_1;
   }
  }
 }
}
