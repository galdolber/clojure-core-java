package clojure;

import clojure.lang.*;

public final class pprint_ancestor_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "parent");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public pprint_ancestor_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object parent1, java.lang.Object child2) {
  {
   Object child3 = RT.get(child2, Keyword.intern(null, "parent"));
   while(true) {
    if (clojure.lang.Util.identical(((java.lang.Object)child3), ((java.lang.Object)null))) {
     return Boolean.FALSE;
    } else {
     if (clojure.lang.Util.identical(((java.lang.Object)parent1), ((java.lang.Object)child3))) {
      return Boolean.TRUE;
     } else {
      Object __r4855 = const__3;
      if (__r4855 != null && !(__r4855 == Boolean.FALSE)) {
       java.lang.Object child3___aux = RT.get(child3, Keyword.intern(null, "parent"));
       child3 = child3___aux;
       continue;
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
