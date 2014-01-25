package clojure;

import clojure.lang.*;

public final class instant_fn__6274_fn__6275 extends clojure.lang.AFunction {
 static {
 }
 public instant_fn__6274_fn__6275() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  {
   Object G__62762 = new java.text.SimpleDateFormat((java.lang.String)((java.lang.String)"yyyy-MM-dd'T'HH:mm:ss"));
   ((java.text.DateFormat)G__62762).setTimeZone((java.util.TimeZone)((java.util.TimeZone)((java.util.TimeZone)java.util.TimeZone.getTimeZone((java.lang.String)((java.lang.String)"GMT")))));
   return G__62762;
  }
 }
}
