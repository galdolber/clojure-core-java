package clojure;

import clojure.lang.*;

public final class core_is_runtime_annotation_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "is-annotation?");
  const__2 = (java.lang.Object)java.lang.annotation.Retention.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 public core_is_runtime_annotation_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  Object __r2955 = null;
  {
   Object and__3966__auto__2 = ((IFn)const__1.getRawRoot()).invoke(c1);
   Object __r2956;
   Object __r2957 = and__3966__auto__2;
   if (__r2957 != null && !(__r2957 == Boolean.FALSE)) {
    Object __r2958 = null;
    {
     Object temp__4117__auto__3 = ((java.lang.annotation.Annotation)((java.lang.Class)c1).getAnnotation((java.lang.Class)((java.lang.Class)const__2)));
     Object __r2959;
     Object __r2960 = temp__4117__auto__3;
     if (__r2960 != null && !(__r2960 == Boolean.FALSE)) {
      Object __r2961 = null;
      {
       Object r4 = temp__4117__auto__3;
       __r2961 = (clojure.lang.Util.equiv(((java.lang.Object)((java.lang.annotation.RetentionPolicy)((java.lang.annotation.Retention)r4).value())), ((java.lang.Object)((java.lang.annotation.RetentionPolicy)java.lang.annotation.RetentionPolicy.RUNTIME))) ? Boolean.TRUE : Boolean.FALSE);
      }
      __r2959 = __r2961;
     } else {
      __r2959 = null;
     }
     __r2958 = __r2959;
    }
    __r2956 = __r2958;
   } else {
    __r2956 = and__3966__auto__2;
   }
   __r2955 = __r2956;
  }
  return (clojure.lang.RT.booleanCast(((java.lang.Object)__r2955)) ? Boolean.TRUE : Boolean.FALSE);
 }
}
