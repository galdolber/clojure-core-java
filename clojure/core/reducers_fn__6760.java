package clojure.core;

import clojure.lang.*;

public final class reducers_fn__6760 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "reduce");
 }
 public reducers_fn__6760() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object n2, java.lang.Object combinef3, java.lang.Object reducef4) {
  return ((IFn)const__0.getRawRoot()).invoke(reducef4, ((IFn)combinef3).invoke(), coll1);
 }
}
