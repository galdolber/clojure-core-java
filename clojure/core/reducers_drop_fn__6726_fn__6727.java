package clojure.core;

import clojure.lang.*;

public final class reducers_drop_fn__6726_fn__6727 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "swap!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 Object f11;
 Object cnt2;
 public reducers_drop_fn__6726_fn__6727(final Object f11, final Object cnt2) {
  super();
  this.f11 = f11;
  this.cnt2 = cnt2;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  ((IFn)const__0.getRawRoot()).invoke(this.cnt2, const__1.getRawRoot());
  if (clojure.lang.Numbers.isNeg(((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(this.cnt2)))) {
   return ((IFn)this.f11).invoke(ret1, k2, v3);
  } else {
   return ret1;
  }
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  ((IFn)const__0.getRawRoot()).invoke(this.cnt2, const__1.getRawRoot());
  if (clojure.lang.Numbers.isNeg(((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(this.cnt2)))) {
   return ((IFn)this.f11).invoke(ret1, v2);
  } else {
   return ret1;
  }
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f11).invoke();
 }
}
