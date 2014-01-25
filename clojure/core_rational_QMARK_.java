package clojure;

import clojure.lang.*;

public final class core_rational_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "integer?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "decimal?");
 }
 public core_rational_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  {
   Object or__3968__auto__2 = ((IFn)const__0.getRawRoot()).invoke(n1);
   Object __r2651 = or__3968__auto__2;
   if (__r2651 != null && !(__r2651 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    {
     Object or__3968__auto__3 = ((IFn)const__1.getRawRoot()).invoke(n1);
     Object __r2653 = or__3968__auto__3;
     if (__r2653 != null && !(__r2653 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      return ((IFn)const__2.getRawRoot()).invoke(n1);
     }
    }
   }
  }
 }
}
