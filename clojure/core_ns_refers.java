package clojure;

import clojure.lang.*;

public final class core_ns_refers extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "filter-key");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "ns-map");
 }
 public core_ns_refers() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1) {
  {
   Object ns2 = ((IFn)const__0.getRawRoot()).invoke(ns1);
   return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), new clojure.core_ns_refers_fn__4540(ns2), ((IFn)const__3.getRawRoot()).invoke(ns2));
  }
 }
}
