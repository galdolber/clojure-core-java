package clojure;

import clojure.lang.*;

public final class pprint_get_format_arg extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__5 = (java.lang.Object)java.lang.String.class;
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "compile-format");
 }
 public pprint_get_format_arg() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object navigator1) {
  {
   Object vec__76642 = ((IFn)const__0.getRawRoot()).invoke(navigator1);
   Object raw_format3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76642), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76642), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5055;
   if ((raw_format3 instanceof java.lang.String)) {
    __r5055 = ((IFn)const__6.getRawRoot()).invoke(raw_format3);
   } else {
    __r5055 = raw_format3;
   }
   Object compiled_format5 = __r5055;
   return RT.vector(compiled_format5, navigator4);
  }
 }
}
