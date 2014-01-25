package clojure;

import clojure.lang.*;

public final class pprint_miser_nl_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "get-miser-width");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "get-max-column");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "start-col");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "linear-nl?");
 }
 public pprint_miser_nl_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object lb2, java.lang.Object section3) {
  {
   Object miser_width4 = ((IFn)const__0.getRawRoot()).invoke(this1);
   Object maxcol5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")));
   {
    Object and__3966__auto__6 = miser_width4;
    Object __r4905 = and__3966__auto__6;
    if (__r4905 != null && !(__r4905 == Boolean.FALSE)) {
     {
      Object and__3966__auto__7 = maxcol5;
      Object __r4907 = and__3966__auto__7;
      if (__r4907 != null && !(__r4907 == Boolean.FALSE)) {
       {
        boolean and__3966__auto__8 = clojure.lang.Numbers.gte(((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(RT.get(lb2, Keyword.intern(null, "start-col")))), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)maxcol5), ((java.lang.Object)miser_width4)))));
        if (and__3966__auto__8) {
         return ((IFn)const__7.getRawRoot()).invoke(this1, lb2, section3);
        } else {
         return (and__3966__auto__8 ? Boolean.TRUE : Boolean.FALSE);
        }
       }
      } else {
       return and__3966__auto__7;
      }
     }
    } else {
     return and__3966__auto__6;
    }
   }
  }
 }
}
