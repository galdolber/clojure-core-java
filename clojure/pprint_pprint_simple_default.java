package clojure;

import clojure.lang.*;

public final class pprint_pprint_simple_default extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-array");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-suppress-namespaces*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pr");
 }
 public pprint_pprint_simple_default() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object obj1) {
  if (((java.lang.Class)((IFn)const__0.getRawRoot()).invoke(obj1)).isArray()) {
   return ((IFn)const__1.getRawRoot()).invoke(obj1);
  } else {
   Object __r5967 = null;
   {
    Object and__3966__auto__2 = const__2.get();
    Object __r5968;
    Object __r5969 = and__3966__auto__2;
    if (__r5969 != null && !(__r5969 == Boolean.FALSE)) {
     __r5968 = ((IFn)const__3.getRawRoot()).invoke(obj1);
    } else {
     __r5968 = and__3966__auto__2;
    }
    __r5967 = __r5968;
   }
   Object __r5970 = __r5967;
   if (__r5970 != null && !(__r5970 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(obj1));
   } else {
    Object __r5972 = const__6;
    if (__r5972 != null && !(__r5972 == Boolean.FALSE)) {
     return ((IFn)const__7.get()).invoke(obj1);
    } else {
     return null;
    }
   }
  }
 }
}
