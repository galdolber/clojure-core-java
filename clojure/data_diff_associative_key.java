package clojure;

import clojure.lang.*;

public final class data_diff_associative_key extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.data", "diff");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public data_diff_associative_key() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object k3) {
  {
   Object va4 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)a1), ((java.lang.Object)k3)));
   Object vb5 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)b2), ((java.lang.Object)k3)));
   Object vec__87936 = ((IFn)const__1.getRawRoot()).invoke(va4, vb5);
   Object a_STAR_7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87936), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object b_STAR_8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87936), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object ab9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87936), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object in_a10 = ((IFn)const__6.getRawRoot()).invoke(a1, k3);
   Object in_b11 = ((IFn)const__6.getRawRoot()).invoke(b2, k3);
   Object __r6354 = null;
   {
    Object and__3966__auto__12 = in_a10;
    Object __r6355;
    Object __r6356 = and__3966__auto__12;
    if (__r6356 != null && !(__r6356 == Boolean.FALSE)) {
     Object __r6357 = null;
     {
      Object and__3966__auto__13 = in_b11;
      Object __r6358;
      Object __r6359 = and__3966__auto__13;
      if (__r6359 != null && !(__r6359 == Boolean.FALSE)) {
       Object __r6360 = null;
       {
        Object or__3968__auto__14 = ((IFn)const__7.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)ab9), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE));
        Object __r6361;
        Object __r6362 = or__3968__auto__14;
        if (__r6362 != null && !(__r6362 == Boolean.FALSE)) {
         __r6361 = or__3968__auto__14;
        } else {
         Object __r6363 = null;
         {
          boolean and__3966__auto__15 = clojure.lang.Util.identical(((java.lang.Object)va4), ((java.lang.Object)null));
          Object __r6364;
          if (and__3966__auto__15) {
           __r6364 = (clojure.lang.Util.identical(((java.lang.Object)vb5), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE);
          } else {
           __r6364 = (and__3966__auto__15 ? Boolean.TRUE : Boolean.FALSE);
          }
          __r6363 = (java.lang.Boolean)__r6364;
         }
         __r6361 = __r6363;
        }
        __r6360 = __r6361;
       }
       __r6358 = __r6360;
      } else {
       __r6358 = and__3966__auto__13;
      }
      __r6357 = __r6358;
     }
     __r6355 = __r6357;
    } else {
     __r6355 = and__3966__auto__12;
    }
    __r6354 = __r6355;
   }
   Object same16 = __r6354;
   Object __r6365;
   Object __r6366 = null;
   {
    Object and__3966__auto__17 = in_a10;
    Object __r6367;
    Object __r6368 = and__3966__auto__17;
    if (__r6368 != null && !(__r6368 == Boolean.FALSE)) {
     Object __r6369 = null;
     {
      Object or__3968__auto__18 = ((IFn)const__7.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)a_STAR_7), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE));
      Object __r6370;
      Object __r6371 = or__3968__auto__18;
      if (__r6371 != null && !(__r6371 == Boolean.FALSE)) {
       __r6370 = or__3968__auto__18;
      } else {
       __r6370 = ((IFn)const__7.getRawRoot()).invoke(same16);
      }
      __r6369 = __r6370;
     }
     __r6367 = __r6369;
    } else {
     __r6367 = and__3966__auto__17;
    }
    __r6366 = __r6367;
   }
   Object __r6372 = __r6366;
   if (__r6372 != null && !(__r6372 == Boolean.FALSE)) {
    __r6365 = RT.mapUniqueKeys(k3, a_STAR_7);
   } else {
    __r6365 = null;
   }
   Object __r6373;
   Object __r6374 = null;
   {
    Object and__3966__auto__19 = in_b11;
    Object __r6375;
    Object __r6376 = and__3966__auto__19;
    if (__r6376 != null && !(__r6376 == Boolean.FALSE)) {
     Object __r6377 = null;
     {
      Object or__3968__auto__20 = ((IFn)const__7.getRawRoot()).invoke((clojure.lang.Util.identical(((java.lang.Object)b_STAR_8), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE));
      Object __r6378;
      Object __r6379 = or__3968__auto__20;
      if (__r6379 != null && !(__r6379 == Boolean.FALSE)) {
       __r6378 = or__3968__auto__20;
      } else {
       __r6378 = ((IFn)const__7.getRawRoot()).invoke(same16);
      }
      __r6377 = __r6378;
     }
     __r6375 = __r6377;
    } else {
     __r6375 = and__3966__auto__19;
    }
    __r6374 = __r6375;
   }
   Object __r6380 = __r6374;
   if (__r6380 != null && !(__r6380 == Boolean.FALSE)) {
    __r6373 = RT.mapUniqueKeys(k3, b_STAR_8);
   } else {
    __r6373 = null;
   }
   Object __r6381;
   Object __r6382 = same16;
   if (__r6382 != null && !(__r6382 == Boolean.FALSE)) {
    __r6381 = RT.mapUniqueKeys(k3, ab9);
   } else {
    __r6381 = null;
   }
   return RT.vector(__r6365, __r6373, __r6381);
  }
 }
}
