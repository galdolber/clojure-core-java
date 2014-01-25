package clojure;

import clojure.lang.*;

public final class zip_branch_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern("zip", "branch?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__2 = (clojure.lang.Var)RT.var("clojure.zip", "node");
 }
 public zip_branch_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  return ((IFn)RT.get(((IFn)const__1.getRawRoot()).invoke(loc1), Keyword.intern("zip", "branch?"))).invoke(((IFn)const__2.getRawRoot()).invoke(loc1));
 }
}
