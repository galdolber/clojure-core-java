package clojure.test;

import clojure.lang.*;

public final class junit_finish_element extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "*depth*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__2 = (clojure.lang.Var)RT.var("clojure.test.junit", "indent");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "println");
 }
 public junit_finish_element() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tag1, java.lang.Object pretty2) {
  const__0.set(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)const__0.get()))));
  Object __r4775 = pretty2;
  if (__r4775 != null && !(__r4775 == Boolean.FALSE)) {
   ((IFn)const__2.getRawRoot()).invoke();
  } else {
  }
  ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("</", tag1, ">"));
  Object __r4777 = pretty2;
  if (__r4777 != null && !(__r4777 == Boolean.FALSE)) {
   return ((IFn)const__5.getRawRoot()).invoke();
  } else {
   return null;
  }
 }
}
