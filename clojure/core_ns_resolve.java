package clojure;

import clojure.lang.*;

public final class core_ns_resolve extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ns-resolve");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
 }
 public core_ns_resolve() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object env2, java.lang.Object sym3) {
  Object __r2787 = ((IFn)const__1.getRawRoot()).invoke(env2, sym3);
  if (__r2787 != null && !(__r2787 == Boolean.FALSE)) {
   return null;
  } else {
   return ((java.lang.Object)clojure.lang.Compiler.maybeResolveIn((clojure.lang.Namespace)((clojure.lang.Namespace)((IFn)const__2.getRawRoot()).invoke(ns1)), (clojure.lang.Symbol)((clojure.lang.Symbol)sym3)));
  }
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object sym2) {
  return ((IFn)const__0.getRawRoot()).invoke(ns1, null, sym2);
 }
}
