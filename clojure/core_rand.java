package clojure;

import clojure.lang.*;

public final class core_rand extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "rand");
 }
 public core_rand() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((java.lang.Number)clojure.lang.Numbers.multiply(((java.lang.Object)n1), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke())));
 }
 public java.lang.Object invoke() {
  return Double.valueOf(java.lang.Math.random());
 }
}
