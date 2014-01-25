package clojure;

import clojure.lang.*;

public final class core_sort_by extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sort-by");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "compare");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "sort");
 }
 public core_sort_by() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object keyfn1, java.lang.Object comp2, java.lang.Object coll3) {
  return ((IFn)const__2.getRawRoot()).invoke(new clojure.core_sort_by_fn__4325(keyfn1, comp2), coll3);
 }
 public java.lang.Object invoke(java.lang.Object keyfn1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(keyfn1, const__1.getRawRoot(), coll2);
 }
}
