package clojure;

import clojure.lang.*;

public final class core_case_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "sorted-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 public core_case_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object case_f1, java.lang.Object test_f2, java.lang.Object tests3, java.lang.Object thens4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(case_f1, tests3), ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(test_f2, tests3), thens4)));
 }
}
