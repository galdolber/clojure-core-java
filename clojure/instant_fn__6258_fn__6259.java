package clojure;

import clojure.lang.*;

public final class instant_fn__6258_fn__6259 extends clojure.lang.AFunction {
 static {
 }
 public instant_fn__6258_fn__6259() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  {
   Object G__62602 = new java.text.SimpleDateFormat((java.lang.String)((java.lang.String)"yyyy-MM-dd'T'HH:mm:ss.SSS-00:00"));
   ((java.text.DateFormat)G__62602).setTimeZone((java.util.TimeZone)((java.util.TimeZone)((java.util.TimeZone)java.util.TimeZone.getTimeZone((java.lang.String)((java.lang.String)"GMT")))));
   return G__62602;
  }
 }
}
