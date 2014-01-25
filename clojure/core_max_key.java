package clojure;

import clojure.lang.*;

public final class core_max_key extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "max-key");
 }
 public core_max_key() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object k1, java.lang.Object x2, java.lang.Object y3, java.lang.Object more4) {
  return ((IFn)const__1.getRawRoot()).invoke(new clojure.core_max_key_fn__4691(k1), ((IFn)const__2.getRawRoot()).invoke(k1, x2, y3), more4);
 }
 public java.lang.Object invoke(java.lang.Object k1, java.lang.Object x2, java.lang.Object y3) {
  if (clojure.lang.Numbers.gt(((java.lang.Object)((IFn)k1).invoke(x2)), ((java.lang.Object)((IFn)k1).invoke(y3)))) {
   return x2;
  } else {
   return y3;
  }
 }
 public java.lang.Object invoke(java.lang.Object k1, java.lang.Object x2) {
  return x2;
 }
 public int getRequiredArity() {
  return 3;
 }
}
