package clojure;

import clojure.lang.*;

public final class core_replicate extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
 }
 public core_replicate() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object x2) {
  return ((IFn)const__0.getRawRoot()).invoke(n1, ((IFn)const__1.getRawRoot()).invoke(x2));
 }
}
