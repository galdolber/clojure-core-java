package clojure.test;

import clojure.lang.*;

public final class junit_test_name extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public junit_test_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object vars1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(".", ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(new clojure.test.junit_test_name_fn__7272(), vars1))));
 }
}
