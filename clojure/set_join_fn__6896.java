package clojure;

import clojure.lang.*;

public final class set_join_fn__6896 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "select-keys");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 Object ks4;
 Object idx8;
 public set_join_fn__6896(final Object ks4, final Object idx8) {
  super();
  this.ks4 = ks4;
  this.idx8 = idx8;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object x2) {
  {
   Object found3 = ((IFn)this.idx8).invoke(((IFn)const__0.getRawRoot()).invoke(x2, this.ks4));
   Object __r4502 = found3;
   if (__r4502 != null && !(__r4502 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(new clojure.set_join_fn__6896_fn__6897(x2), ret1, found3);
   } else {
    return ret1;
   }
  }
 }
}
