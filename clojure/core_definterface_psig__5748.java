package clojure;

import clojure.lang.*;

public final class core_definterface_psig__5748 extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 Object tag5;
 public core_definterface_psig__5748(final Object tag5) {
  super();
  this.tag5 = tag5;
 }
 public java.lang.Object invoke(java.lang.Object p__57471) {
  {
   Object vec__57492 = p__57471;
   Object name3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57492), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__57504 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57492), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object args5 = ((IFn)const__3.getRawRoot()).invoke(vec__57504, const__1);
   return ((IFn)const__4.getRawRoot()).invoke(name3, ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this.tag5, args5)), ((IFn)this.tag5).invoke(name3), ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), args5));
  }
 }
}
