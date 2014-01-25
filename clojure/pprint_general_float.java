package clojure;

import clojure.lang.*;

public final class pprint_general_float extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 public static final java.lang.Object const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final java.lang.Object const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Keyword const__23;
 public static final clojure.lang.Keyword const__24;
 public static final clojure.lang.Keyword const__25;
 public static final clojure.lang.Keyword const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final java.lang.Object const__31;
 public static final clojure.lang.Var const__32;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "convert-ratio");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "float-parts");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "w");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "d");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "e");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__12 = (java.lang.Object)0.0;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__15 = (java.lang.Object)2L;
  const__16 = (java.lang.Object)4L;
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "min");
  const__20 = (java.lang.Object)7L;
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__22 = (clojure.lang.Var)RT.var("clojure.pprint", "fixed-float");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "k");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "overflowchar");
  const__25 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__31 = (java.lang.Object)Character.valueOf((char)32);
  const__32 = (clojure.lang.Var)RT.var("clojure.pprint", "exponential-float");
 }
 public pprint_general_float() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77884 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77884), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object _6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77884), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object arg7 = ((IFn)const__4.getRawRoot()).invoke(arg5);
   Object __r5388;
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7))) {
    __r5388 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg7)));
   } else {
    __r5388 = arg7;
   }
   Object vec__77898 = ((IFn)const__5.getRawRoot()).invoke(__r5388);
   Object mantissa9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77898), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object exp10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77898), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object w11 = RT.get(params1, Keyword.intern(null, "w"));
   Object d12 = RT.get(params1, Keyword.intern(null, "d"));
   Object e13 = RT.get(params1, Keyword.intern(null, "e"));
   Object __r5389;
   if (clojure.lang.Util.equiv(((java.lang.Object)arg7), (double)0.0)) {
    __r5389 = const__2;
   } else {
    __r5389 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)exp10)));
   }
   Object n14 = __r5389;
   Object __r5390;
   Object __r5391 = e13;
   if (__r5391 != null && !(__r5391 == Boolean.FALSE)) {
    __r5390 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)e13), (long)2L));
   } else {
    __r5390 = const__16;
   }
   Object ee15 = __r5390;
   Object __r5392;
   Object __r5393 = w11;
   if (__r5393 != null && !(__r5393 == Boolean.FALSE)) {
    __r5392 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w11), ((java.lang.Object)ee15)));
   } else {
    __r5392 = null;
   }
   Object ww16 = __r5392;
   Object __r5394;
   Object __r5395 = d12;
   if (__r5395 != null && !(__r5395 == Boolean.FALSE)) {
    __r5394 = d12;
   } else {
    __r5394 = ((java.lang.Object)clojure.lang.Numbers.max((long)clojure.lang.RT.count(((java.lang.Object)mantissa9)), ((java.lang.Object)((java.lang.Object)clojure.lang.Numbers.min(((java.lang.Object)n14), (long)7L)))));
   }
   Object d17 = __r5394;
   Object dd18 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)d17), ((java.lang.Object)n14)));
   Object __r5397 = ((IFn)const__21.getRawRoot()).invoke(const__2, dd18, d17);
   if (__r5397 != null && !(__r5397 == Boolean.FALSE)) {
    {
     Object navigator19 = ((IFn)const__22.getRawRoot()).invoke(RT.mapUniqueKeys(const__8, ww16, const__9, dd18, const__23, const__2, const__24, RT.get(params1, Keyword.intern(null, "overflowchar")), const__25, RT.get(params1, Keyword.intern(null, "padchar")), const__26, RT.get(params1, Keyword.intern(null, "at"))), navigator2, offsets3);
     ((IFn)const__27.getRawRoot()).invoke(((IFn)const__28.getRawRoot()).invoke(const__29.getRawRoot(), ((IFn)const__30.getRawRoot()).invoke(ee15, const__31)));
     return navigator19;
    }
   } else {
    return ((IFn)const__32.getRawRoot()).invoke(params1, navigator2, offsets3);
   }
  }
 }
}
