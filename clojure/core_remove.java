package clojure;

import clojure.lang.*;

public final class core_remove extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "complement");
 }
 public core_remove() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(pred1), coll2);
 }
}
