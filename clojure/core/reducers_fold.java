package clojure.core;

import clojure.lang.*;

public final class reducers_fold extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fold");
  const__1 = (java.lang.Object)512L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "coll-fold");
 }
 public reducers_fold() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object combinef2, java.lang.Object reducef3, java.lang.Object coll4) {
  Object __r4376 = coll4;
  if (!(__r4376 instanceof clojure.core.reducers.CollFold)) {
   return ((IFn)const__2.getRawRoot()).invoke(__r4376, n1, combinef2, reducef3);
  } else {
   return ((clojure.core.reducers.CollFold) __r4376).coll_fold(((java.lang.Object)n1), ((java.lang.Object)combinef2), ((java.lang.Object)reducef3));
  }
 }
 public java.lang.Object invoke(java.lang.Object combinef1, java.lang.Object reducef2, java.lang.Object coll3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, combinef1, reducef2, coll3);
 }
 public java.lang.Object invoke(java.lang.Object reducef1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(reducef1, reducef1, coll2);
 }
}
