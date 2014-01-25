package clojure.test;

import clojure.lang.*;

public final class tap_print_tap_pass extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
 }
 public tap_print_tap_pass() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1) {
  return ((IFn)const__0.getRawRoot()).invoke("ok", msg1);
 }
}
