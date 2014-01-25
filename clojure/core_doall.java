package clojure;

import clojure.lang.*;

public final class core_doall extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "dorun");
 }
 public core_doall() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  ((IFn)const__0.getRawRoot()).invoke(n1, coll2);
  return coll2;
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  ((IFn)const__0.getRawRoot()).invoke(coll1);
  return coll1;
 }
}
