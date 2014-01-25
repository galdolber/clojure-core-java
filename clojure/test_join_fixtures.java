package clojure;

import clojure.lang.*;

public final class test_join_fixtures extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "compose-fixtures");
  const__2 = (clojure.lang.Var)RT.var("clojure.test", "default-fixture");
 }
 public test_join_fixtures() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fixtures1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2.getRawRoot(), fixtures1);
 }
}
