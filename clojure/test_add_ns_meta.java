package clojure;

import clojure.lang.*;

public final class test_add_ns_meta extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "alter-meta!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public test_add_ns_meta() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object key1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), const__2.getRawRoot(), key1, coll2);
 }
}
