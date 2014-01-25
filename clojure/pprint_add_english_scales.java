package clojure;

import clojure.lang.*;

public final class pprint_add_english_scales extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "english-scale-numbers");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public pprint_add_english_scales() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object parts1, java.lang.Object offset2) {
  {
   int cnt3 = clojure.lang.RT.count(((java.lang.Object)parts1));
   {
    Object acc4 = clojure.lang.PersistentVector.EMPTY;
    long pos5 = clojure.lang.Numbers.dec((long)cnt3);
    Object this6 = ((IFn)const__2.getRawRoot()).invoke(parts1);
    Object remainder7 = ((IFn)const__3.getRawRoot()).invoke(parts1);
    while(true) {
     if (clojure.lang.Util.identical(((java.lang.Object)remainder7), ((java.lang.Object)null))) {
      Object __r5142;
      Object __r5143 = null;
      {
       Object and__3966__auto__8 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(this6));
       Object __r5144;
       Object __r5145 = and__3966__auto__8;
       if (__r5145 != null && !(__r5145 == Boolean.FALSE)) {
        __r5144 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(acc4));
       } else {
        __r5144 = and__3966__auto__8;
       }
       __r5143 = __r5144;
      }
      Object __r5146 = __r5143;
      if (__r5146 != null && !(__r5146 == Boolean.FALSE)) {
       __r5142 = ", ";
      } else {
       __r5142 = null;
      }
      Object __r5147;
      Object __r5148 = null;
      {
       Object and__3966__auto__9 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(this6));
       Object __r5149;
       Object __r5150 = and__3966__auto__9;
       if (__r5150 != null && !(__r5150 == Boolean.FALSE)) {
        __r5149 = (clojure.lang.Numbers.isPos(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add((long)pos5, ((java.lang.Object)offset2))))) ? Boolean.TRUE : Boolean.FALSE);
       } else {
        __r5149 = and__3966__auto__9;
       }
       __r5148 = __r5149;
      }
      Object __r5151 = __r5148;
      if (__r5151 != null && !(__r5151 == Boolean.FALSE)) {
       __r5147 = ((IFn)const__5.getRawRoot()).invoke(" ", ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__13.getRawRoot()), (int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.add((long)pos5, ((java.lang.Object)offset2)))))));
      } else {
       __r5147 = null;
      }
      return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__7.getRawRoot()).invoke(", ", acc4)), __r5142, this6, __r5147);
     } else {
      Object __r5152;
      Object __r5153 = ((IFn)const__9.getRawRoot()).invoke(this6);
      if (__r5153 != null && !(__r5153 == Boolean.FALSE)) {
       __r5152 = acc4;
      } else {
       __r5152 = ((IFn)const__14.getRawRoot()).invoke(acc4, ((IFn)const__5.getRawRoot()).invoke(this6, " ", ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)const__13.getRawRoot()), (int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.add((long)pos5, ((java.lang.Object)offset2))))))));
      }
      java.lang.Object acc4___aux = __r5152;
      long pos5___aux = clojure.lang.Numbers.dec((long)pos5);
      java.lang.Object this6___aux = ((IFn)const__2.getRawRoot()).invoke(remainder7);
      java.lang.Object remainder7___aux = ((IFn)const__3.getRawRoot()).invoke(remainder7);
      acc4 = acc4___aux;
      pos5 = pos5___aux;
      this6 = this6___aux;
      remainder7 = remainder7___aux;
      continue;
     }
    }
   }
  }
 }
}
