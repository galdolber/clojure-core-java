package clojure;

import clojure.lang.*;

public final class core_bigint extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.BigInt.class;
  const__2 = (java.lang.Object)java.math.BigInteger.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "decimal?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "bigint");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "float?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "double");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "number?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_bigint() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if ((x1 instanceof clojure.lang.BigInt)) {
   return x1;
  } else {
   if ((x1 instanceof java.math.BigInteger)) {
    return ((clojure.lang.BigInt)clojure.lang.BigInt.fromBigInteger((java.math.BigInteger)((java.math.BigInteger)x1)));
   } else {
    Object __r2657 = ((IFn)const__3.getRawRoot()).invoke(x1);
    if (__r2657 != null && !(__r2657 == Boolean.FALSE)) {
     return ((IFn)const__4.getRawRoot()).invoke(((java.math.BigInteger)((java.math.BigDecimal)x1).toBigInteger()));
    } else {
     Object __r2659 = ((IFn)const__5.getRawRoot()).invoke(x1);
     if (__r2659 != null && !(__r2659 == Boolean.FALSE)) {
      return ((IFn)const__4.getRawRoot()).invoke(((java.math.BigDecimal)java.math.BigDecimal.valueOf((double)clojure.lang.RT.doubleCast(((java.lang.Object)x1)))));
     } else {
      Object __r2661 = ((IFn)const__7.getRawRoot()).invoke(x1);
      if (__r2661 != null && !(__r2661 == Boolean.FALSE)) {
       return ((IFn)const__4.getRawRoot()).invoke(((java.math.BigInteger)((clojure.lang.Ratio)x1).bigIntegerValue()));
      } else {
       Object __r2663 = ((IFn)const__8.getRawRoot()).invoke(x1);
       if (__r2663 != null && !(__r2663 == Boolean.FALSE)) {
        return ((clojure.lang.BigInt)clojure.lang.BigInt.valueOf((long)clojure.lang.RT.longCast(((java.lang.Object)x1))));
       } else {
        Object __r2665 = const__10;
        if (__r2665 != null && !(__r2665 == Boolean.FALSE)) {
         return ((IFn)const__4.getRawRoot()).invoke(new java.math.BigInteger((java.lang.String)((java.lang.String)x1)));
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
