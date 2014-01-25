package clojure;

import clojure.lang.*;

public final class pprint_expand_fixed extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__6 = (java.lang.Object)Character.valueOf((char)48);
  const__7 = (java.lang.Object)(-1L);
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__9 = (java.lang.Object)0L;
  const__10 = (java.lang.Object)1L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "<");
 }
 public pprint_expand_fixed() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object e2, java.lang.Object d3) {
  {
   Object __r5258;
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)e2))) {
    __r5258 = RT.vector(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)e2)))))), const__6)), m1), const__7);
   } else {
    __r5258 = RT.vector(m1, e2);
   }
   Object vec__77504 = __r5258;
   Object m15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77504), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object e16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77504), (int)RT.intCast(1L), ((java.lang.Object)null)));
   int len7 = clojure.lang.RT.count(((java.lang.Object)m15));
   Object __r5259;
   Object __r5260 = d3;
   if (__r5260 != null && !(__r5260 == Boolean.FALSE)) {
    __r5259 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)e16), ((java.lang.Object)d3)))), (long)1L));
   } else {
    __r5259 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)e16)));
   }
   Object target_len8 = __r5259;
   if (clojure.lang.Numbers.lt((long)len7, ((java.lang.Object)target_len8))) {
    return ((IFn)const__1.getRawRoot()).invoke(m15, ((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)target_len8), (long)len7)), const__6)));
   } else {
    return m15;
   }
  }
 }
}
