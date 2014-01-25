package clojure.test;

import clojure.lang.*;

public final class junit_escape_xml extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public junit_escape_xml() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object text1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(new clojure.test.junit_escape_xml_fn__7253(), text1));
 }
}
