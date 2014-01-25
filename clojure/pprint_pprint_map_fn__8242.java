package clojure;

import clojure.lang.*;

public final class pprint_pprint_map_fn__8242 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Var const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ffirst");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "fnext");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__10 = (java.lang.Object)0L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*print-length*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__21 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
 }
 Object amap1;
 public pprint_pprint_map_fn__8242(final Object amap1) {
  super();
  this.amap1 = amap1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "{", null, "}");
    {
     long length_count82433 = 0L;
     Object aseq4 = ((IFn)const__11.getRawRoot()).invoke(this.amap1);
     while(true) {
      Object __r5926 = null;
      {
       Object or__3968__auto__5 = ((IFn)const__12.getRawRoot()).invoke(const__13.get());
       Object __r5927;
       Object __r5928 = or__3968__auto__5;
       if (__r5928 != null && !(__r5928 == Boolean.FALSE)) {
        __r5927 = or__3968__auto__5;
       } else {
        __r5927 = (clojure.lang.Numbers.lt((long)length_count82433, ((java.lang.Object)const__13.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r5926 = __r5927;
      }
      Object __r5929 = __r5926;
      if (__r5929 != null && !(__r5929 == Boolean.FALSE)) {
       Object __r5931 = aseq4;
       if (__r5931 != null && !(__r5931 == Boolean.FALSE)) {
        Object __r5933 = ((IFn)const__15).invoke();
        if (__r5933 != null && !(__r5933 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
        } else {
         ((IFn)const__2.getRawRoot()).invoke(RT.map(const__16, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__18.getRawRoot()).invoke(const__16)))), const__19, const__10));
         ((IFn)new clojure.pprint_pprint_map_fn__8242_fn__8244(aseq4)).invoke();
        }
        Object __r5935 = ((IFn)const__9.getRawRoot()).invoke(aseq4);
        if (__r5935 != null && !(__r5935 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)", "));
         ((IFn)const__5.getRawRoot()).invoke(const__20);
         long length_count82433___aux = clojure.lang.Numbers.inc((long)length_count82433);
         java.lang.Object aseq4___aux = ((IFn)const__9.getRawRoot()).invoke(aseq4);
         length_count82433 = length_count82433___aux;
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
    return ((IFn)const__21).invoke(const__1.get());
   } finally {
    ((IFn)const__8.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
