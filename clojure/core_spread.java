package clojure;

import clojure.lang.*;

public final class core_spread extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "spread");
 }
 public core_spread() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object arglist1) {
  if (clojure.lang.Util.identical(((java.lang.Object)arglist1), ((java.lang.Object)null))) {
   return null;
  } else {
   if (clojure.lang.Util.identical(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(arglist1)), ((java.lang.Object)null))) {
    return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(arglist1));
   } else {
    Object __r2321 = const__4;
    if (__r2321 != null && !(__r2321 == Boolean.FALSE)) {
     return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(arglist1), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(arglist1)));
    } else {
     return null;
    }
   }
  }
 }
}
