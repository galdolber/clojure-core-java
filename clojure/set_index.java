package clojure;

import clojure.lang.*;

public final class set_index extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 public set_index() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object xrel1, java.lang.Object ks2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.set_index_fn__6883(ks2), clojure.lang.PersistentArrayMap.EMPTY, xrel1);
 }
}
