package clojure.core;

import clojure.lang.*;

public final class reducers_mapcat_fn__6686_f1__6687 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduced");
 }
 Object f11;
 public reducers_mapcat_fn__6686_f1__6687(final Object f11) {
  super();
  this.f11 = f11;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object k2, java.lang.Object v3) {
  {
   Object x4 = ((IFn)this.f11).invoke(ret1, k2, v3);
   if (clojure.lang.RT.isReduced(((java.lang.Object)x4))) {
    return ((IFn)const__1.getRawRoot()).invoke(x4);
   } else {
    return x4;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object v2) {
  {
   Object x3 = ((IFn)this.f11).invoke(ret1, v2);
   if (clojure.lang.RT.isReduced(((java.lang.Object)x3))) {
    return ((IFn)const__1.getRawRoot()).invoke(x3);
   } else {
    return x3;
   }
  }
 }
}
