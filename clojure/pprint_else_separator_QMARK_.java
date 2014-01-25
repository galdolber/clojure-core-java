package clojure;

import clojure.lang.*;

public final class pprint_else_separator_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "separator");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "bracket-info");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "def");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "params");
 }
 public pprint_else_separator_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  {
   Object and__3966__auto__2 = RT.get(RT.get(RT.get(this1, Keyword.intern(null, "def")), Keyword.intern(null, "bracket-info")), Keyword.intern(null, "separator"));
   Object __r5823 = and__3966__auto__2;
   if (__r5823 != null && !(__r5823 == Boolean.FALSE)) {
    return RT.get(RT.get(this1, Keyword.intern(null, "params")), Keyword.intern(null, "colon"));
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
