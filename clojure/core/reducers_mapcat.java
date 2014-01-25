package clojure.core;

import clojure.lang.*;

public final class reducers_mapcat extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "folder");
 }
 public reducers_mapcat() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(coll2, new clojure.core.reducers_mapcat_fn__6686(f1));
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return new clojure.core.reducers_mapcat_fn__6684(f1);
 }
}
