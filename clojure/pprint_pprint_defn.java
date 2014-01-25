package clojure;

import clojure.lang.*;

public final class pprint_pprint_defn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-code-list");
 }
 public pprint_pprint_defn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  try {
   Object __r6099 = ((IFn)const__0.getRawRoot()).invoke(alis1);
   if (__r6099 != null && !(__r6099 == Boolean.FALSE)) {
    {
     Object vec__83782 = alis1;
     Object defn_sym3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83782), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object defn_name4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83782), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object stuff5 = ((IFn)const__4.getRawRoot()).invoke(vec__83782, const__5);
     Object __r6100;
     Object __r6101 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(stuff5));
     if (__r6101 != null && !(__r6101 == Boolean.FALSE)) {
      __r6100 = RT.vector(((IFn)const__7.getRawRoot()).invoke(stuff5), ((IFn)const__0.getRawRoot()).invoke(stuff5));
     } else {
      __r6100 = RT.vector(null, stuff5);
     }
     Object vec__83796 = __r6100;
     Object doc_str7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83796), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object stuff8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83796), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object __r6102;
     Object __r6103 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(stuff8));
     if (__r6103 != null && !(__r6103 == Boolean.FALSE)) {
      __r6102 = RT.vector(((IFn)const__7.getRawRoot()).invoke(stuff8), ((IFn)const__0.getRawRoot()).invoke(stuff8));
     } else {
      __r6102 = RT.vector(null, stuff8);
     }
     Object vec__83809 = __r6102;
     Object attr_map10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83809), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object stuff11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__83809), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object __r6105 = ((IFn)const__9).invoke();
     if (__r6105 != null && !(__r6105 == Boolean.FALSE)) {
      ((java.io.Writer)const__10.get()).write((java.lang.String)((java.lang.String)"#"));
     } else {
      ((IFn)const__11.getRawRoot()).invoke(RT.map(const__12, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__14.getRawRoot()).invoke(const__12)))), const__15, const__2));
      ((IFn)new clojure.pprint_pprint_defn_fn__8381(stuff11, doc_str7, defn_sym3, defn_name4, attr_map10)).invoke();
     }
     return null;
    }
   } else {
    return ((IFn)const__16.getRawRoot()).invoke(alis1);
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
