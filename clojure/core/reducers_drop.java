package clojure.core;

import clojure.lang.*;

public final class reducers_drop extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "reducer");
 }
 public reducers_drop() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(coll2, new clojure.core.reducers_drop_fn__6726(n1));
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return new clojure.core.reducers_drop_fn__6724(n1);
 }
}
