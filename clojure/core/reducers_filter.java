package clojure.core;

import clojure.lang.*;

public final class reducers_filter extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "folder");
 }
 public reducers_filter() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(coll2, new clojure.core.reducers_filter_fn__6695(pred1));
 }
 public java.lang.Object invoke(java.lang.Object pred1) {
  return new clojure.core.reducers_filter_fn__6693(pred1);
 }
}
