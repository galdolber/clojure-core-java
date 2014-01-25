package clojure;

import clojure.lang.*;

public final class core_ns_imports extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "filter-key");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "partial");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__4 = (java.lang.Object)java.lang.Class.class;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "ns-map");
 }
 public core_ns_imports() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), const__4), ((IFn)const__5.getRawRoot()).invoke(ns1));
 }
}
