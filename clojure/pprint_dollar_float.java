package clojure;

import clojure.lang.*;

public final class pprint_dollar_float extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final java.lang.Object const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Keyword const__24;
 public static final java.lang.Object const__25;
 public static final java.lang.Object const__26;
 public static final clojure.lang.Keyword const__27;
 public static final clojure.lang.Var const__28;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "float-parts");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "d");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "n");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "w");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "round-str");
  const__11 = (java.lang.Object)2L;
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "get-fixed");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__19 = (java.lang.Object)Character.valueOf((char)46);
  const__20 = (java.lang.Object)Character.valueOf((char)48);
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__25 = (java.lang.Object)Character.valueOf((char)45);
  const__26 = (java.lang.Object)Character.valueOf((char)43);
  const__27 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "not");
 }
 public pprint_dollar_float() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77914 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77914), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77914), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object vec__77927 = ((IFn)const__4.getRawRoot()).invoke(Double.valueOf(java.lang.Math.abs((double)RT.doubleCast(arg5))));
   Object mantissa8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77927), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object exp9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77927), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object d10 = RT.get(params1, Keyword.intern(null, "d"));
   Object n11 = RT.get(params1, Keyword.intern(null, "n"));
   Object w12 = RT.get(params1, Keyword.intern(null, "w"));
   Object __r5398 = null;
   {
    Object or__3968__auto__13 = RT.get(params1, Keyword.intern(null, "at"));
    Object __r5399;
    Object __r5400 = or__3968__auto__13;
    if (__r5400 != null && !(__r5400 == Boolean.FALSE)) {
     __r5399 = or__3968__auto__13;
    } else {
     __r5399 = (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5)) ? Boolean.TRUE : Boolean.FALSE);
    }
    __r5398 = __r5399;
   }
   Object add_sign14 = __r5398;
   Object vec__779315 = ((IFn)const__10.getRawRoot()).invoke(mantissa8, exp9, d10, null);
   Object rounded_mantissa16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__779315), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object scaled_exp17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__779315), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object expanded18 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__779315), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object __r5401;
   Object __r5402 = expanded18;
   if (__r5402 != null && !(__r5402 == Boolean.FALSE)) {
    __r5401 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)scaled_exp17)));
   } else {
    __r5401 = scaled_exp17;
   }
   Object fixed_repr19 = ((IFn)const__12.getRawRoot()).invoke(rounded_mantissa16, __r5401, d10);
   Object full_repr20 = ((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__16.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)n11), (long)((java.lang.String)fixed_repr19).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__19))))), const__20)), fixed_repr19);
   Object __r5403;
   Object __r5404 = add_sign14;
   if (__r5404 != null && !(__r5404 == Boolean.FALSE)) {
    __r5403 = 1L;
   } else {
    __r5403 = 0L;
   }
   long full_len21 = clojure.lang.Numbers.add((long)clojure.lang.RT.count(((java.lang.Object)full_repr20)), (long)(java.lang.Long)__r5403);
   Object __r5405;
   Object __r5406 = null;
   {
    Object and__3966__auto__22 = RT.get(params1, Keyword.intern(null, "colon"));
    Object __r5407;
    Object __r5408 = and__3966__auto__22;
    if (__r5408 != null && !(__r5408 == Boolean.FALSE)) {
     __r5407 = add_sign14;
    } else {
     __r5407 = and__3966__auto__22;
    }
    __r5406 = __r5407;
   }
   Object __r5409 = __r5406;
   if (__r5409 != null && !(__r5409 == Boolean.FALSE)) {
    Object __r5410;
    if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
     __r5410 = const__25;
    } else {
     __r5410 = const__26;
    }
    __r5405 = __r5410;
   } else {
    __r5405 = null;
   }
   Object __r5411;
   Object __r5412 = null;
   {
    Object and__3966__auto__23 = ((IFn)const__28.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "colon")));
    Object __r5413;
    Object __r5414 = and__3966__auto__23;
    if (__r5414 != null && !(__r5414 == Boolean.FALSE)) {
     __r5413 = add_sign14;
    } else {
     __r5413 = and__3966__auto__23;
    }
    __r5412 = __r5413;
   }
   Object __r5415 = __r5412;
   if (__r5415 != null && !(__r5415 == Boolean.FALSE)) {
    Object __r5416;
    if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
     __r5416 = const__25;
    } else {
     __r5416 = const__26;
    }
    __r5411 = __r5416;
   } else {
    __r5411 = null;
   }
   ((IFn)const__23.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(__r5405, ((IFn)const__15.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__16.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w12), (long)full_len21)), RT.get(params1, Keyword.intern(null, "padchar")))), __r5411, full_repr20));
   return navigator6;
  }
 }
}
