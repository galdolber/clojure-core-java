package clojure;

import clojure.lang.*;

public final class core_float_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Double.class;
  const__2 = (java.lang.Object)java.lang.Float.class;
 }
 public core_float_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  {
   boolean or__3968__auto__2 = (n1 instanceof java.lang.Double);
   if (or__3968__auto__2) {
    return (or__3968__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   } else {
    return ((n1 instanceof java.lang.Float) ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
