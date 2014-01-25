package clojure;

import clojure.lang.*;

public final class test_successful_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "error");
 }
 public test_successful_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object summary1) {
  {
   boolean and__3966__auto__2 = clojure.lang.Numbers.isZero(((java.lang.Object)((IFn)const__1).invoke(summary1, const__2)));
   if (and__3966__auto__2) {
    return (clojure.lang.Numbers.isZero(((java.lang.Object)((IFn)const__3).invoke(summary1, const__2))) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    return (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
