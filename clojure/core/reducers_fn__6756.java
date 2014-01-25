package clojure.core;

import clojure.lang.*;

public final class reducers_fn__6756 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjinvoke");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjtask");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjfork");
  const__3 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjjoin");
 }
 public reducers_fn__6756() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object n2, java.lang.Object combinef3, java.lang.Object reducef4) {
  return ((java.lang.Object)((clojure.lang.PersistentHashMap)m1).fold((long)RT.longCast(n2), (clojure.lang.IFn)((clojure.lang.IFn)combinef3), (clojure.lang.IFn)((clojure.lang.IFn)reducef4), (clojure.lang.IFn)((clojure.lang.IFn)const__0.getRawRoot()), (clojure.lang.IFn)((clojure.lang.IFn)const__1.getRawRoot()), (clojure.lang.IFn)((clojure.lang.IFn)const__2.getRawRoot()), (clojure.lang.IFn)((clojure.lang.IFn)const__3.getRawRoot())));
 }
}
