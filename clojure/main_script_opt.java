package clojure;

import clojure.lang.*;

public final class main_script_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
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
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*warn-on-reflection*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*math-context*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*print-meta*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "*data-readers*");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*default-data-reader-fn*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "*compile-path*");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "*command-line-args*");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "*assert*");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "*1");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "*2");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "*3");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "*e");
  const__22 = (clojure.lang.Var)RT.var("clojure.main", "initialize");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "load-reader");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
  const__26 = (clojure.lang.Var)RT.var("clojure.main", "load-script");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public main_script_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__68321, java.lang.Object inits2) {
  {
   Object vec__68333 = p__68321;
   Object path4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68333), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object args5 = ((IFn)const__2.getRawRoot()).invoke(vec__68333, const__3);
   {
    ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6, const__6.get(), const__7, const__7.get(), const__8, const__8.get(), const__9, const__9.get(), const__10, const__10.get(), const__11, const__11.get(), const__12, const__12.get(), const__13, const__13.get(), const__14, ((java.lang.String)java.lang.System.getProperty((java.lang.String)((java.lang.String)"clojure.compile.path"), (java.lang.String)((java.lang.String)"classes"))), const__15, const__15.get(), const__16, const__16.get(), const__17, const__17.get(), const__18, null, const__19, null, const__20, null, const__21, null));
    try {
     ((IFn)const__22.getRawRoot()).invoke(args5, inits2);
     if (clojure.lang.Util.equiv(((java.lang.Object)path4), ((java.lang.Object)"-"))) {
      return ((IFn)const__24.getRawRoot()).invoke(const__25.get());
     } else {
      return ((IFn)const__26.getRawRoot()).invoke(path4);
     }
    } finally {
     ((IFn)const__27.getRawRoot()).invoke();
    }
   }
  }
 }
}
