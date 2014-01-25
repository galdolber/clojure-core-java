package clojure;

import clojure.lang.*;

public final class core_emit_hinted_impl_hint__6001_fn__6003 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
 }
 Object c1;
 public core_emit_hinted_impl_hint__6001_fn__6003(final Object c1) {
  super();
  this.c1 = c1;
 }
 public java.lang.Object invoke(java.lang.Object p__60021) {
  {
   Object vec__60042 = p__60021;
   Object vec__60053 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60042), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object target4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60053), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object args5 = ((IFn)const__2.getRawRoot()).invoke(vec__60053, const__3);
   Object body6 = ((IFn)const__2.getRawRoot()).invoke(vec__60042, const__3);
   return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__7.getRawRoot()).invoke(target4, const__8.getRawRoot(), const__9, this.c1), args5), body6);
  }
 }
}
