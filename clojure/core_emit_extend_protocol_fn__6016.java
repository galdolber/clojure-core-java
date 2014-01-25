package clojure;

import clojure.lang.*;

public final class core_emit_extend_protocol_fn__6016 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "extend-type");
 }
 Object p1;
 public core_emit_extend_protocol_fn__6016(final Object p1) {
  super();
  this.p1 = p1;
 }
 public java.lang.Object invoke(java.lang.Object p__60151) {
  {
   Object vec__60172 = p__60151;
   Object t3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60172), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object fs4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60172), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6), ((IFn)const__5.getRawRoot()).invoke(t3), ((IFn)const__5.getRawRoot()).invoke(this.p1), fs4));
  }
 }
}
