package clojure;

import clojure.lang.*;

public final class core_maybe_destructured extends clojure.lang.AFunction {
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
 public static final clojure.lang.Symbol const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "every?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
 }
 public core_maybe_destructured() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object body2) {
  Object __r2817 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), params1);
  if (__r2817 != null && !(__r2817 == Boolean.FALSE)) {
   return ((IFn)const__2.getRawRoot()).invoke(params1, body2);
  } else {
   {
    Object params3 = params1;
    Object new_params4 = clojure.lang.PersistentVector.EMPTY;
    Object lets5 = clojure.lang.PersistentVector.EMPTY;
    while(true) {
     Object __r2819 = params3;
     if (__r2819 != null && !(__r2819 == Boolean.FALSE)) {
      Object __r2821 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(params3));
      if (__r2821 != null && !(__r2821 == Boolean.FALSE)) {
       java.lang.Object params3___aux = ((IFn)const__4.getRawRoot()).invoke(params3);
       java.lang.Object new_params4___aux = ((IFn)const__5.getRawRoot()).invoke(new_params4, ((IFn)const__3.getRawRoot()).invoke(params3));
       params3 = params3___aux;
       new_params4 = new_params4___aux;
       continue;
      } else {
       {
        Object gparam6 = ((IFn)const__6.getRawRoot()).invoke("p__");
        java.lang.Object params3___aux = ((IFn)const__4.getRawRoot()).invoke(params3);
        java.lang.Object new_params4___aux = ((IFn)const__5.getRawRoot()).invoke(new_params4, gparam6);
        java.lang.Object lets5___aux = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(lets5, ((IFn)const__3.getRawRoot()).invoke(params3)), gparam6);
        params3 = params3___aux;
        new_params4 = new_params4___aux;
        lets5 = lets5___aux;
        continue;
       }
      }
     } else {
      return ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(new_params4), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10), ((IFn)const__9.getRawRoot()).invoke(lets5), body2)))));
     }
    }
   }
  }
 }
}
