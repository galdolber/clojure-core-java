package clojure;

import clojure.lang.*;

public final class core__SLASH_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "/");
  const__1 = (java.lang.Object)1L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core__SLASH_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  return ((IFn)const__2.getRawRoot()).invoke(const__0.getRawRoot(), ((java.lang.Number)clojure.lang.Numbers.divide(((java.lang.Object)x1), ((java.lang.Object)y2))), more3);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((java.lang.Number)clojure.lang.Numbers.divide(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((java.lang.Number)clojure.lang.Numbers.divide((long)1L, ((java.lang.Object)x1)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
