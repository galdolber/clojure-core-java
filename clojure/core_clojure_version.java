package clojure;

import clojure.lang.*;

public final class core_clojure_version extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "major");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*clojure-version*");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "minor");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "incremental");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "qualifier");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "interim");
 }
 public core_clojure_version() {
  super();
 }
 public java.lang.Object invoke() {
  Object __r4091 = null;
  {
   Object temp__4117__auto__1 = RT.get(const__2.get(), Keyword.intern(null, "incremental"));
   Object __r4092;
   Object __r4093 = temp__4117__auto__1;
   if (__r4093 != null && !(__r4093 == Boolean.FALSE)) {
    Object __r4094 = null;
    {
     Object i2 = temp__4117__auto__1;
     __r4094 = ((IFn)const__0.getRawRoot()).invoke(".", i2);
    }
    __r4092 = __r4094;
   } else {
    __r4092 = null;
   }
   __r4091 = __r4092;
  }
  Object __r4095 = null;
  {
   Object temp__4117__auto__3 = RT.get(const__2.get(), Keyword.intern(null, "qualifier"));
   Object __r4096;
   Object __r4097 = temp__4117__auto__3;
   if (__r4097 != null && !(__r4097 == Boolean.FALSE)) {
    Object __r4098 = null;
    {
     Object q4 = temp__4117__auto__3;
     Object __r4099;
     if (clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)q4)))) {
      __r4099 = ((IFn)const__0.getRawRoot()).invoke("-", q4);
     } else {
      __r4099 = null;
     }
     __r4098 = __r4099;
    }
    __r4096 = __r4098;
   } else {
    __r4096 = null;
   }
   __r4095 = __r4096;
  }
  Object __r4100;
  Object __r4101 = RT.get(const__2.get(), Keyword.intern(null, "interim"));
  if (__r4101 != null && !(__r4101 == Boolean.FALSE)) {
   __r4100 = "-SNAPSHOT";
  } else {
   __r4100 = null;
  }
  return ((IFn)const__0.getRawRoot()).invoke(RT.get(const__2.get(), Keyword.intern(null, "major")), ".", RT.get(const__2.get(), Keyword.intern(null, "minor")), __r4091, __r4095, __r4100);
 }
}
