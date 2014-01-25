package clojure;

import clojure.lang.*;

public final class pprint_table_ize extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
 }
 public pprint_table_ize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object m2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(new clojure.pprint_table_ize_fn__7610(t1), m2));
 }
}
