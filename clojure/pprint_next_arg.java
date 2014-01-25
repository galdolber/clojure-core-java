package clojure;

import clojure.lang.*;

public final class pprint_next_arg extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "arg-navigator");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
 }
 public pprint_next_arg() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object navigator1) {
  {
   Object rst2 = RT.get(navigator1, Keyword.intern(null, "rest"));
   Object __r5052 = rst2;
   if (__r5052 != null && !(__r5052 == Boolean.FALSE)) {
    return RT.vector(((IFn)const__1.getRawRoot()).invoke(rst2), ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), RT.get(navigator1, Keyword.intern(null, "seq")), ((IFn)const__5.getRawRoot()).invoke(rst2), ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)RT.get(navigator1, Keyword.intern(null, "pos")))))));
   } else {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Not enough arguments for format definition")));
    return null;
   }
  }
 }
}
