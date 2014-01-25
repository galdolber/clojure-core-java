package clojure;

import clojure.lang.*;

public final class zip_insert_child extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "replace");
  const__1 = (clojure.lang.Var)RT.var("clojure.zip", "make-node");
  const__2 = (clojure.lang.Var)RT.var("clojure.zip", "node");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__4 = (clojure.lang.Var)RT.var("clojure.zip", "children");
 }
 public zip_insert_child() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1, java.lang.Object item2) {
  return ((IFn)const__0.getRawRoot()).invoke(loc1, ((IFn)const__1.getRawRoot()).invoke(loc1, ((IFn)const__2.getRawRoot()).invoke(loc1), ((IFn)const__3.getRawRoot()).invoke(item2, ((IFn)const__4.getRawRoot()).invoke(loc1))));
 }
}
