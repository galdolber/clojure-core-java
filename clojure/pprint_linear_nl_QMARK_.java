package clojure;

import clojure.lang.*;

public final class pprint_linear_nl_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "done-nl");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "tokens-fit?");
 }
 public pprint_linear_nl_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object lb2, java.lang.Object section3) {
  {
   Object or__3968__auto__4 = ((IFn)const__0.getRawRoot()).invoke(RT.get(lb2, Keyword.intern(null, "done-nl")));
   Object __r4903 = or__3968__auto__4;
   if (__r4903 != null && !(__r4903 == Boolean.FALSE)) {
    return or__3968__auto__4;
   } else {
    return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this1, section3));
   }
  }
 }
}
