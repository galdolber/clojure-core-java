package clojure;

import clojure.lang.*;

public final class test_fn__7114 extends clojure.lang.AFunction {
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
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_fn__7114() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    ((IFn)const__4.getRawRoot()).invoke("\nRan", RT.get(m1, Keyword.intern(null, "test")), "tests containing", ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)RT.get(m1, Keyword.intern(null, "pass"))), ((java.lang.Object)RT.get(m1, Keyword.intern(null, "fail")))))), ((java.lang.Object)RT.get(m1, Keyword.intern(null, "error"))))), "assertions.");
    return ((IFn)const__4.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "fail")), "failures,", RT.get(m1, Keyword.intern(null, "error")), "errors.");
   } finally {
    ((IFn)const__10.getRawRoot()).invoke();
   }
  }
 }
}
