package clojure;

import clojure.lang.*;

public final class pprint_round_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.IPersistentStack const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__2 = (java.lang.Object)2L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__13 = (java.lang.Object)3L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__15 = (clojure.lang.IPersistentStack)RT.vector("0", 0L, Boolean.FALSE);
  const__16 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__19 = (java.lang.Object)Character.valueOf((char)53);
  const__20 = (clojure.lang.Var)RT.var("clojure.pprint", "inc-s");
 }
 public pprint_round_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object e2, java.lang.Object d3, java.lang.Object w4) {
  Object __r5240 = null;
  {
   Object or__3968__auto__5 = d3;
   Object __r5241;
   Object __r5242 = or__3968__auto__5;
   if (__r5242 != null && !(__r5242 == Boolean.FALSE)) {
    __r5241 = or__3968__auto__5;
   } else {
    __r5241 = w4;
   }
   __r5240 = __r5241;
  }
  Object __r5243 = __r5240;
  if (__r5243 != null && !(__r5243 == Boolean.FALSE)) {
   {
    int len6 = clojure.lang.RT.count(((java.lang.Object)m1));
    Object __r5244;
    Object __r5245 = w4;
    if (__r5245 != null && !(__r5245 == Boolean.FALSE)) {
     __r5244 = ((java.lang.Object)clojure.lang.Numbers.max((long)2L, ((java.lang.Object)w4)));
    } else {
     __r5244 = null;
    }
    Object w7 = __r5244;
    Object __r5246;
    Object __r5247 = d3;
    if (__r5247 != null && !(__r5247 == Boolean.FALSE)) {
     __r5246 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)e2), ((java.lang.Object)d3)))), (long)1L));
    } else {
     Object __r5248;
     if (clojure.lang.Numbers.gte(((java.lang.Object)e2), (long)0L)) {
      __r5248 = ((java.lang.Object)clojure.lang.Numbers.max(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)e2)))), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)w7))))));
     } else {
      Object __r5249;
      Object __r5250 = const__9;
      if (__r5250 != null && !(__r5250 == Boolean.FALSE)) {
       __r5249 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)w7), ((java.lang.Object)e2)));
      } else {
       __r5249 = null;
      }
      __r5248 = __r5249;
     }
     __r5246 = __r5248;
    }
    Object round_pos8 = __r5246;
    Object __r5251;
    if (clojure.lang.Util.equiv(((java.lang.Object)round_pos8), (long)0L)) {
     __r5251 = RT.vector(((IFn)const__11.getRawRoot()).invoke("0", m1), ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)e2))), const__4, Numbers.num(clojure.lang.Numbers.inc((long)len6)));
    } else {
     __r5251 = RT.vector(m1, e2, round_pos8, Integer.valueOf(len6));
    }
    Object vec__77479 = __r5251;
    Object m110 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77479), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object e111 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77479), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object round_pos12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77479), (int)RT.intCast(2L), ((java.lang.Object)null)));
    Object len13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77479), (int)RT.intCast(3L), ((java.lang.Object)null)));
    Object __r5253 = round_pos12;
    if (__r5253 != null && !(__r5253 == Boolean.FALSE)) {
     if (clojure.lang.Numbers.isNeg(((java.lang.Object)round_pos12))) {
      return const__15;
     } else {
      if (clojure.lang.Numbers.gt(((java.lang.Object)len13), ((java.lang.Object)round_pos12))) {
       {
        Object round_char14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)m110), (int)RT.intCast(round_pos12)));
        Object result15 = ((IFn)const__17.getRawRoot()).invoke(m110, const__6, round_pos12);
        if (clojure.lang.Numbers.gte((long)clojure.lang.RT.intCast(((java.lang.Object)round_char14)), (long)clojure.lang.RT.intCast(((java.lang.Object)const__19)))) {
         {
          Object round_up_result16 = ((IFn)const__20.getRawRoot()).invoke(result15);
          boolean expanded17 = clojure.lang.Numbers.gt((long)clojure.lang.RT.count(((java.lang.Object)round_up_result16)), (long)clojure.lang.RT.count(((java.lang.Object)result15)));
          Object __r5257;
          if (expanded17) {
           __r5257 = ((IFn)const__17.getRawRoot()).invoke(round_up_result16, const__6, Numbers.num(clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)round_up_result16)))));
          } else {
           __r5257 = round_up_result16;
          }
          return RT.vector(__r5257, e111, (expanded17 ? Boolean.TRUE : Boolean.FALSE));
         }
        } else {
         return RT.vector(result15, e111, Boolean.FALSE);
        }
       }
      } else {
       return RT.vector(m1, e2, Boolean.FALSE);
      }
     }
    } else {
     return RT.vector(m1, e2, Boolean.FALSE);
    }
   }
  } else {
   return RT.vector(m1, e2, Boolean.FALSE);
  }
 }
}
