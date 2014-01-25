package clojure;

import clojure.lang.*;

public final class core_odd_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "even?");
 }
 public core_odd_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(n1));
 }
}
