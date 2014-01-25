package clojure;

import clojure.lang.*;

public final class core_gen_class extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "generate-class");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__8 = (java.lang.Object)0L;
  const__9 = (java.lang.Object)1L;
 }
 public core_gen_class() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object options3) {
  try {
   Object __r3670 = const__0.get();
   if (__r3670 != null && !(__r3670 == Boolean.FALSE)) {
    {
     Object options_map4 = ((IFn)const__1.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(const__5, options3)));
     Object vec__57135 = ((IFn)const__6.getRawRoot()).invoke(options_map4);
     Object cname6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57135), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object bytecode7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57135), (int)RT.intCast(1L), ((java.lang.Object)null)));
     clojure.lang.Compiler.writeClassFile((java.lang.String)((java.lang.String)cname6), (byte[])((byte[])bytecode7));
     return null;
    }
   } else {
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
