package clojure;

import clojure.lang.*;

public final class instant_divisible_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "mod");
 }
 public instant_divisible_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1, java.lang.Object div2) {
  return (clojure.lang.Numbers.isZero(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(num1, div2))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
