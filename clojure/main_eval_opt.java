package clojure;

import clojure.lang.*;

public final class main_eval_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*read-eval*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "unknown");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "eval");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public main_eval_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object str1) {
  {
   Object eof2 = new java.lang.Object();
   Object reader3 = new clojure.lang.LineNumberingPushbackReader((java.io.Reader)((java.io.Reader)new java.io.StringReader((java.lang.String)((java.lang.String)str1))));
   {
    Object __r4468 = null;
    {
     Object __r4469;
     if (clojure.lang.Util.equiv(((java.lang.Object)const__4), ((java.lang.Object)const__2.get()))) {
      __r4469 = Boolean.TRUE;
     } else {
      __r4469 = const__2.get();
     }
     ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, __r4469));
     __r4468 = ((IFn)new clojure.main_eval_opt_fn__6805(reader3, eof2)).invoke();
    }
    Object input4 = __r4468;
    while(true) {
     if (clojure.lang.Util.equiv(((java.lang.Object)input4), ((java.lang.Object)eof2))) {
      return null;
     } else {
      {
       Object value5 = ((IFn)const__5.getRawRoot()).invoke(input4);
       if (clojure.lang.Util.identical(((java.lang.Object)value5), ((java.lang.Object)null))) {
       } else {
        ((IFn)const__7.getRawRoot()).invoke(value5);
       }
       Object __r4472 = null;
       {
        Object __r4473;
        if (clojure.lang.Util.equiv(((java.lang.Object)const__4), ((java.lang.Object)const__2.get()))) {
         __r4473 = Boolean.TRUE;
        } else {
         __r4473 = const__2.get();
        }
        ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, __r4473));
        __r4472 = ((IFn)new clojure.main_eval_opt_fn__6807(reader3, eof2)).invoke();
       }
       java.lang.Object input4___aux = __r4472;
       input4 = input4___aux;
       continue;
      }
     }
    }
   }
  }
 }
}
