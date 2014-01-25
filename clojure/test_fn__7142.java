package clojure;

import clojure.lang.*;

public final class test_fn__7142 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "sequential?");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "function?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "assert-predicate");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "assert-any");
 }
 public test_fn__7142() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object form2) {
  Object __r4703 = null;
  {
   Object and__3966__auto__3 = ((IFn)const__0.getRawRoot()).invoke(form2);
   Object __r4704;
   Object __r4705 = and__3966__auto__3;
   if (__r4705 != null && !(__r4705 == Boolean.FALSE)) {
    __r4704 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(form2));
   } else {
    __r4704 = and__3966__auto__3;
   }
   __r4703 = __r4704;
  }
  Object __r4706 = __r4703;
  if (__r4706 != null && !(__r4706 == Boolean.FALSE)) {
   return ((IFn)const__3.getRawRoot()).invoke(msg1, form2);
  } else {
   return ((IFn)const__4.getRawRoot()).invoke(msg1, form2);
  }
 }
}
