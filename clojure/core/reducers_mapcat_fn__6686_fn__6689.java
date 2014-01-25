package clojure.core;

import clojure.lang.*;

public final class reducers_mapcat_fn__6686_fn__6689 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "reduce");
 }
 Object f12;
 Object f1;
 public reducers_mapcat_fn__6686_fn__6689(final Object f12, final Object f1) {
  super();
  this.f12 = f12;
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f12, ret1, ((IFn)this.f1).invoke(k2, v3));
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f12, ret1, ((IFn)this.f1).invoke(v2));
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f12).invoke();
 }
}
