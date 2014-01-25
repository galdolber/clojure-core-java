package clojure;

import clojure.lang.*;

public final class core_mapcat extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_mapcat() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object colls2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(const__2.getRawRoot(), f1, colls2));
 }
 public int getRequiredArity() {
  return 1;
 }
}
