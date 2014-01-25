package clojure;

import clojure.lang.*;

public final class instant_construct_calendar extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__2 = (java.lang.Object)1000000L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
 }
 public instant_construct_calendar() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object years1, java.lang.Object months2, java.lang.Object days3, java.lang.Object hours4, java.lang.Object minutes5, java.lang.Object seconds6, java.lang.Object nanoseconds7, java.lang.Object offset_sign8, java.lang.Object offset_hours9, java.lang.Object offset_minutes10) {
  {
   Object G__628511 = new java.util.GregorianCalendar((int)RT.intCast(years1), (int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)months2)))), (int)RT.intCast(days3), (int)RT.intCast(hours4), (int)RT.intCast(minutes5), (int)RT.intCast(seconds6));
   ((java.util.Calendar)G__628511).set((int)java.util.Calendar.MILLISECOND, (int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)nanoseconds7), (long)1000000L))));
   Object __r4073;
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)offset_sign8))) {
    __r4073 = "-";
   } else {
    __r4073 = "+";
   }
   ((java.util.GregorianCalendar)G__628511).setTimeZone((java.util.TimeZone)((java.util.TimeZone)((java.util.TimeZone)java.util.TimeZone.getTimeZone((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke("GMT%s%02d:%02d", __r4073, offset_hours9, offset_minutes10))))));
   return G__628511;
  }
 }
}
