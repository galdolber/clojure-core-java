package clojure.core;

import clojure.lang.*;

public final class reducers_fjinvoke extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.reducers", "pool");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjtask");
 }
 public reducers_fjinvoke() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  if (java.util.concurrent.ForkJoinTask.inForkJoinPool()) {
   return ((IFn)f1).invoke();
  } else {
   return ((java.lang.Object)((java.util.concurrent.ForkJoinPool)((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot())).invoke((java.util.concurrent.ForkJoinTask)((java.util.concurrent.ForkJoinTask)((IFn)const__2.getRawRoot()).invoke(f1))));
  }
 }
}
