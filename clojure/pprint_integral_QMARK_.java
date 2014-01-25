package clojure;

import clojure.lang.*;

public final class pprint_integral_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "integer?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "decimal?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "bigdec");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "float?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public pprint_integral_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r5090 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r5090 != null && !(__r5090 == Boolean.FALSE)) {
   return Boolean.TRUE;
  } else {
   Object __r5092 = ((IFn)const__1.getRawRoot()).invoke(x1);
   if (__r5092 != null && !(__r5092 == Boolean.FALSE)) {
    return (clojure.lang.Numbers.gte(((java.lang.Object)((java.math.BigDecimal)((java.math.BigDecimal)((java.math.BigDecimal)((java.math.BigDecimal)((IFn)const__3.getRawRoot()).invoke(const__4)).stripTrailingZeros())).ulp())), (long)1L) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    Object __r5094 = ((IFn)const__6.getRawRoot()).invoke(x1);
    if (__r5094 != null && !(__r5094 == Boolean.FALSE)) {
     return (clojure.lang.Util.equiv(((java.lang.Object)x1), (double)java.lang.Math.floor((double)RT.doubleCast(x1))) ? Boolean.TRUE : Boolean.FALSE);
    } else {
     Object __r5096 = ((IFn)const__8.getRawRoot()).invoke(x1);
     if (__r5096 != null && !(__r5096 == Boolean.FALSE)) {
      {
       Object r2 = x1;
       return (clojure.lang.Util.equiv((long)0L, ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)((java.math.BigInteger)((clojure.lang.Ratio)r2).numerator)), ((java.lang.Object)((java.math.BigInteger)((clojure.lang.Ratio)r2).denominator)))))) ? Boolean.TRUE : Boolean.FALSE);
      }
     } else {
      Object __r5098 = const__10;
      if (__r5098 != null && !(__r5098 == Boolean.FALSE)) {
       return Boolean.FALSE;
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
