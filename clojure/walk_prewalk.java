package clojure;

import clojure.lang.*;

public final class walk_prewalk extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "walk");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "partial");
  const__2 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "identity");
 }
 public walk_prewalk() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object form2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), f1), const__3.getRawRoot(), ((IFn)f1).invoke(form2));
 }
}
