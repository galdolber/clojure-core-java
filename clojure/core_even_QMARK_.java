package clojure;

import clojure.lang.*;

public final class core_even_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "integer?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_even_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  Object __r2375 = ((IFn)const__0.getRawRoot()).invoke(n1);
  if (__r2375 != null && !(__r2375 == Boolean.FALSE)) {
   return (clojure.lang.Numbers.isZero((long)clojure.lang.Numbers.and((long)clojure.lang.RT.uncheckedLongCast(((java.lang.Object)n1)), (long)1L)) ? Boolean.TRUE : Boolean.FALSE);
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke("Argument must be an integer: ", n1))));
   return null;
  }
 }
}
