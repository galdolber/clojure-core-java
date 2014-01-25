package clojure.test;

import clojure.lang.*;

public final class tap_print_tap_plan extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public tap_print_tap_plan() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke("1..", n1));
 }
}
