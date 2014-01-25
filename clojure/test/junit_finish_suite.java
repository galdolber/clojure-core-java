package clojure.test;

import clojure.lang.*;

public final class junit_finish_suite extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "finish-element");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "testsuite");
 }
 public junit_finish_suite() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, Boolean.TRUE);
 }
}
