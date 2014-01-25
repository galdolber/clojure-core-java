package clojure;

import clojure.lang.*;

public final class core_assert_valid_fdecl_fn__6544 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object fdecl1;
 public core_assert_valid_fdecl_fn__6544(final Object fdecl1) {
  super();
  this.fdecl1 = fdecl1;
 }
 public java.lang.Object invoke(java.lang.Object p1__6542_SHARP_1) {
  Object __r4318 = ((IFn)const__0.getRawRoot()).invoke(p1__6542_SHARP_1);
  if (__r4318 != null && !(__r4318 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(p1__6542_SHARP_1);
  } else {
   Object __r4319;
   Object __r4320 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.fdecl1));
   if (__r4320 != null && !(__r4320 == Boolean.FALSE)) {
    __r4319 = ((IFn)const__2.getRawRoot()).invoke("Invalid signature ", p1__6542_SHARP_1, " should be a list");
   } else {
    __r4319 = ((IFn)const__2.getRawRoot()).invoke("Parameter declaration ", p1__6542_SHARP_1, " should be a vector");
   }
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)__r4319)));
   return null;
  }
 }
}
