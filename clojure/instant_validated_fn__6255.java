package clojure;

import clojure.lang.*;

public final class instant_validated_fn__6255 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__1 = (java.lang.Object)1L;
  const__2 = (java.lang.Object)12L;
  const__3 = (clojure.lang.Var)RT.var("clojure.instant", "days-in-month");
  const__4 = (clojure.lang.Var)RT.var("clojure.instant", "leap-year?");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)23L;
  const__7 = (java.lang.Object)59L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (java.lang.Object)60L;
  const__10 = (java.lang.Object)999999999L;
  const__11 = (java.lang.Object)(-1L);
 }
 Object new_instance1;
 public instant_validated_fn__6255(final Object new_instance1) {
  super();
  this.new_instance1 = new_instance1;
 }
 public java.lang.Object invoke(java.lang.Object years1, java.lang.Object months2, java.lang.Object days3, java.lang.Object hours4, java.lang.Object minutes5, java.lang.Object seconds6, java.lang.Object nanoseconds7, java.lang.Object offset_sign8, java.lang.Object offset_hours9, java.lang.Object offset_minutes10) {
  Object __r4055 = ((IFn)const__0.getRawRoot()).invoke(const__1, months2, const__2);
  if (__r4055 != null && !(__r4055 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 1 months 12)")));
  }
  Object __r4057 = ((IFn)const__0.getRawRoot()).invoke(const__1, days3, ((IFn)const__3.getRawRoot()).invoke(months2, ((IFn)const__4.getRawRoot()).invoke(years1)));
  if (__r4057 != null && !(__r4057 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 1 days (days-in-month months (leap-year? years)))")));
  }
  Object __r4059 = ((IFn)const__0.getRawRoot()).invoke(const__5, hours4, const__6);
  if (__r4059 != null && !(__r4059 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 hours 23)")));
  }
  Object __r4061 = ((IFn)const__0.getRawRoot()).invoke(const__5, minutes5, const__7);
  if (__r4061 != null && !(__r4061 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 minutes 59)")));
  }
  Object __r4063;
  if (clojure.lang.Util.equiv(((java.lang.Object)minutes5), (long)59L)) {
   __r4063 = const__9;
  } else {
   __r4063 = const__7;
  }
  Object __r4064 = ((IFn)const__0.getRawRoot()).invoke(const__5, seconds6, (java.lang.Long)__r4063);
  if (__r4064 != null && !(__r4064 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 seconds (if (= minutes 59) 60 59))")));
  }
  Object __r4066 = ((IFn)const__0.getRawRoot()).invoke(const__5, nanoseconds7, const__10);
  if (__r4066 != null && !(__r4066 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 nanoseconds 999999999)")));
  }
  Object __r4068 = ((IFn)const__0.getRawRoot()).invoke(const__11, offset_sign8, const__1);
  if (__r4068 != null && !(__r4068 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= -1 offset-sign 1)")));
  }
  Object __r4070 = ((IFn)const__0.getRawRoot()).invoke(const__5, offset_hours9, const__6);
  if (__r4070 != null && !(__r4070 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 offset-hours 23)")));
  }
  Object __r4072 = ((IFn)const__0.getRawRoot()).invoke(const__5, offset_minutes10, const__7);
  if (__r4072 != null && !(__r4072 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"failed: (<= 0 offset-minutes 59)")));
  }
  return ((IFn)this.new_instance1).invoke(years1, months2, days3, hours4, minutes5, seconds6, nanoseconds7, offset_sign8, offset_hours9, offset_minutes10);
 }
}
