package clojure;

import clojure.lang.*;

public final class core_biginteger extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.math.BigInteger.class;
  const__2 = (java.lang.Object)clojure.lang.BigInt.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "decimal?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "float?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "double");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "number?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_biginteger() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if ((x1 instanceof java.math.BigInteger)) {
   return x1;
  } else {
   if ((x1 instanceof clojure.lang.BigInt)) {
    return ((java.math.BigInteger)((clojure.lang.BigInt)x1).toBigInteger());
   } else {
    Object __r2669 = ((IFn)const__3.getRawRoot()).invoke(x1);
    if (__r2669 != null && !(__r2669 == Boolean.FALSE)) {
     return ((java.math.BigInteger)((java.math.BigDecimal)x1).toBigInteger());
    } else {
     Object __r2671 = ((IFn)const__4.getRawRoot()).invoke(x1);
     if (__r2671 != null && !(__r2671 == Boolean.FALSE)) {
      return ((java.math.BigInteger)((java.math.BigDecimal)((java.math.BigDecimal)java.math.BigDecimal.valueOf((double)clojure.lang.RT.doubleCast(((java.lang.Object)x1))))).toBigInteger());
     } else {
      Object __r2673 = ((IFn)const__6.getRawRoot()).invoke(x1);
      if (__r2673 != null && !(__r2673 == Boolean.FALSE)) {
       return ((java.math.BigInteger)((clojure.lang.Ratio)x1).bigIntegerValue());
      } else {
       Object __r2675 = ((IFn)const__7.getRawRoot()).invoke(x1);
       if (__r2675 != null && !(__r2675 == Boolean.FALSE)) {
        return ((java.math.BigInteger)java.math.BigInteger.valueOf((long)clojure.lang.RT.longCast(((java.lang.Object)x1))));
       } else {
        Object __r2677 = const__9;
        if (__r2677 != null && !(__r2677 == Boolean.FALSE)) {
         return new java.math.BigInteger((java.lang.String)((java.lang.String)x1));
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
