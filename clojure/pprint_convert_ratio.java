package clojure;

import clojure.lang.*;

public final class pprint_convert_ratio extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "double");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "==");
  const__3 = (java.lang.Object)0.0;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "bigdec");
 }
 public pprint_convert_ratio() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r5265 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r5265 != null && !(__r5265 == Boolean.FALSE)) {
   {
    double d2 = clojure.lang.RT.doubleCast(((java.lang.Object)x1));
    if (clojure.lang.Numbers.equiv((double)d2, (double)0.0)) {
     Object __r5268 = ((IFn)const__4.getRawRoot()).invoke(x1, const__5);
     if (__r5268 != null && !(__r5268 == Boolean.FALSE)) {
      return ((IFn)const__6.getRawRoot()).invoke(x1);
     } else {
      return Double.valueOf(d2);
     }
    } else {
     Object __r5270 = null;
     boolean or__3968__auto__3 = clojure.lang.Numbers.equiv((double)d2, (double)java.lang.Double.POSITIVE_INFINITY);
     Object __r5271;
     if (or__3968__auto__3) {
      __r5271 = or__3968__auto__3;
     } else {
      __r5271 = clojure.lang.Numbers.equiv((double)d2, (double)java.lang.Double.NEGATIVE_INFINITY);
     }
     if ((java.lang.Boolean)__r5271) {
      return ((IFn)const__6.getRawRoot()).invoke(x1);
     } else {
      return Double.valueOf(d2);
     }
    }
   }
  } else {
   return x1;
  }
 }
}
