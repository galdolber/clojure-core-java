package clojure.test;

import clojure.lang.*;

public final class tap_fn__7239 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "inc-report-counter");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__6 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-fail");
  const__7 = (clojure.lang.Var)RT.var("clojure.test", "testing-vars-str");
  const__8 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-diagnostics");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public tap_fn__7239() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object data1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    ((IFn)const__4.getRawRoot()).invoke(const__5);
    ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(data1));
    return ((IFn)const__8.getRawRoot()).invoke(data1);
   } finally {
    ((IFn)const__9.getRawRoot()).invoke();
   }
  }
 }
}
