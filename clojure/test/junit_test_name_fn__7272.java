package clojure.test;

import clojure.lang.*;

public final class junit_test_name_fn__7272 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public junit_test_name_fn__7272() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7271_SHARP_1) {
  return RT.get(((IFn)const__1.getRawRoot()).invoke(p1__7271_SHARP_1), Keyword.intern(null, "name"));
 }
}
