package clojure;

import clojure.lang.*;

public final class set_join_fn__6901 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.set", "rename-keys");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "select-keys");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 Object k7;
 Object idx8;
 public set_join_fn__6901(final Object k7, final Object idx8) {
  super();
  this.k7 = k7;
  this.idx8 = idx8;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object x2) {
  {
   Object found3 = ((IFn)this.idx8).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(x2, ((IFn)const__2.getRawRoot()).invoke(this.k7)), this.k7));
   Object __r4504 = found3;
   if (__r4504 != null && !(__r4504 == Boolean.FALSE)) {
    return ((IFn)const__3.getRawRoot()).invoke(new clojure.set_join_fn__6901_fn__6902(x2), ret1, found3);
   } else {
    return ret1;
   }
  }
 }
}
