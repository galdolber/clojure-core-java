package clojure;

import clojure.lang.*;

public final class core_frequencies extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "persistent!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "transient");
 }
 public core_frequencies() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core_frequencies_fn__6379(), ((IFn)const__2.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY), coll1));
 }
}
