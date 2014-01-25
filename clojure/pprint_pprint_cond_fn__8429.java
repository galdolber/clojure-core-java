package clojure;

import clojure.lang.*;

public final class pprint_pprint_cond_fn__8429 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
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
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__14 = (java.lang.Object)0L;
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__18 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__22 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__23 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
 }
 Object alis1;
 public pprint_pprint_cond_fn__8429(final Object alis1) {
  super();
  this.alis1 = alis1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
    ((IFn)const__2.getRawRoot()).invoke(const__3, const__4);
    ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(this.alis1));
    Object __r6139 = ((IFn)const__7.getRawRoot()).invoke(this.alis1);
    if (__r6139 != null && !(__r6139 == Boolean.FALSE)) {
     ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
     ((IFn)const__8.getRawRoot()).invoke(const__9);
     {
      long length_count84303 = 0L;
      Object alis4 = ((IFn)const__7.getRawRoot()).invoke(this.alis1);
      while(true) {
       Object __r6141 = null;
       {
        Object or__3968__auto__5 = ((IFn)const__15.getRawRoot()).invoke(const__16.get());
        Object __r6142;
        Object __r6143 = or__3968__auto__5;
        if (__r6143 != null && !(__r6143 == Boolean.FALSE)) {
         __r6142 = or__3968__auto__5;
        } else {
         __r6142 = (clojure.lang.Numbers.lt((long)length_count84303, ((java.lang.Object)const__16.get())) ? Boolean.TRUE : Boolean.FALSE);
        }
        __r6141 = __r6142;
       }
       Object __r6144 = __r6141;
       if (__r6144 != null && !(__r6144 == Boolean.FALSE)) {
        Object __r6146 = alis4;
        if (__r6146 != null && !(__r6146 == Boolean.FALSE)) {
         Object __r6148 = ((IFn)const__18).invoke();
         if (__r6148 != null && !(__r6148 == Boolean.FALSE)) {
          ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
         } else {
          ((IFn)const__10.getRawRoot()).invoke(RT.map(const__19, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__21.getRawRoot()).invoke(const__19)))), const__22, const__14));
          ((IFn)new clojure.pprint_pprint_cond_fn__8429_fn__8431(alis4)).invoke();
         }
         Object __r6150 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(alis4));
         if (__r6150 != null && !(__r6150 == Boolean.FALSE)) {
          ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
          ((IFn)const__8.getRawRoot()).invoke(const__9);
          long length_count84303___aux = clojure.lang.Numbers.inc((long)length_count84303);
          java.lang.Object alis4___aux = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(alis4));
          length_count84303 = length_count84303___aux;
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
    } else {
    }
    return ((IFn)const__23).invoke(const__1.get());
   } finally {
    ((IFn)const__12.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
