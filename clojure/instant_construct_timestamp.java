package clojure;

import clojure.lang.*;

public final class instant_construct_timestamp extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "construct-calendar");
  const__1 = (java.lang.Object)0L;
 }
 public instant_construct_timestamp() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object years1, java.lang.Object months2, java.lang.Object days3, java.lang.Object hours4, java.lang.Object minutes5, java.lang.Object seconds6, java.lang.Object nanoseconds7, java.lang.Object offset_sign8, java.lang.Object offset_hours9, java.lang.Object offset_minutes10) {
  {
   Object G__628811 = new java.sql.Timestamp((long)((java.util.Calendar)((IFn)const__0.getRawRoot()).invoke(years1, months2, days3, hours4, minutes5, seconds6, const__1, offset_sign8, offset_hours9, offset_minutes10)).getTimeInMillis());
   ((java.sql.Timestamp)G__628811).setNanos((int)RT.intCast(nanoseconds7));
   return G__628811;
  }
 }
}
