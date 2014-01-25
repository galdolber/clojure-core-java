package clojure.test;

import clojure.lang.*;

public final class junit_error_el extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test.junit", "message-el");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "error");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__4 = (java.lang.Object)java.lang.Throwable.class;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public junit_error_el() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object message1, java.lang.Object expected2, java.lang.Object actual3) {
  Object __r4786;
  if ((actual3 instanceof java.lang.Throwable)) {
   Object __r4787 = null;
   {
    Object s__4646__auto__4 = new java.io.StringWriter();
    Object __r4788 = null;
    {
     ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7, s__4646__auto__4));
     __r4788 = ((IFn)new clojure.test.junit_error_el_fn__7285(actual3, s__4646__auto__4)).invoke();
    }
    __r4787 = __r4788;
   }
   __r4786 = __r4787;
  } else {
   __r4786 = ((IFn)const__8.getRawRoot()).invoke(actual3);
  }
  return ((IFn)const__0.getRawRoot()).invoke(const__1, message1, ((IFn)const__2.getRawRoot()).invoke(expected2), __r4786);
 }
}
