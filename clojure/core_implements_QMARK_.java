package clojure;

import clojure.lang.*;

public final class core_implements_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
 }
 public core_implements_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1, java.lang.Object atype2) {
  {
   Object and__3966__auto__3 = atype2;
   Object __r3762 = and__3966__auto__3;
   if (__r3762 != null && !(__r3762 == Boolean.FALSE)) {
    return (((java.lang.Class)RT.get(protocol1, Keyword.intern(null, "on-interface"))).isAssignableFrom((java.lang.Class)((java.lang.Class)atype2)) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    return and__3966__auto__3;
   }
  }
 }
}
