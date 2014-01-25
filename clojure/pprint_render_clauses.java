package clojure;

import clojure.lang.*;

public final class pprint_render_clauses extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public pprint_render_clauses() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object clauses1, java.lang.Object navigator2, java.lang.Object base_navigator3) {
  {
   Object clauses4 = clauses1;
   Object acc5 = clojure.lang.PersistentVector.EMPTY;
   Object navigator6 = navigator2;
   while(true) {
    Object __r5519 = ((IFn)const__0.getRawRoot()).invoke(clauses4);
    if (__r5519 != null && !(__r5519 == Boolean.FALSE)) {
     return RT.vector(acc5, navigator6);
    } else {
     {
      Object clause7 = ((IFn)const__1.getRawRoot()).invoke(clauses4);
      Object __r5520 = null;
      {
       ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4, new java.io.StringWriter()));
       __r5520 = ((IFn)new clojure.pprint_render_clauses_fn__7838(navigator6, clause7, base_navigator3)).invoke();
      }
      Object vec__78378 = __r5520;
      Object iter_result9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78378), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object result_str10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78378), (int)RT.intCast(1L), ((java.lang.Object)null)));
      if (clojure.lang.Util.equiv(((java.lang.Object)const__9), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(iter_result9)))) {
       return RT.vector(acc5, ((IFn)const__10.getRawRoot()).invoke(iter_result9));
      } else {
       java.lang.Object clauses4___aux = ((IFn)const__11.getRawRoot()).invoke(clauses4);
       java.lang.Object acc5___aux = ((IFn)const__12.getRawRoot()).invoke(acc5, result_str10);
       java.lang.Object navigator6___aux = iter_result9;
       clauses4 = clauses4___aux;
       acc5 = acc5___aux;
       navigator6 = navigator6___aux;
       continue;
      }
     }
    }
   }
  }
 }
}
