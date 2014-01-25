package clojure;

import clojure.lang.*;

public final class string_blank_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public string_blank_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  Object __r6344 = s1;
  if (__r6344 != null && !(__r6344 == Boolean.FALSE)) {
   {
    long index2 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
    while(true) {
     if (clojure.lang.Util.equiv((long)((java.lang.CharSequence)s1).length(), (long)index2)) {
      return Boolean.TRUE;
     } else {
      if (java.lang.Character.isWhitespace((char)((java.lang.CharSequence)s1).charAt((int)RT.intCast(index2)))) {
       long index2___aux = clojure.lang.Numbers.inc((long)index2);
       index2 = index2___aux;
       continue;
      } else {
       return Boolean.FALSE;
      }
     }
    }
   }
  } else {
   return Boolean.TRUE;
  }
 }
}
