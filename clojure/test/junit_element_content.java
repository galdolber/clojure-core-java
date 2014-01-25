package clojure.test;

import clojure.lang.*;

public final class junit_element_content extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__1 = (clojure.lang.Var)RT.var("clojure.test.junit", "escape-xml");
 }
 public junit_element_content() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object content1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(content1));
 }
}
