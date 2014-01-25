package clojure;

import clojure.lang.*;

public final class data_diff_associative extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.IPersistentStack const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__1 = (clojure.lang.IPersistentStack)RT.vector(null, null, null);
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "partial");
  const__4 = (clojure.lang.Var)RT.var("clojure.data", "diff-associative-key");
 }
 public data_diff_associative() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object ks3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.data_diff_associative_fn__8803(), const__1, ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), a1, b2), ks3));
 }
}
