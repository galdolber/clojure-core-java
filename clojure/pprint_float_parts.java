package clojure;

import clojure.lang.*;

public final class pprint_float_parts extends clojure.lang.AFunction {
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
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.IPersistentStack const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "float-parts-base");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "rtrim");
  const__5 = (java.lang.Object)Character.valueOf((char)48);
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "ltrim");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__11 = (java.lang.Object)Character.valueOf((char)43);
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__14 = (clojure.lang.IPersistentStack)RT.vector("0", 0L);
 }
 public pprint_float_parts() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object vec__77432 = ((IFn)const__0.getRawRoot()).invoke(f1);
   Object m3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77432), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object e4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77432), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object m15 = ((IFn)const__4.getRawRoot()).invoke(m3, const__5);
   Object m26 = ((IFn)const__6.getRawRoot()).invoke(m15, const__5);
   long delta7 = clojure.lang.Numbers.minus((long)clojure.lang.RT.count(((java.lang.Object)m15)), (long)clojure.lang.RT.count(((java.lang.Object)m26)));
   Object __r5230;
   Object __r5231 = null;
   boolean and__3966__auto__8 = clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)e4)));
   Object __r5232;
   if (and__3966__auto__8) {
    __r5232 = clojure.lang.Util.equiv(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)e4), (int)RT.intCast(0L)))), ((java.lang.Object)const__11));
   } else {
    __r5232 = and__3966__auto__8;
   }
   if ((java.lang.Boolean)__r5232) {
    __r5230 = ((IFn)const__12.getRawRoot()).invoke(e4, const__3);
   } else {
    __r5230 = e4;
   }
   Object e9 = __r5230;
   Object __r5234 = ((IFn)const__13.getRawRoot()).invoke(m26);
   if (__r5234 != null && !(__r5234 == Boolean.FALSE)) {
    return const__14;
   } else {
    return RT.vector(m26, ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((java.lang.Integer)java.lang.Integer.valueOf((java.lang.String)((java.lang.String)e9)))), (long)delta7)));
   }
  }
 }
}
