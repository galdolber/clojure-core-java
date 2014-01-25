package clojure;

import clojure.lang.*;

public final class core_decimal_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.math.BigDecimal.class;
 }
 public core_decimal_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((n1 instanceof java.math.BigDecimal) ? Boolean.TRUE : Boolean.FALSE);
 }
}
