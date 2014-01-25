package clojure.test;

import clojure.lang.*;

public final class junit_failure_el extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "message-el");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "failure");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
 }
 public junit_failure_el() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object message1, java.lang.Object expected2, java.lang.Object actual3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, message1, ((IFn)const__2.getRawRoot()).invoke(expected2), ((IFn)const__2.getRawRoot()).invoke(actual3));
 }
}
