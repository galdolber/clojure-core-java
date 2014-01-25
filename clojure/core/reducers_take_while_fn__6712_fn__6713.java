package clojure.core;

import clojure.lang.*;

public final class reducers_take_while_fn__6712_fn__6713 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduced");
 }
 Object pred1;
 Object f11;
 public reducers_take_while_fn__6712_fn__6713(final Object pred1, final Object f11) {
  super();
  this.pred1 = pred1;
  this.f11 = f11;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  Object __r4400 = ((IFn)this.pred1).invoke(k2, v3);
  if (__r4400 != null && !(__r4400 == Boolean.FALSE)) {
   return ((IFn)this.f11).invoke(ret1, k2, v3);
  } else {
   return ((IFn)const__0.getRawRoot()).invoke(ret1);
  }
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  Object __r4402 = ((IFn)this.pred1).invoke(v2);
  if (__r4402 != null && !(__r4402 == Boolean.FALSE)) {
   return ((IFn)this.f11).invoke(ret1, v2);
  } else {
   return ((IFn)const__0.getRawRoot()).invoke(ret1);
  }
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f11).invoke();
 }
}
