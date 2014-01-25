package clojure;

import clojure.lang.*;

public final class core_gen_interface extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "generate-interface");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "name");
 }
 public core_gen_interface() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object options3) {
  try {
   {
    Object options_map4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), options3);
    Object vec__57415 = ((IFn)const__2.getRawRoot()).invoke(options_map4);
    Object cname6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57415), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object bytecode7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57415), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object __r3701 = const__6.get();
    if (__r3701 != null && !(__r3701 == Boolean.FALSE)) {
     clojure.lang.Compiler.writeClassFile((java.lang.String)((java.lang.String)cname6), (byte[])((byte[])bytecode7));
     return null;
    } else {
     return ((java.lang.Class)((clojure.lang.DynamicClassLoader)((IFn)const__7.getRawRoot()).invoke(((clojure.lang.Var)clojure.lang.Compiler.LOADER))).defineClass((java.lang.String)((java.lang.String)((IFn)const__8.getRawRoot()).invoke(RT.get(options_map4, Keyword.intern(null, "name")))), (byte[])((byte[])bytecode7), ((java.lang.Object)options3)));
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
