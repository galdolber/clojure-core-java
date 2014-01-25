package clojure;

import clojure.lang.*;

public final class instant_leap_year_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "divisible?");
  const__1 = (java.lang.Object)4L;
  const__2 = (clojure.lang.Var)RT.var("clojure.instant", "indivisible?");
  const__3 = (java.lang.Object)100L;
  const__4 = (java.lang.Object)400L;
 }
 public instant_leap_year_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object year1) {
  {
   Object and__3966__auto__2 = ((IFn)const__0.getRawRoot()).invoke(year1, const__1);
   Object __r4049 = and__3966__auto__2;
   if (__r4049 != null && !(__r4049 == Boolean.FALSE)) {
    {
     Object or__3968__auto__3 = ((IFn)const__2.getRawRoot()).invoke(year1, const__3);
     Object __r4051 = or__3968__auto__3;
     if (__r4051 != null && !(__r4051 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      return ((IFn)const__0.getRawRoot()).invoke(year1, const__4);
     }
    }
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
