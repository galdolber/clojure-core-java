package clojure.test;

import clojure.lang.*;

public final class junit_start_suite extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "package-class");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.test.junit", "start-element");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "testsuite");
  const__6 = (clojure.lang.Var)RT.var("clojure.test.junit", "suite-attrs");
 }
 public junit_start_suite() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  {
   Object vec__72792 = ((IFn)const__0.getRawRoot()).invoke(name1);
   Object package3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__72792), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object classname4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__72792), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__4.getRawRoot()).invoke(const__5, Boolean.TRUE, ((IFn)const__6.getRawRoot()).invoke(package3, classname4));
  }
 }
}
