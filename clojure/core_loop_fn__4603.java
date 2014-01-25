package clojure;

import clojure.lang.*;

public final class core_loop_fn__4603 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_loop_fn__4603() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object p__46022) {
  {
   Object vec__46043 = p__46022;
   Object b4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46043), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46043), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object g6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46043), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object __r2858 = ((IFn)const__4.getRawRoot()).invoke(b4);
   if (__r2858 != null && !(__r2858 == Boolean.FALSE)) {
    return ((IFn)const__5.getRawRoot()).invoke(ret1, g6, v5);
   } else {
    return ((IFn)const__5.getRawRoot()).invoke(ret1, g6, v5, b4, g6);
   }
  }
 }
}
