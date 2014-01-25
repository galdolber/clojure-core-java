package clojure;

import clojure.lang.*;

public final class instant_print_date extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "thread-local-utc-date-format");
 }
 public instant_print_date() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object d1, java.lang.Object w2) {
  try {
   {
    Object utc_format3 = ((java.lang.Object)((java.lang.ThreadLocal)const__0.getRawRoot()).get());
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#inst \""));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.text.DateFormat)utc_format3).format((java.util.Date)((java.util.Date)d1)))));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"\""));
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
