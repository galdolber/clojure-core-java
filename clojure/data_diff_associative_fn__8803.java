package clojure;

import clojure.lang.*;

public final class data_diff_associative_fn__8803 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "doall");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "merge");
 }
 public data_diff_associative_fn__8803() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object diff11, java.lang.Object diff22) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), diff11, diff22));
 }
}
