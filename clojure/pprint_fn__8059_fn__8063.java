package clojure;

import clojure.lang.*;

public final class pprint_fn__8059_fn__8063 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-format-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
 }
 public pprint_fn__8059_fn__8063() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__80644 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object subformat5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80644), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80644), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object vec__80657 = ((IFn)const__4.getRawRoot()).invoke(navigator6);
   Object subargs8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80657), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80657), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object sub_navigator10 = ((IFn)const__5.getRawRoot()).invoke(subargs8);
   ((IFn)const__6.getRawRoot()).invoke(subformat5, sub_navigator10, RT.get(params1, Keyword.intern(null, "base-args")));
   return navigator9;
  }
 }
}
