package clojure;

import clojure.lang.*;

public final class core_rand_int extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "rand");
 }
 public core_rand_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(n1))));
 }
}
