package clojure;

import clojure.lang.*;

public final class pprint_execute_format_fn__8201 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "abort?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "realize-parameter-list");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "unzip-map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "func");
 }
 public pprint_execute_format_fn__8201() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object element1, java.lang.Object context2) {
  Object __r5880 = ((IFn)const__0.getRawRoot()).invoke(context2);
  if (__r5880 != null && !(__r5880 == Boolean.FALSE)) {
   return RT.vector(null, context2);
  } else {
   {
    Object vec__82023 = ((IFn)const__1.getRawRoot()).invoke(RT.get(element1, Keyword.intern(null, "params")), context2);
    Object params4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82023), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object args5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82023), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object vec__82036 = ((IFn)const__6.getRawRoot()).invoke(params4);
    Object params7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82036), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object offsets8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__82036), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object params9 = ((IFn)const__7.getRawRoot()).invoke(params7, const__8, args5);
    return RT.vector(null, ((IFn)const__9.getRawRoot()).invoke(RT.get(element1, Keyword.intern(null, "func")), RT.vector(params9, args5, offsets8)));
   }
  }
 }
}
