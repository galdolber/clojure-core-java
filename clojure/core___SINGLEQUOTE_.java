package clojure;

import clojure.lang.*;

public final class core___SINGLEQUOTE_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "-'");
 }
 public core___SINGLEQUOTE_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((java.lang.Number)clojure.lang.Numbers.minusP(((java.lang.Object)x1), ((java.lang.Object)y2))), more3);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((java.lang.Number)clojure.lang.Numbers.minusP(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((java.lang.Number)clojure.lang.Numbers.minusP(((java.lang.Object)x1)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
