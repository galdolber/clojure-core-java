package clojure;

import clojure.lang.*;

public final class core_mapv_fn__6317 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj!");
 }
 Object f1;
 public core_mapv_fn__6317(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object o2) {
  return ((IFn)const__0.getRawRoot()).invoke(v1, ((IFn)this.f1).invoke(o2));
 }
}
