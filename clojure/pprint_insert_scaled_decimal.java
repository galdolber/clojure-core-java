package clojure;

import clojure.lang.*;

public final class pprint_insert_scaled_decimal extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__3 = (java.lang.Object)0L;
 }
 public pprint_insert_scaled_decimal() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object k2) {
  if (clojure.lang.Numbers.isNeg(((java.lang.Object)k2))) {
   return ((IFn)const__1.getRawRoot()).invoke(".", m1);
  } else {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(m1, const__3, k2), ".", ((IFn)const__2.getRawRoot()).invoke(m1, k2));
  }
 }
}
