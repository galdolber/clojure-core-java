package clojure.test;

import clojure.lang.*;

public final class junit_fn__7293 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.test.junit", "start-suite");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "ns");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public junit_fn__7293() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "ns")))));
   } finally {
    ((IFn)const__8.getRawRoot()).invoke();
   }
  }
 }
}
