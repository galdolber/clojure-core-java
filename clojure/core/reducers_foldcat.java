package clojure.core;

import clojure.lang.*;

public final class reducers_foldcat extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fold");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.reducers", "cat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "append!");
 }
 public reducers_foldcat() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2.getRawRoot(), coll1);
 }
}
