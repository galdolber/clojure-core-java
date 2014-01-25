package clojure;

import clojure.lang.*;

public final class core__PLUS_ extends clojure.lang.RestFn {
 public static final java.lang.Object const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (java.lang.Object)0L;
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cast");
  const__2 = (java.lang.Object)java.lang.Number.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "+");
 }
 public core__PLUS_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  return ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)x1), ((java.lang.Object)y2))), more3);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)x1), ((java.lang.Object)y2)));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__1.getRawRoot()).invoke(const__2, x1);
 }
 public java.lang.Object invoke() {
  return const__0;
 }
 public int getRequiredArity() {
  return 2;
 }
}
