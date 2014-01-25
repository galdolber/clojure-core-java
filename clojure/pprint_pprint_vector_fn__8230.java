package clojure;

import clojure.lang.*;

public final class pprint_pprint_vector_fn__8230 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object avec1;
 public pprint_pprint_vector_fn__8230(final Object avec1) {
  super();
  this.avec1 = avec1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "[", null, "]");
    {
     long length_count82313 = 0L;
     Object aseq4 = ((IFn)const__7.getRawRoot()).invoke(this.avec1);
     while(true) {
      Object __r5913 = null;
      {
       Object or__3968__auto__5 = ((IFn)const__8.getRawRoot()).invoke(const__9.get());
       Object __r5914;
       Object __r5915 = or__3968__auto__5;
       if (__r5915 != null && !(__r5915 == Boolean.FALSE)) {
        __r5914 = or__3968__auto__5;
       } else {
        __r5914 = (clojure.lang.Numbers.lt((long)length_count82313, ((java.lang.Object)const__9.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r5913 = __r5914;
      }
      Object __r5916 = __r5913;
      if (__r5916 != null && !(__r5916 == Boolean.FALSE)) {
       Object __r5918 = aseq4;
       if (__r5918 != null && !(__r5918 == Boolean.FALSE)) {
        ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(aseq4));
        Object __r5920 = ((IFn)const__4.getRawRoot()).invoke(aseq4);
        if (__r5920 != null && !(__r5920 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
         ((IFn)const__5.getRawRoot()).invoke(const__11);
         long length_count82313___aux = clojure.lang.Numbers.inc((long)length_count82313);
         java.lang.Object aseq4___aux = ((IFn)const__4.getRawRoot()).invoke(aseq4);
         length_count82313 = length_count82313___aux;
         aseq4 = aseq4___aux;
         continue;
        } else {
        }
       } else {
       }
      } else {
       ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"..."));
      }
      break;
     }
    }
    return ((IFn)const__13).invoke(const__1.get());
   } finally {
    ((IFn)const__14.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
