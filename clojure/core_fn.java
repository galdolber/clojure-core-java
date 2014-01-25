package clojure;

import clojure.lang.*;

public final class core_fn extends clojure.lang.RestFn {
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
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "fn*");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "fn*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_fn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object sigs3) {
  {
   Object __r2843;
   Object __r2844 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(sigs3));
   if (__r2844 != null && !(__r2844 == Boolean.FALSE)) {
    __r2843 = ((IFn)const__1.getRawRoot()).invoke(sigs3);
   } else {
    __r2843 = null;
   }
   Object name4 = __r2843;
   Object __r2845;
   Object __r2846 = name4;
   if (__r2846 != null && !(__r2846 == Boolean.FALSE)) {
    __r2845 = ((IFn)const__2.getRawRoot()).invoke(sigs3);
   } else {
    __r2845 = sigs3;
   }
   Object sigs5 = __r2845;
   Object __r2847;
   Object __r2848 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(sigs5));
   if (__r2848 != null && !(__r2848 == Boolean.FALSE)) {
    __r2847 = ((IFn)const__4.getRawRoot()).invoke(sigs5);
   } else {
    Object __r2849;
    Object __r2850 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(sigs5));
    if (__r2850 != null && !(__r2850 == Boolean.FALSE)) {
     __r2849 = sigs5;
    } else {
     Object __r2851;
     Object __r2852 = ((IFn)const__6.getRawRoot()).invoke(sigs5);
     if (__r2852 != null && !(__r2852 == Boolean.FALSE)) {
      __r2851 = ((IFn)const__7.getRawRoot()).invoke("Parameter declaration ", ((IFn)const__1.getRawRoot()).invoke(sigs5), " should be a vector");
     } else {
      __r2851 = ((IFn)const__7.getRawRoot()).invoke("Parameter declaration missing");
     }
     Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)__r2851)));
     __r2849 = null;
    }
    __r2847 = __r2849;
   }
   Object sigs6 = __r2847;
   Object psig7 = new clojure.core_fn_psig__4590(sigs6);
   Object new_sigs8 = ((IFn)const__8.getRawRoot()).invoke(psig7, sigs6);
   Object __r2853;
   Object __r2854 = name4;
   if (__r2854 != null && !(__r2854 == Boolean.FALSE)) {
    __r2853 = ((IFn)const__10.getRawRoot()).invoke(const__11, name4, new_sigs8);
   } else {
    __r2853 = ((IFn)const__12.getRawRoot()).invoke(const__13, new_sigs8);
   }
   return ((IFn)const__9.getRawRoot()).invoke(__r2853, ((IFn)const__14.getRawRoot()).invoke(_AMPERSAND_form1));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
