package clojure;

import clojure.lang.*;

public final class pprint_pprint_reader_macro extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "reader-macros");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
 }
 public pprint_pprint_reader_macro() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  try {
   {
    Object macro_char2 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(alis1));
    Object __r5895 = null;
    {
     Object and__3966__auto__3 = macro_char2;
     Object __r5896;
     Object __r5897 = and__3966__auto__3;
     if (__r5897 != null && !(__r5897 == Boolean.FALSE)) {
      __r5896 = (clojure.lang.Util.equiv((long)2L, (long)clojure.lang.RT.count(((java.lang.Object)alis1))) ? Boolean.TRUE : Boolean.FALSE);
     } else {
      __r5896 = and__3966__auto__3;
     }
     __r5895 = __r5896;
    }
    Object __r5898 = __r5895;
    if (__r5898 != null && !(__r5898 == Boolean.FALSE)) {
     ((java.io.Writer)const__5.get()).write((java.lang.String)((java.lang.String)macro_char2));
     ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(alis1));
     return Boolean.TRUE;
    } else {
     return null;
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
