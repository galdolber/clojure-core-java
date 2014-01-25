package clojure.test;

import clojure.lang.*;

public final class junit_fn__7297 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.test", "*test-out*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "var");
  const__5 = (clojure.lang.Var)RT.var("clojure.test.junit", "*var-context*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.test.junit", "start-case");
  const__8 = (clojure.lang.Var)RT.var("clojure.test.junit", "test-name");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "ns");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public junit_fn__7297() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    {
     Object var4 = RT.get(m1, Keyword.intern(null, "var"));
     {
      ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__5, ((IFn)const__6.getRawRoot()).invoke(const__5.get(), var4)));
      try {
       return ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__5.get()), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(RT.get(((IFn)const__12.getRawRoot()).invoke(var4), Keyword.intern(null, "ns")))));
      } finally {
       ((IFn)const__13.getRawRoot()).invoke();
      }
     }
    }
   } finally {
    ((IFn)const__13.getRawRoot()).invoke();
   }
  }
 }
}
