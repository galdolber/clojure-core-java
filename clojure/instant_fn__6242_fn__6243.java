package clojure;

import clojure.lang.*;

public final class instant_fn__6242_fn__6243 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Var const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-matches");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (java.lang.Object)2L;
  const__5 = (java.lang.Object)3L;
  const__6 = (java.lang.Object)4L;
  const__7 = (java.lang.Object)5L;
  const__8 = (java.lang.Object)6L;
  const__9 = (java.lang.Object)7L;
  const__10 = (java.lang.Object)8L;
  const__11 = (java.lang.Object)9L;
  const__12 = (java.lang.Object)10L;
  const__13 = (clojure.lang.Var)RT.var("clojure.instant", "parse-int");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__15 = (clojure.lang.Var)RT.var("clojure.instant", "zero-fill-right");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__17 = (java.lang.Object)(-1L);
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object timestamp1;
 public instant_fn__6242_fn__6243(final Object timestamp1) {
  super();
  this.timestamp1 = timestamp1;
 }
 public java.lang.Object invoke(java.lang.Object new_instant1, java.lang.Object cs2) {
  {
   Object temp__4115__auto__3 = ((IFn)const__0.getRawRoot()).invoke(this.timestamp1, cs2);
   Object __r4027 = temp__4115__auto__3;
   if (__r4027 != null && !(__r4027 == Boolean.FALSE)) {
    {
     Object vec__62444 = temp__4115__auto__3;
     Object _5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object years6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object months7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(2L), ((java.lang.Object)null)));
     Object days8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(3L), ((java.lang.Object)null)));
     Object hours9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(4L), ((java.lang.Object)null)));
     Object minutes10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(5L), ((java.lang.Object)null)));
     Object seconds11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(6L), ((java.lang.Object)null)));
     Object fraction12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(7L), ((java.lang.Object)null)));
     Object offset_sign13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(8L), ((java.lang.Object)null)));
     Object offset_hours14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(9L), ((java.lang.Object)null)));
     Object offset_minutes15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__62444), (int)RT.intCast(10L), ((java.lang.Object)null)));
     Object __r4028;
     Object __r4029 = ((IFn)const__14.getRawRoot()).invoke(months7);
     if (__r4029 != null && !(__r4029 == Boolean.FALSE)) {
      __r4028 = const__3;
     } else {
      __r4028 = ((IFn)const__13.getRawRoot()).invoke(months7);
     }
     Object __r4030;
     Object __r4031 = ((IFn)const__14.getRawRoot()).invoke(days8);
     if (__r4031 != null && !(__r4031 == Boolean.FALSE)) {
      __r4030 = const__3;
     } else {
      __r4030 = ((IFn)const__13.getRawRoot()).invoke(days8);
     }
     Object __r4032;
     Object __r4033 = ((IFn)const__14.getRawRoot()).invoke(hours9);
     if (__r4033 != null && !(__r4033 == Boolean.FALSE)) {
      __r4032 = const__2;
     } else {
      __r4032 = ((IFn)const__13.getRawRoot()).invoke(hours9);
     }
     Object __r4034;
     Object __r4035 = ((IFn)const__14.getRawRoot()).invoke(minutes10);
     if (__r4035 != null && !(__r4035 == Boolean.FALSE)) {
      __r4034 = const__2;
     } else {
      __r4034 = ((IFn)const__13.getRawRoot()).invoke(minutes10);
     }
     Object __r4036;
     Object __r4037 = ((IFn)const__14.getRawRoot()).invoke(seconds11);
     if (__r4037 != null && !(__r4037 == Boolean.FALSE)) {
      __r4036 = const__2;
     } else {
      __r4036 = ((IFn)const__13.getRawRoot()).invoke(seconds11);
     }
     Object __r4038;
     Object __r4039 = ((IFn)const__14.getRawRoot()).invoke(fraction12);
     if (__r4039 != null && !(__r4039 == Boolean.FALSE)) {
      __r4038 = const__2;
     } else {
      __r4038 = ((IFn)const__13.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(fraction12, const__11));
     }
     Object __r4040;
     if (clojure.lang.Util.equiv(((java.lang.Object)"-"), ((java.lang.Object)offset_sign13))) {
      __r4040 = const__17;
     } else {
      Object __r4041;
      if (clojure.lang.Util.equiv(((java.lang.Object)"+"), ((java.lang.Object)offset_sign13))) {
       __r4041 = const__3;
      } else {
       Object __r4042;
       Object __r4043 = const__18;
       if (__r4043 != null && !(__r4043 == Boolean.FALSE)) {
        __r4042 = const__2;
       } else {
        __r4042 = null;
       }
       __r4041 = __r4042;
      }
      __r4040 = (java.lang.Long)__r4041;
     }
     Object __r4044;
     Object __r4045 = ((IFn)const__14.getRawRoot()).invoke(offset_hours14);
     if (__r4045 != null && !(__r4045 == Boolean.FALSE)) {
      __r4044 = const__2;
     } else {
      __r4044 = ((IFn)const__13.getRawRoot()).invoke(offset_hours14);
     }
     Object __r4046;
     Object __r4047 = ((IFn)const__14.getRawRoot()).invoke(offset_minutes15);
     if (__r4047 != null && !(__r4047 == Boolean.FALSE)) {
      __r4046 = const__2;
     } else {
      __r4046 = ((IFn)const__13.getRawRoot()).invoke(offset_minutes15);
     }
     return ((IFn)new_instant1).invoke(((IFn)const__13.getRawRoot()).invoke(years6), __r4028, __r4030, __r4032, __r4034, __r4036, __r4038, (java.lang.Long)__r4040, __r4044, __r4046);
    }
   } else {
    Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)((IFn)const__19.getRawRoot()).invoke("Unrecognized date/time syntax: ", cs2))));
    return null;
   }
  }
 }
}
