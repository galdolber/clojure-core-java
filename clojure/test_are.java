package clojure;

import clojure.lang.*;

public final class test_are extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "mod");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.template", "do-template");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "is");
 }
 public test_are() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object argv3, java.lang.Object expr4, java.lang.Object args5) {
  Object __r4708 = null;
  {
   Object __r4709 = null;
   {
    Object and__3966__auto__6 = ((IFn)const__0.getRawRoot()).invoke(argv3);
    Object __r4710;
    Object __r4711 = and__3966__auto__6;
    if (__r4711 != null && !(__r4711 == Boolean.FALSE)) {
     __r4710 = ((IFn)const__0.getRawRoot()).invoke(args5);
    } else {
     __r4710 = and__3966__auto__6;
    }
    __r4709 = __r4710;
   }
   Object or__3968__auto__7 = __r4709;
   Object __r4712;
   Object __r4713 = or__3968__auto__7;
   if (__r4713 != null && !(__r4713 == Boolean.FALSE)) {
    __r4712 = or__3968__auto__7;
   } else {
    Object __r4714 = null;
    {
     boolean and__3966__auto__8 = clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)argv3)));
     Object __r4715;
     if (and__3966__auto__8) {
      Object __r4716 = null;
      {
       boolean and__3966__auto__9 = clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)args5)));
       Object __r4717;
       if (and__3966__auto__9) {
        __r4717 = (clojure.lang.Numbers.isZero(((java.lang.Object)((IFn)const__4.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)args5))), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)argv3)))))) ? Boolean.TRUE : Boolean.FALSE);
       } else {
        __r4717 = (and__3966__auto__9 ? Boolean.TRUE : Boolean.FALSE);
       }
       __r4716 = (java.lang.Boolean)__r4717;
      }
      __r4715 = __r4716;
     } else {
      __r4715 = (and__3966__auto__8 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r4714 = (java.lang.Boolean)__r4715;
    }
    __r4712 = __r4714;
   }
   __r4708 = __r4712;
  }
  Object __r4718 = __r4708;
  if (__r4718 != null && !(__r4718 == Boolean.FALSE)) {
   return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8), ((IFn)const__7.getRawRoot()).invoke(argv3), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__9), ((IFn)const__7.getRawRoot()).invoke(expr4)))), args5));
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"The number of args doesn't match are's argv.")));
   return null;
  }
 }
 public int getRequiredArity() {
  return 4;
 }
}
