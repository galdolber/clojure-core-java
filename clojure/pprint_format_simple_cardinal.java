package clojure;

import clojure.lang.*;

public final class pprint_format_simple_cardinal extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__1 = (java.lang.Object)100L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "english-cardinal-units");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__8 = (java.lang.Object)20L;
  const__9 = (java.lang.Object)10L;
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "english-cardinal-tens");
 }
 public pprint_format_simple_cardinal() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1) {
  {
   Object hundreds2 = ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)num1), (long)100L));
   Object tens3 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)num1), (long)100L));
   Object __r5129;
   if (clojure.lang.Numbers.isPos(((java.lang.Object)hundreds2))) {
    __r5129 = ((IFn)const__3.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__6.getRawRoot()), (int)RT.intCast(hundreds2))), " hundred");
   } else {
    __r5129 = null;
   }
   Object __r5130;
   Object __r5131 = null;
   boolean and__3966__auto__4 = clojure.lang.Numbers.isPos(((java.lang.Object)hundreds2));
   Object __r5132;
   if (and__3966__auto__4) {
    __r5132 = clojure.lang.Numbers.isPos(((java.lang.Object)tens3));
   } else {
    __r5132 = and__3966__auto__4;
   }
   if ((java.lang.Boolean)__r5132) {
    __r5130 = " ";
   } else {
    __r5130 = null;
   }
   Object __r5133;
   if (clojure.lang.Numbers.isPos(((java.lang.Object)tens3))) {
    Object __r5134;
    if (clojure.lang.Numbers.lt(((java.lang.Object)tens3), (long)20L)) {
     __r5134 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__6.getRawRoot()), (int)RT.intCast(tens3)));
    } else {
     Object __r5135 = null;
     {
      Object ten_digit5 = ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)tens3), (long)10L));
      Object unit_digit6 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)tens3), (long)10L));
      Object __r5136;
      if (clojure.lang.Numbers.isPos(((java.lang.Object)ten_digit5))) {
       __r5136 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__10.getRawRoot()), (int)RT.intCast(ten_digit5)));
      } else {
       __r5136 = null;
      }
      Object __r5137;
      Object __r5138 = null;
      boolean and__3966__auto__7 = clojure.lang.Numbers.isPos(((java.lang.Object)ten_digit5));
      Object __r5139;
      if (and__3966__auto__7) {
       __r5139 = clojure.lang.Numbers.isPos(((java.lang.Object)unit_digit6));
      } else {
       __r5139 = and__3966__auto__7;
      }
      if ((java.lang.Boolean)__r5139) {
       __r5137 = "-";
      } else {
       __r5137 = null;
      }
      Object __r5140;
      if (clojure.lang.Numbers.isPos(((java.lang.Object)unit_digit6))) {
       __r5140 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__6.getRawRoot()), (int)RT.intCast(unit_digit6)));
      } else {
       __r5140 = null;
      }
      __r5135 = ((IFn)const__3.getRawRoot()).invoke(__r5136, __r5137, __r5140);
     }
     __r5134 = __r5135;
    }
    __r5133 = __r5134;
   } else {
    __r5133 = null;
   }
   return ((IFn)const__3.getRawRoot()).invoke(__r5129, __r5130, __r5133);
  }
 }
}
