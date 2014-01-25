package clojure;

import clojure.lang.*;

public final class core_filter_methods_fn__5501 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "method-sig");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object mm3;
 Object c5;
 Object considered4;
 Object invalid_method_QMARK_2;
 public core_filter_methods_fn__5501(final Object mm3, final Object c5, final Object considered4, final Object invalid_method_QMARK_2) {
  super();
  this.mm3 = mm3;
  this.c5 = c5;
  this.considered4 = considered4;
  this.invalid_method_QMARK_2 = invalid_method_QMARK_2;
 }
 public java.lang.Object invoke() {
  {
   Object mm1 = this.mm3;
   Object considered2 = this.considered4;
   Object meths3 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((java.lang.reflect.Method[])((java.lang.Class)this.c5).getDeclaredMethods())), ((IFn)const__0.getRawRoot()).invoke(((java.lang.reflect.Method[])((java.lang.Class)this.c5).getMethods()))));
   while(true) {
    Object __r3495 = meths3;
    if (__r3495 != null && !(__r3495 == Boolean.FALSE)) {
     {
      Object meth4 = ((IFn)const__2.getRawRoot()).invoke(meths3);
      int mods5 = ((java.lang.reflect.Method)meth4).getModifiers();
      Object mk6 = ((IFn)const__3.getRawRoot()).invoke(meth4);
      Object __r3497 = null;
      {
       Object or__3968__auto__7 = ((IFn)considered2).invoke(mk6);
       Object __r3498;
       Object __r3499 = or__3968__auto__7;
       if (__r3499 != null && !(__r3499 == Boolean.FALSE)) {
        __r3498 = or__3968__auto__7;
       } else {
        __r3498 = ((IFn)this.invalid_method_QMARK_2).invoke(meth4);
       }
       __r3497 = __r3498;
      }
      Object __r3500 = __r3497;
      if (__r3500 != null && !(__r3500 == Boolean.FALSE)) {
       java.lang.Object considered2___aux = ((IFn)const__4.getRawRoot()).invoke(considered2, mk6);
       java.lang.Object meths3___aux = ((IFn)const__5.getRawRoot()).invoke(meths3);
       considered2 = considered2___aux;
       meths3 = meths3___aux;
       continue;
      } else {
       java.lang.Object mm1___aux = ((IFn)const__6.getRawRoot()).invoke(mm1, mk6, meth4);
       java.lang.Object considered2___aux = ((IFn)const__4.getRawRoot()).invoke(considered2, mk6);
       java.lang.Object meths3___aux = ((IFn)const__5.getRawRoot()).invoke(meths3);
       mm1 = mm1___aux;
       considered2 = considered2___aux;
       meths3 = meths3___aux;
       continue;
      }
     }
    } else {
     return RT.vector(mm1, considered2);
    }
   }
  }
 }
}
