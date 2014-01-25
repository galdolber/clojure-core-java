package clojure.core;

import clojure.lang.*;

public final class reducers_filter_fn__6695_fn__6696 extends clojure.lang.AFunction {
 static {
 }
 Object f11;
 Object pred1;
 public reducers_filter_fn__6695_fn__6696(final Object f11, final Object pred1) {
  super();
  this.f11 = f11;
  this.pred1 = pred1;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  Object __r4393 = ((IFn)this.pred1).invoke(k2, v3);
  if (__r4393 != null && !(__r4393 == Boolean.FALSE)) {
   return ((IFn)this.f11).invoke(ret1, k2, v3);
  } else {
   return ret1;
  }
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  Object __r4395 = ((IFn)this.pred1).invoke(v2);
  if (__r4395 != null && !(__r4395 == Boolean.FALSE)) {
   return ((IFn)this.f11).invoke(ret1, v2);
  } else {
   return ret1;
  }
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f11).invoke();
 }
}
