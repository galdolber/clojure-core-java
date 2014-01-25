package clojure;

import clojure.lang.*;

public final class pprint_pprint_binding_form_fn__8401 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
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
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__11 = (java.lang.Object)0L;
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
 Object binding_vec1;
 public pprint_pprint_binding_form_fn__8401(final Object binding_vec1) {
  super();
  this.binding_vec1 = binding_vec1;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), "[", null, "]");
    {
     long length_count84023 = 0L;
     Object binding4 = this.binding_vec1;
     while(true) {
      Object __r6109 = null;
      {
       Object or__3968__auto__5 = ((IFn)const__12.getRawRoot()).invoke(const__13.get());
       Object __r6110;
       Object __r6111 = or__3968__auto__5;
       if (__r6111 != null && !(__r6111 == Boolean.FALSE)) {
        __r6110 = or__3968__auto__5;
       } else {
        __r6110 = (clojure.lang.Numbers.lt((long)length_count84023, ((java.lang.Object)const__13.get())) ? Boolean.TRUE : Boolean.FALSE);
       }
       __r6109 = __r6110;
      }
      Object __r6112 = __r6109;
      if (__r6112 != null && !(__r6112 == Boolean.FALSE)) {
       Object __r6114 = ((IFn)const__2.getRawRoot()).invoke(binding4);
       if (__r6114 != null && !(__r6114 == Boolean.FALSE)) {
        Object __r6116 = ((IFn)const__15).invoke();
        if (__r6116 != null && !(__r6116 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)"#"));
        } else {
         ((IFn)const__3.getRawRoot()).invoke(RT.map(const__16, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__18.getRawRoot()).invoke(const__16)))), const__19, const__11));
         ((IFn)new clojure.pprint_pprint_binding_form_fn__8401_fn__8403(binding4)).invoke();
        }
        Object __r6118 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(binding4));
        if (__r6118 != null && !(__r6118 == Boolean.FALSE)) {
         ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
         ((IFn)const__7.getRawRoot()).invoke(const__20);
         long length_count84023___aux = clojure.lang.Numbers.inc((long)length_count84023);
         java.lang.Object binding4___aux = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(binding4));
         length_count84023 = length_count84023___aux;
         binding4 = binding4___aux;
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
    ((IFn)const__9.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
