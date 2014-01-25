package clojure;

import clojure.lang.*;

public final class test_run_all_tests extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "run-tests");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "all-ns");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "filter");
 }
 public test_run_all_tests() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object re1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(new clojure.test_run_all_tests_fn__7209(re1), ((IFn)const__2.getRawRoot()).invoke()));
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke());
 }
}
