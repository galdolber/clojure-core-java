package clojure;

import clojure.lang.*;

public final class core_filterv extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "persistent!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "transient");
 }
 public core_filterv() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core_filterv_fn__6320(pred1), ((IFn)const__2.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY), coll2));
 }
}
