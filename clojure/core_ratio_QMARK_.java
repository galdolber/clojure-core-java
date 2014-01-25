package clojure;

import clojure.lang.*;

public final class core_ratio_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Ratio.class;
 }
 public core_ratio_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((n1 instanceof clojure.lang.Ratio) ? Boolean.TRUE : Boolean.FALSE);
 }
}
