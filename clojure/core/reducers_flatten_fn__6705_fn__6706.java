package clojure.core;

import clojure.lang.*;

public final class reducers_flatten_fn__6705_fn__6706 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "flatten");
 }
 Object f11;
 public reducers_flatten_fn__6705_fn__6706(final Object f11) {
  super();
  this.f11 = f11;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  Object __r4397 = ((IFn)const__0.getRawRoot()).invoke(v2);
  if (__r4397 != null && !(__r4397 == Boolean.FALSE)) {
   Object __r4398 = ((IFn)const__2.getRawRoot()).invoke(v2);
   if (!(__r4398 instanceof clojure.core.protocols.CollReduce)) {
    return ((IFn)const__1.getRawRoot()).invoke(__r4398, this.f11, ret1);
   } else {
    return ((clojure.core.protocols.CollReduce) __r4398).coll_reduce(((java.lang.Object)this.f11), ((java.lang.Object)ret1));
   }
  } else {
   return ((IFn)this.f11).invoke(ret1, v2);
  }
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f11).invoke();
 }
}
