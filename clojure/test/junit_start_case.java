package clojure.test;

import clojure.lang.*;

public final class junit_start_case extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "start-element");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "testcase");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "classname");
 }
 public junit_start_case() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1, java.lang.Object classname2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, Boolean.TRUE, RT.mapUniqueKeys(const__2, name1, const__3, classname2));
 }
}
