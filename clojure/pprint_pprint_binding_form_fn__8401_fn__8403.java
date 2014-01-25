package clojure;

import clojure.lang.*;

public final class pprint_pprint_binding_form_fn__8401_fn__8403 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "miser");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object binding4;
 public pprint_pprint_binding_form_fn__8401_fn__8403(final Object binding4) {
  super();
  this.binding4 = binding4;
 }
 public java.lang.Object invoke() {
  try {
   try {
    ((IFn)const__0).invoke(const__1.get(), null, null, null);
    ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.binding4));
    Object __r6107 = ((IFn)const__4.getRawRoot()).invoke(this.binding4);
    if (__r6107 != null && !(__r6107 == Boolean.FALSE)) {
     ((java.io.Writer)const__1.get()).write((java.lang.String)((java.lang.String)" "));
     ((IFn)const__5.getRawRoot()).invoke(const__6);
     ((IFn)const__2.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(this.binding4));
    } else {
    }
    return ((IFn)const__8).invoke(const__1.get());
   } finally {
    ((IFn)const__9.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
