package clojure;

import clojure.lang.*;

public final class pprint_pprint_simple_code_list_fn__8458 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-indent");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__9 = (java.lang.Object)0L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object alis1;
 public pprint_pprint_simple_code_list_fn__8458(final Object alis1) {
  super();
  this.alis1 = alis1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
    ((IFn)const__2.getRawRoot()).invoke(const__3, const__4);
    {
     long length_count84593 = 0L;
     Object alis4 = ((IFn)const__10.getRawRoot()).invoke(this.alis1);
     while(true) {
      Object __r6179 = null;
      {
       Object or__3968__auto__5 = ((IFn)const__11.getRawRoot()).invoke(const__12.get());
       Object __r6180;
       Object __r6181 = or__3968__auto__5;
       if (__r6181 != null && !(__r6181 == Boolean.FALSE)) {
        __r6180 = or__3968__auto__5;
       } else {
        __r6180 = (clojure.lang.Numbers.lt((long)length_count84593, ((java.lang.Object)const__12.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r6179 = __r6180;
      }
      Object __r6182 = __r6179;
      if (__r6182 != null && !(__r6182 == Boolean.FALSE)) {
       Object __r6184 = alis4;
       if (__r6184 != null && !(__r6184 == Boolean.FALSE)) {
        ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(alis4));
        Object __r6186 = ((IFn)const__7.getRawRoot()).invoke(alis4);
        if (__r6186 != null && !(__r6186 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
         ((IFn)const__8.getRawRoot()).invoke(const__14);
         long length_count84593___aux = clojure.lang.Numbers.inc((long)length_count84593);
         java.lang.Object alis4___aux = ((IFn)const__7.getRawRoot()).invoke(alis4);
         length_count84593 = length_count84593___aux;
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
    return ((IFn)const__16).invoke(const__1.get());
   } finally {
    ((IFn)const__17.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
