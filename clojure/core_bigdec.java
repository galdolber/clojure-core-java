package clojure;

import clojure.lang.*;

public final class core_bigdec extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "decimal?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "float?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "double");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "/");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__6 = (java.lang.Object)clojure.lang.BigInt.class;
  const__7 = (java.lang.Object)java.math.BigInteger.class;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "number?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_bigdec() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r2679 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r2679 != null && !(__r2679 == Boolean.FALSE)) {
   return x1;
  } else {
   Object __r2681 = ((IFn)const__1.getRawRoot()).invoke(x1);
   if (__r2681 != null && !(__r2681 == Boolean.FALSE)) {
    return ((java.math.BigDecimal)java.math.BigDecimal.valueOf((double)clojure.lang.RT.doubleCast(((java.lang.Object)x1))));
   } else {
    Object __r2683 = ((IFn)const__3.getRawRoot()).invoke(x1);
    if (__r2683 != null && !(__r2683 == Boolean.FALSE)) {
     return ((java.lang.Number)clojure.lang.Numbers.divide(((java.lang.Object)new java.math.BigDecimal((java.math.BigInteger)((java.math.BigInteger)((java.math.BigInteger)((clojure.lang.Ratio)x1).numerator)))), ((java.lang.Object)((java.math.BigInteger)((clojure.lang.Ratio)x1).denominator))));
    } else {
     if ((x1 instanceof clojure.lang.BigInt)) {
      return ((java.math.BigDecimal)((clojure.lang.BigInt)x1).toBigDecimal());
     } else {
      if ((x1 instanceof java.math.BigInteger)) {
       return new java.math.BigDecimal((java.math.BigInteger)((java.math.BigInteger)x1));
      } else {
       Object __r2687 = ((IFn)const__8.getRawRoot()).invoke(x1);
       if (__r2687 != null && !(__r2687 == Boolean.FALSE)) {
        return ((java.math.BigDecimal)java.math.BigDecimal.valueOf((long)clojure.lang.RT.longCast(((java.lang.Object)x1))));
       } else {
        Object __r2689 = const__10;
        if (__r2689 != null && !(__r2689 == Boolean.FALSE)) {
         return new java.math.BigDecimal((java.lang.String)((java.lang.String)x1));
        } else {
         return null;
        }
       }
      }
     }
    }
   }
  }
 }
}
