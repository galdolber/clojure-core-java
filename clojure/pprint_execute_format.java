package clojure;

import clojure.lang.*;

public final class pprint_execute_format extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "true?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "needs-pretty");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer?");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "get-pretty-writer");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__10 = (clojure.lang.Var)RT.var("clojure.pprint", "map-passing-context");
 }
 public pprint_execute_format() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object stream1, java.lang.Object format2, java.lang.Object args3) {
  {
   Object __r5881;
   Object __r5882 = ((IFn)const__0.getRawRoot()).invoke(stream1);
   if (__r5882 != null && !(__r5882 == Boolean.FALSE)) {
    __r5881 = new java.io.StringWriter();
   } else {
    Object __r5883;
    Object __r5884 = ((IFn)const__1.getRawRoot()).invoke(stream1);
    if (__r5884 != null && !(__r5884 == Boolean.FALSE)) {
     __r5883 = const__2.get();
    } else {
     Object __r5885;
     Object __r5886 = const__3;
     if (__r5886 != null && !(__r5886 == Boolean.FALSE)) {
      __r5885 = stream1;
     } else {
      __r5885 = null;
     }
     __r5883 = __r5885;
    }
    __r5881 = __r5883;
   }
   Object real_stream4 = __r5881;
   Object __r5887;
   Object __r5888 = null;
   {
    Object and__3966__auto__5 = ((IFn)const__4.getRawRoot()).invoke(format2);
    Object __r5889;
    Object __r5890 = and__3966__auto__5;
    if (__r5890 != null && !(__r5890 == Boolean.FALSE)) {
     __r5889 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(real_stream4));
    } else {
     __r5889 = and__3966__auto__5;
    }
    __r5888 = __r5889;
   }
   Object __r5891 = __r5888;
   if (__r5891 != null && !(__r5891 == Boolean.FALSE)) {
    __r5887 = ((IFn)const__6.getRawRoot()).invoke(real_stream4);
   } else {
    __r5887 = real_stream4;
   }
   Object wrapped_stream6 = __r5887;
   {
    ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__2, wrapped_stream6));
    try {
     ((IFn)new clojure.pprint_execute_format_fn__8199(args3, format2, real_stream4, wrapped_stream6)).invoke();
     Object __r5893 = ((IFn)const__0.getRawRoot()).invoke(stream1);
     if (__r5893 != null && !(__r5893 == Boolean.FALSE)) {
      return ((java.lang.String)((java.lang.Object)real_stream4).toString());
     } else {
      return null;
     }
    } finally {
     ((IFn)const__9.getRawRoot()).invoke();
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object format1, java.lang.Object args2) {
  ((IFn)const__10.getRawRoot()).invoke(new clojure.pprint_execute_format_fn__8201(), args2, format1);
  return null;
 }
}
