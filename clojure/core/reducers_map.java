package clojure.core;

import clojure.lang.*;

public final class reducers_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "folder");
 }
 public reducers_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(coll2, new clojure.core.reducers_map_fn__6679(f1));
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return new clojure.core.reducers_map_fn__6677(f1);
 }
}
