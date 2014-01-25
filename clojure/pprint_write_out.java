package clojure;

import clojure.lang.*;

public final class pprint_write_out extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pretty*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pprint-dispatch*");
 }
 public pprint_write_out() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object object1) {
  {
   Object __r4998 = null;
   {
    Object and__3966__auto__2 = const__0.get();
    Object __r4999;
    Object __r5000 = and__3966__auto__2;
    if (__r5000 != null && !(__r5000 == Boolean.FALSE)) {
     Object __r5001 = null;
     {
      Object and__3966__auto__3 = const__1.get();
      Object __r5002;
      Object __r5003 = and__3966__auto__3;
      if (__r5003 != null && !(__r5003 == Boolean.FALSE)) {
       __r5002 = (clojure.lang.Numbers.gte(((java.lang.Object)const__0.get()), ((java.lang.Object)const__1.get())) ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r5002 = and__3966__auto__3;
      }
      __r5001 = __r5002;
     }
     __r4999 = __r5001;
    } else {
     __r4999 = and__3966__auto__2;
    }
    __r4998 = __r4999;
   }
   Object length_reached4 = __r4998;
   Object __r5005 = ((IFn)const__3.getRawRoot()).invoke(const__4.get());
   if (__r5005 != null && !(__r5005 == Boolean.FALSE)) {
    ((IFn)const__5.get()).invoke(object1);
   } else {
    Object __r5007 = length_reached4;
    if (__r5007 != null && !(__r5007 == Boolean.FALSE)) {
     ((IFn)const__6.getRawRoot()).invoke("...");
    } else {
     Object __r5009 = const__0.get();
     if (__r5009 != null && !(__r5009 == Boolean.FALSE)) {
      const__0.set(((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)const__0.get()))));
     } else {
     }
     ((IFn)const__8.get()).invoke(object1);
    }
   }
   return length_reached4;
  }
 }
}
