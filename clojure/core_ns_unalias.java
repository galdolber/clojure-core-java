package clojure;

import clojure.lang.*;

public final class core_ns_unalias extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
 }
 public core_ns_unalias() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object sym2) {
  ((clojure.lang.Namespace)((IFn)const__0.getRawRoot()).invoke(ns1)).removeAlias((clojure.lang.Symbol)((clojure.lang.Symbol)sym2));
  return null;
 }
}
