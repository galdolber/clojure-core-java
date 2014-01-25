package clojure;

import clojure.lang.*;

public final class core_resolve extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ns-resolve");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
 }
 public core_resolve() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object env1, java.lang.Object sym2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), env1, sym2);
 }
 public java.lang.Object invoke(java.lang.Object sym1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), sym1);
 }
}
