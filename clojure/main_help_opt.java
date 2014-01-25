package clojure;

import clojure.lang.*;

public final class main_help_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.main", "main");
 }
 public main_help_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _1, java.lang.Object _2) {
  return ((IFn)const__0.getRawRoot()).invoke(RT.get(((IFn)const__2.getRawRoot()).invoke(const__3), Keyword.intern(null, "doc")));
 }
}
