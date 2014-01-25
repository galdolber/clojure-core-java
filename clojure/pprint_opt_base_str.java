package clojure;

import clojure.lang.*;

public final class pprint_opt_base_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "java-base-formats");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "integer?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__5 = (java.lang.Object)clojure.lang.BigInt.class;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "base-str");
 }
 public pprint_opt_base_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object base1, java.lang.Object val2) {
  {
   Object format_str3 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__1.getRawRoot()), ((java.lang.Object)base1)));
   Object __r5110 = null;
   {
    Object and__3966__auto__4 = format_str3;
    Object __r5111;
    Object __r5112 = and__3966__auto__4;
    if (__r5112 != null && !(__r5112 == Boolean.FALSE)) {
     Object __r5113 = null;
     {
      Object and__3966__auto__5 = ((IFn)const__2.getRawRoot()).invoke(val2);
      Object __r5114;
      Object __r5115 = and__3966__auto__5;
      if (__r5115 != null && !(__r5115 == Boolean.FALSE)) {
       __r5114 = ((IFn)const__3.getRawRoot()).invoke(((val2 instanceof clojure.lang.BigInt) ? Boolean.TRUE : Boolean.FALSE));
      } else {
       __r5114 = and__3966__auto__5;
      }
      __r5113 = __r5114;
     }
     __r5111 = __r5113;
    } else {
     __r5111 = and__3966__auto__4;
    }
    __r5110 = __r5111;
   }
   Object __r5116 = __r5110;
   if (__r5116 != null && !(__r5116 == Boolean.FALSE)) {
    return ((IFn)const__6.getRawRoot()).invoke(format_str3, val2);
   } else {
    return ((IFn)const__7.getRawRoot()).invoke(base1, val2);
   }
  }
 }
}
