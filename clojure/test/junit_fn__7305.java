package clojure.test;

import clojure.lang.*;

public final class junit_fn__7305 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "inc-report-counter");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__6 = (clojure.lang.Var)RT.var("clojure.test.junit", "error-el");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public junit_fn__7305() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    ((IFn)const__4.getRawRoot()).invoke(const__5);
    return ((IFn)const__6.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "message")), RT.get(m1, Keyword.intern(null, "expected")), RT.get(m1, Keyword.intern(null, "actual")));
   } finally {
    ((IFn)const__10.getRawRoot()).invoke();
   }
  }
 }
}
