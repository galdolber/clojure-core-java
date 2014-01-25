package clojure;

import clojure.lang.*;

public final class main_main_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
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
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Var const__29;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*warn-on-reflection*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*math-context*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "*print-meta*");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "*print-level*");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*data-readers*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "*default-data-reader-fn*");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "*compile-path*");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "*command-line-args*");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "*assert*");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "*1");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "*2");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "*3");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "*e");
  const__23 = (clojure.lang.Var)RT.var("clojure.main", "initialize");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "ns-resolve");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "require");
  const__28 = (clojure.lang.Symbol)Symbol.intern(null, "-main");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public main_main_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__68201, java.lang.Object inits2) {
  {
   Object vec__68213 = p__68201;
   Object _4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68213), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object main_ns5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68213), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object args6 = ((IFn)const__3.getRawRoot()).invoke(vec__68213, const__4);
   {
    ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7, const__7.get(), const__8, const__8.get(), const__9, const__9.get(), const__10, const__10.get(), const__11, const__11.get(), const__12, const__12.get(), const__13, const__13.get(), const__14, const__14.get(), const__15, ((java.lang.String)java.lang.System.getProperty((java.lang.String)((java.lang.String)"clojure.compile.path"), (java.lang.String)((java.lang.String)"classes"))), const__16, const__16.get(), const__17, const__17.get(), const__18, const__18.get(), const__19, null, const__20, null, const__21, null, const__22, null));
    try {
     ((IFn)const__23.getRawRoot()).invoke(args6, inits2);
     Object __r4479 = null;
     {
      Object G__68229 = ((IFn)const__26.getRawRoot()).invoke(main_ns5);
      ((IFn)const__27.getRawRoot()).invoke(G__68229);
      __r4479 = G__68229;
     }
     return ((IFn)const__24.getRawRoot()).invoke(((IFn)const__25.getRawRoot()).invoke(__r4479, const__28), args6);
    } finally {
     ((IFn)const__29.getRawRoot()).invoke();
    }
   }
  }
 }
}
