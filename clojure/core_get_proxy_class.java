package clojure;

import clojure.lang.*;

public final class core_get_proxy_class extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get-super-and-interfaces");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "proxy-name");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "generate-proxy");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public core_get_proxy_class() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object bases1) {
  try {
   {
    Object vec__53202 = ((IFn)const__0.getRawRoot()).invoke(bases1);
    Object super3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53202), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object interfaces4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53202), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object pname5 = ((IFn)const__4.getRawRoot()).invoke(super3, interfaces4);
    {
     Object or__3968__auto__6 = ((java.lang.Class)clojure.lang.RT.loadClassForName((java.lang.String)((java.lang.String)pname5)));
     Object __r3393 = or__3968__auto__6;
     if (__r3393 != null && !(__r3393 == Boolean.FALSE)) {
      return or__3968__auto__6;
     } else {
      {
       Object vec__53217 = ((IFn)const__5.getRawRoot()).invoke(super3, interfaces4);
       Object cname8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53217), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object bytecode9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53217), (int)RT.intCast(1L), ((java.lang.Object)null)));
       return ((java.lang.Class)((clojure.lang.DynamicClassLoader)((IFn)const__6.getRawRoot()).invoke(((clojure.lang.Var)clojure.lang.Compiler.LOADER))).defineClass((java.lang.String)((java.lang.String)pname5), (byte[])((byte[])bytecode9), ((java.lang.Object)RT.vector(super3, interfaces4))));
      }
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
