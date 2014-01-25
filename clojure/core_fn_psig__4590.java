package clojure;

import clojure.lang.*;

public final class core_fn_psig__4590 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Var const__26;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "pre");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "post");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "%");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, "%");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "maybe-destructured");
 }
 Object sigs6;
 public core_fn_psig__4590(final Object sigs6) {
  super();
  this.sigs6 = sigs6;
 }
 public java.lang.Object invoke(java.lang.Object sig1) {
  Object __r2823 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(sig1));
  if (__r2823 != null && !(__r2823 == Boolean.FALSE)) {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke("Invalid signature ", sig1, " should be a list"))));
  } else {
  }
  {
   Object vec__45912 = sig1;
   Object params3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__45912), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object body4 = ((IFn)const__5.getRawRoot()).invoke(vec__45912, const__6);
   Object __r2824;
   Object __r2825 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(params3));
   if (__r2825 != null && !(__r2825 == Boolean.FALSE)) {
    Object __r2826;
    Object __r2827 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this.sigs6));
    if (__r2827 != null && !(__r2827 == Boolean.FALSE)) {
     __r2826 = ((IFn)const__2.getRawRoot()).invoke("Parameter declaration ", params3, " should be a vector");
    } else {
     __r2826 = ((IFn)const__2.getRawRoot()).invoke("Invalid signature ", sig1, " should be a list");
    }
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)__r2826)));
    __r2824 = null;
   } else {
    __r2824 = null;
   }
   Object _5 = __r2824;
   Object __r2828;
   Object __r2829 = null;
   {
    Object and__3966__auto__6 = ((IFn)const__9.getRawRoot()).invoke(body4);
    Object __r2830;
    Object __r2831 = and__3966__auto__6;
    if (__r2831 != null && !(__r2831 == Boolean.FALSE)) {
     __r2830 = ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(body4));
    } else {
     __r2830 = and__3966__auto__6;
    }
    __r2829 = __r2830;
   }
   Object __r2832 = __r2829;
   if (__r2832 != null && !(__r2832 == Boolean.FALSE)) {
    __r2828 = ((IFn)const__8.getRawRoot()).invoke(body4);
   } else {
    __r2828 = null;
   }
   Object conds7 = __r2828;
   Object __r2833;
   Object __r2834 = conds7;
   if (__r2834 != null && !(__r2834 == Boolean.FALSE)) {
    __r2833 = ((IFn)const__9.getRawRoot()).invoke(body4);
   } else {
    __r2833 = body4;
   }
   Object body8 = __r2833;
   Object __r2835 = null;
   {
    Object or__3968__auto__9 = conds7;
    Object __r2836;
    Object __r2837 = or__3968__auto__9;
    if (__r2837 != null && !(__r2837 == Boolean.FALSE)) {
     __r2836 = or__3968__auto__9;
    } else {
     __r2836 = ((IFn)const__11.getRawRoot()).invoke(params3);
    }
    __r2835 = __r2836;
   }
   Object conds10 = __r2835;
   Object pre11 = RT.get(conds10, Keyword.intern(null, "pre"));
   Object post12 = RT.get(conds10, Keyword.intern(null, "post"));
   Object __r2838;
   Object __r2839 = post12;
   if (__r2839 != null && !(__r2839 == Boolean.FALSE)) {
    Object __r2840;
    if (clojure.lang.Numbers.lt((long)1L, (long)clojure.lang.RT.count(((java.lang.Object)body8)))) {
     __r2840 = ((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__23), body8));
    } else {
     __r2840 = ((IFn)const__8.getRawRoot()).invoke(body8);
    }
    __r2838 = ((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17), ((IFn)const__16.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(const__19.getRawRoot(), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__20), ((IFn)const__16.getRawRoot()).invoke(__r2840))))), ((IFn)const__24.getRawRoot()).invoke(new clojure.core_fn_psig__4590_fn__4592(), post12), ((IFn)const__16.getRawRoot()).invoke(const__25))))));
   } else {
    __r2838 = body8;
   }
   Object body13 = __r2838;
   Object __r2841;
   Object __r2842 = pre11;
   if (__r2842 != null && !(__r2842 == Boolean.FALSE)) {
    __r2841 = ((IFn)const__15.getRawRoot()).invoke(((IFn)const__24.getRawRoot()).invoke(new clojure.core_fn_psig__4590_fn__4594(), pre11), body13);
   } else {
    __r2841 = body13;
   }
   Object body14 = __r2841;
   return ((IFn)const__26.getRawRoot()).invoke(params3, body14);
  }
 }
}
