package clojure;

import clojure.lang.*;

public final class test_fn__7116 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "ns");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_fn__7116() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    return ((IFn)const__4.getRawRoot()).invoke("\nTesting", ((IFn)const__5.getRawRoot()).invoke(RT.get(m1, Keyword.intern(null, "ns"))));
   } finally {
    ((IFn)const__7.getRawRoot()).invoke();
   }
  }
 }
}
