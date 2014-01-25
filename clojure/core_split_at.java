package clojure;

import clojure.lang.*;

public final class core_split_at extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "drop");
 }
 public core_split_at() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(n1, coll2), ((IFn)const__1.getRawRoot()).invoke(n1, coll2));
 }
}
