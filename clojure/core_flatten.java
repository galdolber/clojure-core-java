package clojure;

import clojure.lang.*;

public final class core_flatten extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "complement");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "tree-seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_flatten() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot()), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__2.getRawRoot(), const__5.getRawRoot(), x1)));
 }
}
