package clojure.core;

import clojure.lang.*;

public final class reducers_remove extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "filter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "complement");
 }
 public reducers_remove() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(pred1), coll2);
 }
 public java.lang.Object invoke(java.lang.Object pred1) {
  return new clojure.core.reducers_remove_fn__6700(pred1);
 }
}
