package clojure;

import clojure.lang.*;

public final class test_fn__7104 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public test_fn__7104() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    return ((IFn)const__4.getRawRoot()).invoke(m1);
   } finally {
    ((IFn)const__5.getRawRoot()).invoke();
   }
  }
 }
}
