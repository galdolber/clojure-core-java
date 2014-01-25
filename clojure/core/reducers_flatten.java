package clojure.core;

import clojure.lang.*;

public final class reducers_flatten extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "folder");
 }
 public reducers_flatten() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(coll1, new clojure.core.reducers_flatten_fn__6705());
 }
 public java.lang.Object invoke() {
  return new clojure.core.reducers_flatten_fn__6703();
 }
}
