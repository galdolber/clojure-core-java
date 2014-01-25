package clojure.test;

import clojure.lang.*;

public final class tap_fn__7243 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-plan");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public tap_fn__7243() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object data1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    return ((IFn)const__4.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)RT.get(data1, Keyword.intern(null, "pass"))), ((java.lang.Object)RT.get(data1, Keyword.intern(null, "fail")))))), ((java.lang.Object)RT.get(data1, Keyword.intern(null, "error"))))));
   } finally {
    ((IFn)const__9.getRawRoot()).invoke();
   }
  }
 }
}
