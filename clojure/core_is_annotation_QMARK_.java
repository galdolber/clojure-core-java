package clojure;

import clojure.lang.*;

public final class core_is_annotation_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__2 = (java.lang.Object)java.lang.annotation.Annotation.class;
 }
 public core_is_annotation_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  {
   Object and__3966__auto__2 = ((IFn)const__0.getRawRoot()).invoke(c1);
   Object __r2954 = and__3966__auto__2;
   if (__r2954 != null && !(__r2954 == Boolean.FALSE)) {
    return (((java.lang.Class)((IFn)const__1.getRawRoot()).invoke(const__2)).isAssignableFrom((java.lang.Class)((java.lang.Class)c1)) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    return and__3966__auto__2;
   }
  }
 }
}
