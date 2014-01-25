package clojure;

import clojure.lang.*;

public final class pprint_pprint_simple_list_fn__8224 extends clojure.lang.AFunction {
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
 Object alis1;
 public pprint_pprint_simple_list_fn__8224(final Object alis1) {
  super();
  this.alis1 = alis1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
    {
     long length_count82253 = 0L;
     Object alis4 = ((IFn)const__7.getRawRoot()).invoke(this.alis1);
     while(true) {
      Object __r5900 = null;
      {
       Object or__3968__auto__5 = ((IFn)const__8.getRawRoot()).invoke(const__9.get());
       Object __r5901;
       Object __r5902 = or__3968__auto__5;
       if (__r5902 != null && !(__r5902 == Boolean.FALSE)) {
        __r5901 = or__3968__auto__5;
       } else {
        __r5901 = (clojure.lang.Numbers.lt((long)length_count82253, ((java.lang.Object)const__9.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r5900 = __r5901;
      }
      Object __r5903 = __r5900;
      if (__r5903 != null && !(__r5903 == Boolean.FALSE)) {
       Object __r5905 = alis4;
       if (__r5905 != null && !(__r5905 == Boolean.FALSE)) {
        ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(alis4));
        Object __r5907 = ((IFn)const__4.getRawRoot()).invoke(alis4);
        if (__r5907 != null && !(__r5907 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
         ((IFn)const__5.getRawRoot()).invoke(const__11);
         long length_count82253___aux = clojure.lang.Numbers.inc((long)length_count82253);
         java.lang.Object alis4___aux = ((IFn)const__4.getRawRoot()).invoke(alis4);
         length_count82253 = length_count82253___aux;
         alis4 = alis4___aux;
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
