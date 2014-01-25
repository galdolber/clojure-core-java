package clojure;

import clojure.lang.*;

public final class instant_print_calendar extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__2 = (java.lang.Object)2L;
  const__3 = (java.lang.Object)0L;
 }
 public instant_print_calendar() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object w2) {
  try {
   {
    Object calstr3 = ((IFn)const__0.getRawRoot()).invoke("%1$tFT%1$tT.%1$tL%1$tz", c1);
    long offset_minutes4 = clojure.lang.Numbers.minus((long)((java.lang.String)calstr3).length(), (long)2L);
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#inst \""));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)calstr3), (int)RT.intCast(0L), (int)RT.intCast(offset_minutes4));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)":"));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)calstr3), (int)RT.intCast(offset_minutes4), (int)RT.intCast(2L));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"\""));
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
