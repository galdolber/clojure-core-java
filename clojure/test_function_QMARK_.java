package clojure;

import clojure.lang.*;

public final class test_function_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "resolve");
  const__2 = (clojure.lang.Var)RT.var("clojure.test", "get-possibly-unbound-var");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "fn?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "macro");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public test_function_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4687 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r4687 != null && !(__r4687 == Boolean.FALSE)) {
   {
    Object temp__4117__auto__2 = ((IFn)const__1.getRawRoot()).invoke(x1);
    Object __r4689 = temp__4117__auto__2;
    if (__r4689 != null && !(__r4689 == Boolean.FALSE)) {
     {
      Object v3 = temp__4117__auto__2;
      {
       Object temp__4117__auto__4 = ((IFn)const__2.getRawRoot()).invoke(v3);
       Object __r4691 = temp__4117__auto__4;
       if (__r4691 != null && !(__r4691 == Boolean.FALSE)) {
        {
         Object value5 = temp__4117__auto__4;
         {
          Object and__3966__auto__6 = ((IFn)const__3.getRawRoot()).invoke(value5);
          Object __r4693 = and__3966__auto__6;
          if (__r4693 != null && !(__r4693 == Boolean.FALSE)) {
           return ((IFn)const__4.getRawRoot()).invoke(RT.get(((IFn)const__6.getRawRoot()).invoke(v3), Keyword.intern(null, "macro")));
          } else {
           return and__3966__auto__6;
          }
         }
        }
       } else {
        return null;
       }
      }
     }
    } else {
     return null;
    }
   }
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(x1);
  }
 }
}
