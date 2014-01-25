package clojure;

import clojure.lang.*;

public final class core_extends_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "implements?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "impls");
 }
 public core_extends_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1, java.lang.Object atype2) {
  Object __r3763 = null;
  {
   Object or__3968__auto__3 = ((IFn)const__1.getRawRoot()).invoke(protocol1, atype2);
   Object __r3764;
   Object __r3765 = or__3968__auto__3;
   if (__r3765 != null && !(__r3765 == Boolean.FALSE)) {
    __r3764 = or__3968__auto__3;
   } else {
    __r3764 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(protocol1, Keyword.intern(null, "impls"))), ((java.lang.Object)atype2)));
   }
   __r3763 = __r3764;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r3763)) ? Boolean.TRUE : Boolean.FALSE);
 }
}
