package clojure.core;

import clojure.lang.*;

public final class reducers_map_fn__6679_fn__6680 extends clojure.lang.AFunction {
 static {
 }
 Object f11;
 Object f1;
 public reducers_map_fn__6679_fn__6680(final Object f11, final Object f1) {
  super();
  this.f11 = f11;
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  return ((IFn)this.f11).invoke(ret1, ((IFn)this.f1).invoke(k2, v3));
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  return ((IFn)this.f11).invoke(ret1, ((IFn)this.f1).invoke(v2));
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f11).invoke();
 }
}
