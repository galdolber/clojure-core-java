package clojure;

import clojure.lang.*;

public final class main_null_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*warn-on-reflection*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*math-context*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*print-meta*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*data-readers*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*default-data-reader-fn*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "*compile-path*");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "*command-line-args*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*assert*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "*1");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "*2");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "*3");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "*e");
  const__18 = (clojure.lang.Var)RT.var("clojure.main", "initialize");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public main_null_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object args1, java.lang.Object inits2) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__2.get(), const__3, const__3.get(), const__4, const__4.get(), const__5, const__5.get(), const__6, const__6.get(), const__7, const__7.get(), const__8, const__8.get(), const__9, const__9.get(), const__10, ((java.lang.String)java.lang.System.getProperty((java.lang.String)((java.lang.String)"clojure.compile.path"), (java.lang.String)((java.lang.String)"classes"))), const__11, const__11.get(), const__12, const__12.get(), const__13, const__13.get(), const__14, null, const__15, null, const__16, null, const__17, null));
   try {
    return ((IFn)const__18.getRawRoot()).invoke(args1, inits2);
   } finally {
    ((IFn)const__19.getRawRoot()).invoke();
   }
  }
 }
}
