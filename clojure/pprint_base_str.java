package clojure;

import clojure.lang.*;

public final class pprint_base_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "float?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "bigdec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "ratio?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "/");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "remainders");
 }
 public pprint_base_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object base1, java.lang.Object val2) {
  if (clojure.lang.Numbers.isZero(((java.lang.Object)val2))) {
   return "0";
  } else {
   {
    Object __r5102;
    Object __r5103 = ((IFn)const__1.getRawRoot()).invoke(val2);
    if (__r5103 != null && !(__r5103 == Boolean.FALSE)) {
     __r5102 = ((IFn)const__2.getRawRoot()).invoke(val2);
    } else {
     Object __r5104;
     Object __r5105 = ((IFn)const__3.getRawRoot()).invoke(val2);
     if (__r5105 != null && !(__r5105 == Boolean.FALSE)) {
      Object __r5106 = null;
      {
       Object r3 = val2;
       __r5106 = ((java.lang.Number)clojure.lang.Numbers.divide((java.math.BigInteger)((java.math.BigInteger)((java.math.BigInteger)((clojure.lang.Ratio)r3).numerator)), (java.math.BigInteger)((java.math.BigInteger)((java.math.BigInteger)((clojure.lang.Ratio)r3).denominator))));
      }
      __r5104 = __r5106;
     } else {
      Object __r5107;
      Object __r5108 = const__5;
      if (__r5108 != null && !(__r5108 == Boolean.FALSE)) {
       __r5107 = val2;
      } else {
       __r5107 = null;
      }
      __r5104 = __r5107;
     }
     __r5102 = __r5104;
    }
    Object xlated_val4 = __r5102;
    return ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(new clojure.pprint_base_str_fn__7687(), ((IFn)const__9.getRawRoot()).invoke(base1, val2)));
   }
  }
 }
}
