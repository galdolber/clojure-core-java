package clojure;

import clojure.lang.*;

public final class core_parse_opts_PLUS_specs_fn__5764 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "maybe-destructured");
 }
 public core_parse_opts_PLUS_specs_fn__5764() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__57631) {
  {
   Object vec__57652 = p__57631;
   Object name3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57652), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object params4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57652), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object body5 = ((IFn)const__3.getRawRoot()).invoke(vec__57652, const__4);
   return ((IFn)const__5.getRawRoot()).invoke(name3, ((IFn)const__6.getRawRoot()).invoke(params4, body5));
  }
 }
}
