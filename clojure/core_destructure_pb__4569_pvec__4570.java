package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569_pvec__4570 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "&");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "nthnext");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "as");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "nth");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object pb0;
 public core_destructure_pb__4569_pvec__4570(final Object pb0) {
  super();
  this.pb0 = pb0;
 }
 public java.lang.Object invoke(java.lang.Object bvec1, java.lang.Object b2, java.lang.Object val3) {
  {
   Object gvec4 = ((IFn)const__0.getRawRoot()).invoke("vec__");
   {
    Object ret5 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(bvec1, gvec4), val3);
    long n6 = 0L;
    Object bs7 = b2;
    Object seen_rest_QMARK_8 = Boolean.FALSE;
    while(true) {
     Object __r2789 = ((IFn)const__3.getRawRoot()).invoke(bs7);
     if (__r2789 != null && !(__r2789 == Boolean.FALSE)) {
      {
       Object firstb9 = ((IFn)const__4.getRawRoot()).invoke(bs7);
       if (clojure.lang.Util.equiv(((java.lang.Object)firstb9), ((java.lang.Object)const__6))) {
        java.lang.Object ret5___aux = ((IFn)this.pb0).invoke(ret5, ((IFn)const__7.getRawRoot()).invoke(bs7), ((IFn)const__8.getRawRoot()).invoke(const__9, gvec4, Numbers.num(n6)));
        java.lang.Object bs7___aux = ((IFn)const__10.getRawRoot()).invoke(bs7);
        java.lang.Object seen_rest_QMARK_8___aux = Boolean.TRUE;
        ret5 = ret5___aux;
        bs7 = bs7___aux;
        seen_rest_QMARK_8 = seen_rest_QMARK_8___aux;
        continue;
       } else {
        if (clojure.lang.Util.equiv(((java.lang.Object)firstb9), ((java.lang.Object)const__11))) {
         return ((IFn)this.pb0).invoke(ret5, ((IFn)const__7.getRawRoot()).invoke(bs7), gvec4);
        } else {
         Object __r2793 = const__12;
         if (__r2793 != null && !(__r2793 == Boolean.FALSE)) {
          Object __r2795 = seen_rest_QMARK_8;
          if (__r2795 != null && !(__r2795 == Boolean.FALSE)) {
           Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Unsupported binding form, only :as can follow & parameter")));
           return null;
          } else {
           java.lang.Object ret5___aux = ((IFn)this.pb0).invoke(ret5, firstb9, ((IFn)const__8.getRawRoot()).invoke(const__13, gvec4, Numbers.num(n6), null));
           long n6___aux = clojure.lang.Numbers.inc((long)n6);
           java.lang.Object bs7___aux = ((IFn)const__15.getRawRoot()).invoke(bs7);
           ret5 = ret5___aux;
           n6 = n6___aux;
           bs7 = bs7___aux;
           continue;
          }
         } else {
          return null;
         }
        }
       }
      }
     } else {
      return ret5;
     }
    }
   }
  }
 }
}
