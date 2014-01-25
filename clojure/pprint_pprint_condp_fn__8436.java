package clojure;

import clojure.lang.*;

public final class pprint_pprint_condp_fn__8436 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final java.lang.Object const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Keyword const__28;
 public static final clojure.lang.Var const__29;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-indent");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__16 = (java.lang.Object)0L;
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__19 = (java.lang.Object)3L;
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__23 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__27 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__29 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
 }
 Object alis1;
 public pprint_pprint_condp_fn__8436(final Object alis1) {
  super();
  this.alis1 = alis1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "(", null, ")");
    ((IFn)const__2.getRawRoot()).invoke(const__3, const__4);
    Object __r6155 = null;
    {
     Object format_in__8216__auto__3 = "~w ~@_~w ~@_~w ~_";
     Object __r6156;
     Object __r6157 = ((IFn)const__6.getRawRoot()).invoke(format_in__8216__auto__3);
     if (__r6157 != null && !(__r6157 == Boolean.FALSE)) {
      __r6156 = ((IFn)const__7).invoke(format_in__8216__auto__3);
     } else {
      __r6156 = format_in__8216__auto__3;
     }
     Object cf__8217__auto__4 = __r6156;
     __r6155 = new clojure.pprint_pprint_condp_fn__8436_fn__8437(cf__8217__auto__4);
    }
    ((IFn)const__5.getRawRoot()).invoke(__r6155, this.alis1);
    {
     long length_count84405 = 0L;
     Object alis6 = ((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(const__19, this.alis1));
     while(true) {
      Object __r6159 = null;
      {
       Object or__3968__auto__7 = ((IFn)const__20.getRawRoot()).invoke(const__21.get());
       Object __r6160;
       Object __r6161 = or__3968__auto__7;
       if (__r6161 != null && !(__r6161 == Boolean.FALSE)) {
        __r6160 = or__3968__auto__7;
       } else {
        __r6160 = (clojure.lang.Numbers.lt((long)length_count84405, ((java.lang.Object)const__21.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r6159 = __r6160;
      }
      Object __r6162 = __r6159;
      if (__r6162 != null && !(__r6162 == Boolean.FALSE)) {
       Object __r6164 = alis6;
       if (__r6164 != null && !(__r6164 == Boolean.FALSE)) {
        Object __r6166 = ((IFn)const__23).invoke();
        if (__r6166 != null && !(__r6166 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
        } else {
         ((IFn)const__8.getRawRoot()).invoke(RT.map(const__24, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__26.getRawRoot()).invoke(const__24)))), const__27, const__16));
         ((IFn)new clojure.pprint_pprint_condp_fn__8436_fn__8441(alis6)).invoke();
        }
        Object __r6168 = ((IFn)const__11.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(alis6));
        if (__r6168 != null && !(__r6168 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
         ((IFn)const__12.getRawRoot()).invoke(const__28);
         long length_count84405___aux = clojure.lang.Numbers.inc((long)length_count84405);
         java.lang.Object alis6___aux = ((IFn)const__11.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(alis6));
         length_count84405 = length_count84405___aux;
         alis6 = alis6___aux;
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
    return ((IFn)const__29).invoke(const__1.get());
   } finally {
    ((IFn)const__14.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
