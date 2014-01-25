package clojure;

import clojure.lang.*;

public final class core_libspec_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
 }
 public core_libspec_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object or__3968__auto__2 = ((IFn)const__0.getRawRoot()).invoke(x1);
   Object __r3135 = or__3968__auto__2;
   if (__r3135 != null && !(__r3135 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    {
     Object and__3966__auto__3 = ((IFn)const__1.getRawRoot()).invoke(x1);
     Object __r3137 = and__3966__auto__3;
     if (__r3137 != null && !(__r3137 == Boolean.FALSE)) {
      {
       boolean or__3968__auto__4 = clojure.lang.Util.identical(((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(x1)), ((java.lang.Object)null));
       if (or__3968__auto__4) {
        return (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
       } else {
        return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(x1));
       }
      }
     } else {
      return and__3966__auto__3;
     }
    }
   }
  }
 }
}
