package clojure;

import clojure.lang.*;

public final class pprint_exponential_float extends clojure.lang.AFunction {
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
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final java.lang.Object const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final java.lang.Object const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final java.lang.Object const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Var const__33;
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.Keyword const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Keyword const__37;
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
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "k");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "exponentchar");
  const__13 = (java.lang.Object)Character.valueOf((char)69);
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__18 = (java.lang.Object)Character.valueOf((char)45);
  const__19 = (java.lang.Object)Character.valueOf((char)43);
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__23 = (java.lang.Object)Character.valueOf((char)48);
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "round-str");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__27 = (java.lang.Object)2L;
  const__28 = (clojure.lang.Var)RT.var("clojure.pprint", "insert-scaled-decimal");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__34 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "overflowchar");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__37 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
 }
 public pprint_exponential_float() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77734 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77734), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77734), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object arg7 = ((IFn)const__4.getRawRoot()).invoke(arg5);
   {
    Object __r5330;
    if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7))) {
     __r5330 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg7)));
    } else {
     __r5330 = arg7;
    }
    Object G__77758 = ((IFn)const__5.getRawRoot()).invoke(__r5330);
    Object vec__77769 = G__77758;
    Object mantissa10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77769), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object exp11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77769), (int)RT.intCast(1L), ((java.lang.Object)null)));
    {
     Object G__777512 = G__77758;
     while(true) {
      {
       Object vec__777713 = G__777512;
       Object mantissa14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__777713), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object exp15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__777713), (int)RT.intCast(1L), ((java.lang.Object)null)));
       {
        Object w16 = RT.get(params1, Keyword.intern(null, "w"));
        Object d17 = RT.get(params1, Keyword.intern(null, "d"));
        Object e18 = RT.get(params1, Keyword.intern(null, "e"));
        Object k19 = RT.get(params1, Keyword.intern(null, "k"));
        Object __r5331 = null;
        {
         Object or__3968__auto__20 = RT.get(params1, Keyword.intern(null, "exponentchar"));
         Object __r5332;
         Object __r5333 = or__3968__auto__20;
         if (__r5333 != null && !(__r5333 == Boolean.FALSE)) {
          __r5332 = or__3968__auto__20;
         } else {
          __r5332 = const__13;
         }
         __r5331 = __r5332;
        }
        Object expchar21 = __r5331;
        Object __r5334 = null;
        {
         Object or__3968__auto__22 = RT.get(params1, Keyword.intern(null, "at"));
         Object __r5335;
         Object __r5336 = or__3968__auto__22;
         if (__r5336 != null && !(__r5336 == Boolean.FALSE)) {
          __r5335 = or__3968__auto__22;
         } else {
          __r5335 = (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7)) ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5334 = __r5335;
        }
        Object add_sign23 = __r5334;
        boolean prepend_zero24 = clojure.lang.Numbers.lte(((java.lang.Object)k19), (long)0L);
        Object scaled_exp25 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)exp15), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)k19))))));
        Object scaled_exp_str26 = ((IFn)const__17.getRawRoot()).invoke(Integer.valueOf(java.lang.Math.abs((int)RT.intCast(scaled_exp25))));
        Object __r5337;
        if (clojure.lang.Numbers.isNeg(((java.lang.Object)scaled_exp25))) {
         __r5337 = const__18;
        } else {
         __r5337 = const__19;
        }
        Object __r5338;
        Object __r5339 = e18;
        if (__r5339 != null && !(__r5339 == Boolean.FALSE)) {
         __r5338 = ((IFn)const__20.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)e18), (long)clojure.lang.RT.count(((java.lang.Object)scaled_exp_str26)))), const__23));
        } else {
         __r5338 = null;
        }
        Object scaled_exp_str27 = ((IFn)const__17.getRawRoot()).invoke(expchar21, __r5337, __r5338, scaled_exp_str26);
        int exp_width28 = clojure.lang.RT.count(((java.lang.Object)scaled_exp_str27));
        int base_mantissa_width29 = clojure.lang.RT.count(((java.lang.Object)mantissa14));
        Object __r5340;
        Object __r5341 = d17;
        if (__r5341 != null && !(__r5341 == Boolean.FALSE)) {
         Object __r5342;
         if (clojure.lang.Numbers.isNeg(((java.lang.Object)k19))) {
          __r5342 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)k19)));
         } else {
          __r5342 = const__2;
         }
         __r5340 = ((IFn)const__20.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)d17), (long)clojure.lang.Numbers.dec((long)base_mantissa_width29)))), ((java.lang.Object)__r5342))), const__23));
        } else {
         __r5340 = null;
        }
        Object scaled_mantissa30 = ((IFn)const__17.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)k19))), const__23)), mantissa14, __r5340);
        Object __r5343;
        Object __r5344 = w16;
        if (__r5344 != null && !(__r5344 == Boolean.FALSE)) {
         __r5343 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w16), (long)exp_width28));
        } else {
         __r5343 = null;
        }
        Object w_mantissa31 = __r5343;
        Object __r5345;
        if (clojure.lang.Util.equiv(((java.lang.Object)k19), (long)0L)) {
         __r5345 = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)d17)));
        } else {
         Object __r5346;
         if (clojure.lang.Numbers.isPos(((java.lang.Object)k19))) {
          __r5346 = d17;
         } else {
          Object __r5347;
          if (clojure.lang.Numbers.isNeg(((java.lang.Object)k19))) {
           __r5347 = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)d17)));
          } else {
           __r5347 = null;
          }
          __r5346 = __r5347;
         }
         __r5345 = __r5346;
        }
        Object __r5348;
        Object __r5349 = w_mantissa31;
        if (__r5349 != null && !(__r5349 == Boolean.FALSE)) {
         Object __r5350;
         Object __r5351 = add_sign23;
         if (__r5351 != null && !(__r5351 == Boolean.FALSE)) {
          __r5350 = 1L;
         } else {
          __r5350 = 0L;
         }
         __r5348 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w_mantissa31), (long)(java.lang.Long)__r5350));
        } else {
         __r5348 = null;
        }
        Object vec__777832 = ((IFn)const__24.getRawRoot()).invoke(scaled_mantissa30, const__2, __r5345, __r5348);
        Object rounded_mantissa33 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__777832), (int)RT.intCast(0L), ((java.lang.Object)null)));
        Object _34 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__777832), (int)RT.intCast(1L), ((java.lang.Object)null)));
        Object incr_exp35 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__777832), (int)RT.intCast(2L), ((java.lang.Object)null)));
        Object full_mantissa36 = ((IFn)const__28.getRawRoot()).invoke(rounded_mantissa33, k19);
        Object __r5352 = null;
        boolean and__3966__auto__37 = clojure.lang.Util.equiv(((java.lang.Object)k19), (long)clojure.lang.RT.count(((java.lang.Object)rounded_mantissa33)));
        Object __r5353;
        if (and__3966__auto__37) {
         __r5353 = clojure.lang.Util.identical(((java.lang.Object)d17), ((java.lang.Object)null));
        } else {
         __r5353 = and__3966__auto__37;
        }
        boolean append_zero38 = (java.lang.Boolean)__r5353;
        Object __r5355 = ((IFn)const__30.getRawRoot()).invoke(incr_exp35);
        if (__r5355 != null && !(__r5355 == Boolean.FALSE)) {
         Object __r5357 = w16;
         if (__r5357 != null && !(__r5357 == Boolean.FALSE)) {
          {
           long len39 = clojure.lang.Numbers.add((long)clojure.lang.RT.count(((java.lang.Object)full_mantissa36)), (long)exp_width28);
           Object __r5358;
           Object __r5359 = add_sign23;
           if (__r5359 != null && !(__r5359 == Boolean.FALSE)) {
            __r5358 = clojure.lang.Numbers.inc((long)len39);
           } else {
            __r5358 = len39;
           }
           long signed_len40 = (java.lang.Long)__r5358;
           Object __r5360 = null;
           {
            boolean and__3966__auto__41 = prepend_zero24;
            Object __r5361;
            if (and__3966__auto__41) {
             __r5361 = ((IFn)const__30.getRawRoot()).invoke((clojure.lang.Util.equiv((long)signed_len40, ((java.lang.Object)w16)) ? Boolean.TRUE : Boolean.FALSE));
            } else {
             __r5361 = (and__3966__auto__41 ? Boolean.TRUE : Boolean.FALSE);
            }
            __r5360 = __r5361;
           }
           Object prepend_zero42 = __r5360;
           Object __r5362;
           Object __r5363 = prepend_zero42;
           if (__r5363 != null && !(__r5363 == Boolean.FALSE)) {
            __r5362 = clojure.lang.Numbers.inc((long)signed_len40);
           } else {
            __r5362 = signed_len40;
           }
           long full_len43 = (java.lang.Long)__r5362;
           Object __r5364 = null;
           boolean and__3966__auto__44 = append_zero38;
           Object __r5365;
           if (and__3966__auto__44) {
            __r5365 = clojure.lang.Numbers.lt((long)full_len43, ((java.lang.Object)w16));
           } else {
            __r5365 = and__3966__auto__44;
           }
           boolean append_zero45 = (java.lang.Boolean)__r5365;
           Object __r5367 = null;
           {
            Object __r5368 = null;
            {
             boolean or__3968__auto__46 = clojure.lang.Numbers.gt((long)full_len43, ((java.lang.Object)w16));
             Object __r5369;
             if (or__3968__auto__46) {
              __r5369 = (or__3968__auto__46 ? Boolean.TRUE : Boolean.FALSE);
             } else {
              Object __r5370 = null;
              {
               Object and__3966__auto__47 = e18;
               Object __r5371;
               Object __r5372 = and__3966__auto__47;
               if (__r5372 != null && !(__r5372 == Boolean.FALSE)) {
                __r5371 = (clojure.lang.Numbers.gt((long)clojure.lang.Numbers.minus((long)exp_width28, (long)2L), ((java.lang.Object)e18)) ? Boolean.TRUE : Boolean.FALSE);
               } else {
                __r5371 = and__3966__auto__47;
               }
               __r5370 = __r5371;
              }
              __r5369 = __r5370;
             }
             __r5368 = (java.lang.Boolean)__r5369;
            }
            Object and__3966__auto__48 = __r5368;
            Object __r5373;
            Object __r5374 = and__3966__auto__48;
            if (__r5374 != null && !(__r5374 == Boolean.FALSE)) {
             __r5373 = RT.get(params1, Keyword.intern(null, "overflowchar"));
            } else {
             __r5373 = and__3966__auto__48;
            }
            __r5367 = __r5373;
           }
           Object __r5375 = __r5367;
           if (__r5375 != null && !(__r5375 == Boolean.FALSE)) {
            ((IFn)const__36.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(w16, RT.get(params1, Keyword.intern(null, "overflowchar")))));
           } else {
            Object __r5376;
            if (append_zero45) {
             __r5376 = 1L;
            } else {
             __r5376 = 0L;
            }
            Object __r5377;
            Object __r5378 = add_sign23;
            if (__r5378 != null && !(__r5378 == Boolean.FALSE)) {
             Object __r5379;
             if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7))) {
              __r5379 = const__18;
             } else {
              __r5379 = const__19;
             }
             __r5377 = __r5379;
            } else {
             __r5377 = null;
            }
            Object __r5380;
            Object __r5381 = prepend_zero42;
            if (__r5381 != null && !(__r5381 == Boolean.FALSE)) {
             __r5380 = "0";
            } else {
             __r5380 = null;
            }
            Object __r5382;
            if (append_zero45) {
             __r5382 = "0";
            } else {
             __r5382 = null;
            }
            ((IFn)const__36.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)w16), (long)full_len43))), (long)(java.lang.Long)__r5376)), RT.get(params1, Keyword.intern(null, "padchar")))), __r5377, __r5380, full_mantissa36, __r5382, scaled_exp_str27));
           }
          }
         } else {
          Object __r5383;
          Object __r5384 = add_sign23;
          if (__r5384 != null && !(__r5384 == Boolean.FALSE)) {
           Object __r5385;
           if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg7))) {
            __r5385 = const__18;
           } else {
            __r5385 = const__19;
           }
           __r5383 = __r5385;
          } else {
           __r5383 = null;
          }
          Object __r5386;
          if (prepend_zero24) {
           __r5386 = "0";
          } else {
           __r5386 = null;
          }
          Object __r5387;
          if (append_zero38) {
           __r5387 = "0";
          } else {
           __r5387 = null;
          }
          ((IFn)const__36.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(__r5383, __r5386, full_mantissa36, __r5387, scaled_exp_str27));
         }
        } else {
         java.lang.Object G__777512___aux = RT.vector(rounded_mantissa33, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)exp15))));
         G__777512 = G__777512___aux;
         continue;
        }
       }
      }
      break;
     }
    }
   }
   return navigator6;
  }
 }
}
