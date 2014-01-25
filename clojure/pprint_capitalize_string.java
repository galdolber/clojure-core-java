package clojure;

import clojure.lang.*;

public final class pprint_capitalize_string extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_capitalize_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object first_QMARK_2) {
  {
   Object f3 = ((IFn)const__0.getRawRoot()).invoke(s1);
   Object __r5587;
   Object __r5588 = null;
   {
    Object and__3966__auto__4 = first_QMARK_2;
    Object __r5589;
    Object __r5590 = and__3966__auto__4;
    if (__r5590 != null && !(__r5590 == Boolean.FALSE)) {
     Object __r5591 = null;
     {
      Object and__3966__auto__5 = f3;
      Object __r5592;
      Object __r5593 = and__3966__auto__5;
      if (__r5593 != null && !(__r5593 == Boolean.FALSE)) {
       __r5592 = (java.lang.Character.isLetter((char)((Character)f3).charValue()) ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r5592 = and__3966__auto__5;
      }
      __r5591 = __r5592;
     }
     __r5589 = __r5591;
    } else {
     __r5589 = and__3966__auto__4;
    }
    __r5588 = __r5589;
   }
   Object __r5594 = __r5588;
   if (__r5594 != null && !(__r5594 == Boolean.FALSE)) {
    __r5587 = ((IFn)const__1.getRawRoot()).invoke(Character.valueOf(java.lang.Character.toUpperCase((char)((Character)f3).charValue())), ((IFn)const__2.getRawRoot()).invoke(s1, const__3));
   } else {
    __r5587 = s1;
   }
   Object s6 = __r5587;
   return ((IFn)const__4.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(new clojure.pprint_capitalize_string_fn__7879(), s6)));
  }
 }
}
