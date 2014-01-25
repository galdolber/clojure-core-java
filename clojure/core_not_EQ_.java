package clojure;

import clojure.lang.*;

public final class core_not_EQ_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 public core_not_EQ_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), x1, y2, more3));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)x1), ((java.lang.Object)y2)) ? Boolean.TRUE : Boolean.FALSE));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Boolean.FALSE;
 }
 public int getRequiredArity() {
  return 2;
 }
}
