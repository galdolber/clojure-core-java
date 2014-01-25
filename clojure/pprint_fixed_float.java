package clojure;

import clojure.lang.*;

public final class pprint_fixed_float extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final java.lang.Object const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final java.lang.Object const__23;
 public static final java.lang.Object const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Keyword const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Keyword const__33;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "w");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "d");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "convert-ratio");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "float-parts");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "k");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "round-str");
  const__18 = (java.lang.Object)2L;
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "get-fixed");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__23 = (java.lang.Object)Character.valueOf((char)48);
  const__24 = (java.lang.Object)Character.valueOf((char)46);
  const__25 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "overflowchar");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__33 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
 }
 public pprint_fixed_float() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object w4 = RT.get(params1, Keyword.intern(null, "w"));
   Object d5 = RT.get(params1, Keyword.intern(null, "d"));
   Object vec__77576 = ((IFn)const__2.getRawRoot()).invoke(navigator2);
   Object arg7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77576), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77576), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5272;
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7))) {
    __r5272 = RT.vector("-", ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg7))));
   } else {
    __r5272 = RT.vector("+", arg7);
   }
   Object vec__77589 = __r5272;
   Object sign10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77589), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object abs11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77589), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object abs12 = ((IFn)const__8.getRawRoot()).invoke(abs11);
   Object vec__775913 = ((IFn)const__9.getRawRoot()).invoke(abs12);
   Object mantissa14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__775913), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object exp15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__775913), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object scaled_exp16 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)exp15), ((java.lang.Object)RT.get(params1, Keyword.intern(null, "k")))));
   Object __r5273 = null;
   {
    Object or__3968__auto__17 = RT.get(params1, Keyword.intern(null, "at"));
    Object __r5274;
    Object __r5275 = or__3968__auto__17;
    if (__r5275 != null && !(__r5275 == Boolean.FALSE)) {
     __r5274 = or__3968__auto__17;
    } else {
     __r5274 = (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7)) ? Boolean.TRUE : Boolean.FALSE);
    }
    __r5273 = __r5274;
   }
   Object add_sign18 = __r5273;
   Object __r5276 = null;
   {
    Object and__3966__auto__19 = ((IFn)const__13.getRawRoot()).invoke(d5);
    Object __r5277;
    Object __r5278 = and__3966__auto__19;
    if (__r5278 != null && !(__r5278 == Boolean.FALSE)) {
     __r5277 = (clojure.lang.Numbers.lte((long)clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)mantissa14))), ((java.lang.Object)scaled_exp16)) ? Boolean.TRUE : Boolean.FALSE);
    } else {
     __r5277 = and__3966__auto__19;
    }
    __r5276 = __r5277;
   }
   Object append_zero20 = __r5276;
   Object __r5279;
   Object __r5280 = w4;
   if (__r5280 != null && !(__r5280 == Boolean.FALSE)) {
    Object __r5281;
    Object __r5282 = add_sign18;
    if (__r5282 != null && !(__r5282 == Boolean.FALSE)) {
     __r5281 = 1L;
    } else {
     __r5281 = 0L;
    }
    __r5279 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w4), (long)(java.lang.Long)__r5281));
   } else {
    __r5279 = null;
   }
   Object vec__776021 = ((IFn)const__17.getRawRoot()).invoke(mantissa14, scaled_exp16, d5, __r5279);
   Object rounded_mantissa22 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__776021), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object scaled_exp23 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__776021), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object expanded24 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__776021), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object __r5283;
   Object __r5284 = expanded24;
   if (__r5284 != null && !(__r5284 == Boolean.FALSE)) {
    __r5283 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)scaled_exp23)));
   } else {
    __r5283 = scaled_exp23;
   }
   Object fixed_repr25 = ((IFn)const__19.getRawRoot()).invoke(rounded_mantissa22, __r5283, d5);
   Object __r5285;
   Object __r5286 = null;
   {
    Object and__3966__auto__26 = w4;
    Object __r5287;
    Object __r5288 = and__3966__auto__26;
    if (__r5288 != null && !(__r5288 == Boolean.FALSE)) {
     Object __r5289 = null;
     {
      Object and__3966__auto__27 = d5;
      Object __r5290;
      Object __r5291 = and__3966__auto__27;
      if (__r5291 != null && !(__r5291 == Boolean.FALSE)) {
       Object __r5292 = null;
       {
        boolean and__3966__auto__28 = clojure.lang.Numbers.gte(((java.lang.Object)d5), (long)1L);
        Object __r5293;
        if (and__3966__auto__28) {
         Object __r5294 = null;
         {
          boolean and__3966__auto__29 = clojure.lang.Util.equiv(((java.lang.Object)Reflector.invokeInstanceMethod(fixed_repr25, "charAt", new Object[]{const__4})), ((java.lang.Object)const__23));
          Object __r5295;
          if (and__3966__auto__29) {
           Object __r5296 = null;
           {
            boolean and__3966__auto__30 = clojure.lang.Util.equiv(((java.lang.Object)Reflector.invokeInstanceMethod(fixed_repr25, "charAt", new Object[]{const__5})), ((java.lang.Object)const__24));
            Object __r5297;
            if (and__3966__auto__30) {
             Object __r5298;
             Object __r5299 = add_sign18;
             if (__r5299 != null && !(__r5299 == Boolean.FALSE)) {
              __r5298 = 1L;
             } else {
              __r5298 = 0L;
             }
             __r5297 = (clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)fixed_repr25)), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w4), (long)(java.lang.Long)__r5298)))) ? Boolean.TRUE : Boolean.FALSE);
            } else {
             __r5297 = (and__3966__auto__30 ? Boolean.TRUE : Boolean.FALSE);
            }
            __r5296 = (java.lang.Boolean)__r5297;
           }
           __r5295 = __r5296;
          } else {
           __r5295 = (and__3966__auto__29 ? Boolean.TRUE : Boolean.FALSE);
          }
          __r5294 = (java.lang.Boolean)__r5295;
         }
         __r5293 = __r5294;
        } else {
         __r5293 = (and__3966__auto__28 ? Boolean.TRUE : Boolean.FALSE);
        }
        __r5292 = (java.lang.Boolean)__r5293;
       }
       __r5290 = __r5292;
      } else {
       __r5290 = and__3966__auto__27;
      }
      __r5289 = __r5290;
     }
     __r5287 = __r5289;
    } else {
     __r5287 = and__3966__auto__26;
    }
    __r5286 = __r5287;
   }
   Object __r5300 = __r5286;
   if (__r5300 != null && !(__r5300 == Boolean.FALSE)) {
    __r5285 = ((IFn)const__26.getRawRoot()).invoke(fixed_repr25, const__5);
   } else {
    __r5285 = fixed_repr25;
   }
   Object fixed_repr31 = __r5285;
   boolean prepend_zero32 = clojure.lang.Util.equiv(((java.lang.Object)((IFn)const__27.getRawRoot()).invoke(fixed_repr31)), ((java.lang.Object)const__24));
   Object __r5302 = w4;
   if (__r5302 != null && !(__r5302 == Boolean.FALSE)) {
    {
     int len33 = clojure.lang.RT.count(((java.lang.Object)fixed_repr31));
     Object __r5303;
     Object __r5304 = add_sign18;
     if (__r5304 != null && !(__r5304 == Boolean.FALSE)) {
      __r5303 = Numbers.num(clojure.lang.Numbers.inc((long)len33));
     } else {
      __r5303 = Integer.valueOf(len33);
     }
     Object signed_len34 = __r5303;
     Object __r5305 = null;
     {
      boolean and__3966__auto__35 = prepend_zero32;
      Object __r5306;
      if (and__3966__auto__35) {
       __r5306 = ((IFn)const__13.getRawRoot()).invoke((clojure.lang.Numbers.gte(((java.lang.Object)signed_len34), ((java.lang.Object)w4)) ? Boolean.TRUE : Boolean.FALSE));
      } else {
       __r5306 = (and__3966__auto__35 ? Boolean.TRUE : Boolean.FALSE);
      }
      __r5305 = __r5306;
     }
     Object prepend_zero36 = __r5305;
     Object __r5307 = null;
     {
      Object and__3966__auto__37 = append_zero20;
      Object __r5308;
      Object __r5309 = and__3966__auto__37;
      if (__r5309 != null && !(__r5309 == Boolean.FALSE)) {
       __r5308 = ((IFn)const__13.getRawRoot()).invoke((clojure.lang.Numbers.gte(((java.lang.Object)signed_len34), ((java.lang.Object)w4)) ? Boolean.TRUE : Boolean.FALSE));
      } else {
       __r5308 = and__3966__auto__37;
      }
      __r5307 = __r5308;
     }
     Object append_zero38 = __r5307;
     Object __r5310;
     Object __r5311 = null;
     {
      Object or__3968__auto__39 = prepend_zero36;
      Object __r5312;
      Object __r5313 = or__3968__auto__39;
      if (__r5313 != null && !(__r5313 == Boolean.FALSE)) {
       __r5312 = or__3968__auto__39;
      } else {
       __r5312 = append_zero38;
      }
      __r5311 = __r5312;
     }
     Object __r5314 = __r5311;
     if (__r5314 != null && !(__r5314 == Boolean.FALSE)) {
      __r5310 = ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)signed_len34)));
     } else {
      __r5310 = signed_len34;
     }
     Object full_len40 = __r5310;
     Object __r5316 = null;
     {
      boolean and__3966__auto__41 = clojure.lang.Numbers.gt(((java.lang.Object)full_len40), ((java.lang.Object)w4));
      Object __r5317;
      if (and__3966__auto__41) {
       __r5317 = RT.get(params1, Keyword.intern(null, "overflowchar"));
      } else {
       __r5317 = (and__3966__auto__41 ? Boolean.TRUE : Boolean.FALSE);
      }
      __r5316 = __r5317;
     }
     Object __r5318 = __r5316;
     if (__r5318 != null && !(__r5318 == Boolean.FALSE)) {
      ((IFn)const__29.getRawRoot()).invoke(((IFn)const__30.getRawRoot()).invoke(const__31.getRawRoot(), ((IFn)const__32.getRawRoot()).invoke(w4, RT.get(params1, Keyword.intern(null, "overflowchar")))));
     } else {
      Object __r5319;
      Object __r5320 = add_sign18;
      if (__r5320 != null && !(__r5320 == Boolean.FALSE)) {
       __r5319 = sign10;
      } else {
       __r5319 = null;
      }
      Object __r5321;
      Object __r5322 = prepend_zero36;
      if (__r5322 != null && !(__r5322 == Boolean.FALSE)) {
       __r5321 = "0";
      } else {
       __r5321 = null;
      }
      Object __r5323;
      Object __r5324 = append_zero38;
      if (__r5324 != null && !(__r5324 == Boolean.FALSE)) {
       __r5323 = "0";
      } else {
       __r5323 = null;
      }
      ((IFn)const__29.getRawRoot()).invoke(((IFn)const__31.getRawRoot()).invoke(((IFn)const__30.getRawRoot()).invoke(const__31.getRawRoot(), ((IFn)const__32.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w4), ((java.lang.Object)full_len40))), RT.get(params1, Keyword.intern(null, "padchar")))), __r5319, __r5321, fixed_repr31, __r5323));
     }
    }
   } else {
    Object __r5325;
    Object __r5326 = add_sign18;
    if (__r5326 != null && !(__r5326 == Boolean.FALSE)) {
     __r5325 = sign10;
    } else {
     __r5325 = null;
    }
    Object __r5327;
    if (prepend_zero32) {
     __r5327 = "0";
    } else {
     __r5327 = null;
    }
    Object __r5328;
    Object __r5329 = append_zero20;
    if (__r5329 != null && !(__r5329 == Boolean.FALSE)) {
     __r5328 = "0";
    } else {
     __r5328 = null;
    }
    ((IFn)const__29.getRawRoot()).invoke(((IFn)const__31.getRawRoot()).invoke(__r5325, __r5327, fixed_repr31, __r5328));
   }
   return navigator8;
  }
 }
}
