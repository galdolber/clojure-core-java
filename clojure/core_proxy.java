package clojure;

import clojure.lang.*;

public final class core_proxy extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
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
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "get-super-and-interfaces");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "generate-proxy");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "get-proxy-class");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "proxy-name");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "intern");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "p__5329__auto__");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__20 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "init-proxy");
 }
 public core_proxy() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object class_and_interfaces3, java.lang.Object args4, java.lang.Object fs5) {
  try {
   {
    Object bases6 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_proxy_fn__5331(), class_and_interfaces3);
    Object vec__53307 = ((IFn)const__1.getRawRoot()).invoke(bases6);
    Object super8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53307), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object interfaces9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53307), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object __r3402;
    Object __r3403 = const__5.get();
    if (__r3403 != null && !(__r3403 == Boolean.FALSE)) {
     Object __r3404 = null;
     {
      Object vec__533410 = ((IFn)const__6.getRawRoot()).invoke(super8, interfaces9);
      Object cname11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__533410), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object bytecode12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__533410), (int)RT.intCast(1L), ((java.lang.Object)null)));
      clojure.lang.Compiler.writeClassFile((java.lang.String)((java.lang.String)cname11), (byte[])((byte[])bytecode12));
      __r3404 = null;
     }
     __r3402 = __r3404;
    } else {
     __r3402 = null;
    }
    Object compile_effect13 = __r3402;
    Object pc_effect14 = ((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), bases6);
    Object pname15 = ((IFn)const__9.getRawRoot()).invoke(super8, interfaces9);
    ((IFn)const__10.getRawRoot()).invoke(const__11.get(), ((IFn)const__12.getRawRoot()).invoke(pname15), pc_effect14);
    return ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__16), ((IFn)const__15.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__18), ((IFn)const__15.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__19), ((IFn)const__15.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(pname15)), args4))))))), ((IFn)const__15.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__20), ((IFn)const__15.getRawRoot()).invoke(const__18), ((IFn)const__15.getRawRoot()).invoke(((IFn)new clojure.core_proxy_fn__5335(fs5)).invoke())))), ((IFn)const__15.getRawRoot()).invoke(const__18)));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 4;
 }
}
