package clojure;

import clojure.lang.*;

public final class pprint_format_simple_ordinal extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
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
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "english-ordinal-units");
  const__10 = (java.lang.Object)10L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "english-ordinal-tens");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "english-cardinal-tens");
 }
 public pprint_format_simple_ordinal() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object num1) {
  {
   Object hundreds2 = ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)num1), (long)100L));
   Object tens3 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)num1), (long)100L));
   Object __r5158;
   if (clojure.lang.Numbers.isPos(((java.lang.Object)hundreds2))) {
    __r5158 = ((IFn)const__3.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__6.getRawRoot()), (int)RT.intCast(hundreds2))), " hundred");
   } else {
    __r5158 = null;
   }
   Object __r5159;
   Object __r5160 = null;
   boolean and__3966__auto__4 = clojure.lang.Numbers.isPos(((java.lang.Object)hundreds2));
   Object __r5161;
   if (and__3966__auto__4) {
    __r5161 = clojure.lang.Numbers.isPos(((java.lang.Object)tens3));
   } else {
    __r5161 = and__3966__auto__4;
   }
   if ((java.lang.Boolean)__r5161) {
    __r5159 = " ";
   } else {
    __r5159 = null;
   }
   Object __r5162;
   if (clojure.lang.Numbers.isPos(((java.lang.Object)tens3))) {
    Object __r5163;
    if (clojure.lang.Numbers.lt(((java.lang.Object)tens3), (long)20L)) {
     __r5163 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__9.getRawRoot()), (int)RT.intCast(tens3)));
    } else {
     Object __r5164 = null;
     {
      Object ten_digit5 = ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)tens3), (long)10L));
      Object unit_digit6 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)tens3), (long)10L));
      Object __r5165;
      Object __r5166 = null;
      {
       boolean and__3966__auto__7 = clojure.lang.Numbers.isPos(((java.lang.Object)ten_digit5));
       Object __r5167;
       if (and__3966__auto__7) {
        __r5167 = ((IFn)const__11.getRawRoot()).invoke((clojure.lang.Numbers.isPos(((java.lang.Object)unit_digit6)) ? Boolean.TRUE : Boolean.FALSE));
       } else {
        __r5167 = (and__3966__auto__7 ? Boolean.TRUE : Boolean.FALSE);
       }
       __r5166 = __r5167;
      }
      Object __r5168 = __r5166;
      if (__r5168 != null && !(__r5168 == Boolean.FALSE)) {
       __r5165 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__12.getRawRoot()), (int)RT.intCast(ten_digit5)));
      } else {
       Object __r5169;
       if (clojure.lang.Numbers.isPos(((java.lang.Object)ten_digit5))) {
        __r5169 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__13.getRawRoot()), (int)RT.intCast(ten_digit5)));
       } else {
        __r5169 = null;
       }
       Object __r5170;
       Object __r5171 = null;
       boolean and__3966__auto__8 = clojure.lang.Numbers.isPos(((java.lang.Object)ten_digit5));
       Object __r5172;
       if (and__3966__auto__8) {
        __r5172 = clojure.lang.Numbers.isPos(((java.lang.Object)unit_digit6));
       } else {
        __r5172 = and__3966__auto__8;
       }
       if ((java.lang.Boolean)__r5172) {
        __r5170 = "-";
       } else {
        __r5170 = null;
       }
       Object __r5173;
       if (clojure.lang.Numbers.isPos(((java.lang.Object)unit_digit6))) {
        __r5173 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__9.getRawRoot()), (int)RT.intCast(unit_digit6)));
       } else {
        __r5173 = null;
       }
       __r5165 = ((IFn)const__3.getRawRoot()).invoke(__r5169, __r5170, __r5173);
      }
      __r5164 = __r5165;
     }
     __r5163 = __r5164;
    }
    __r5162 = __r5163;
   } else {
    Object __r5174;
    if (clojure.lang.Numbers.isPos(((java.lang.Object)hundreds2))) {
     __r5174 = "th";
    } else {
     __r5174 = null;
    }
    __r5162 = __r5174;
   }
   return ((IFn)const__3.getRawRoot()).invoke(__r5158, __r5159, __r5162);
  }
 }
}
