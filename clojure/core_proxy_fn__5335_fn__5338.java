package clojure;

import clojure.lang.*;

public final class core_proxy_fn__5335_fn__5338 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Symbol const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "this");
 }
 public core_proxy_fn__5335_fn__5338() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__53371) {
  {
   Object vec__53392 = p__53371;
   Object params3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53392), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object body4 = ((IFn)const__2.getRawRoot()).invoke(vec__53392, const__3);
   return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), const__7, params3), body4);
  }
 }
}
