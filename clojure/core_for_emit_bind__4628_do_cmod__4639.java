package clojure;

import clojure.lang.*;

public final class core_for_emit_bind__4628_do_cmod__4639 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "let");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "while");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "when");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "unchecked-inc");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-append");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "unchecked-inc");
 }
 Object body_expr4;
 Object gb16;
 Object err6;
 Object gi15;
 public core_for_emit_bind__4628_do_cmod__4639(final Object body_expr4, final Object gb16, final Object err6, final Object gi15) {
  super();
  this.body_expr4 = body_expr4;
  this.gb16 = gb16;
  this.err6 = err6;
  this.gi15 = gi15;
 }
 public java.lang.Object invoke(java.lang.Object p__46381) {
  {
   Object vec__46402 = p__46381;
   Object vec__46413 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46402), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46413), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46413), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object pair6 = vec__46413;
   Object etc7 = ((IFn)const__3.getRawRoot()).invoke(vec__46402, const__2);
   if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__5))) {
    return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7))));
   } else {
    if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__10))) {
     return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__11), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7))));
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__12))) {
      return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__13), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7)), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__14), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__15), ((IFn)const__8.getRawRoot()).invoke(this.gi15)))))))));
     } else {
      Object __r2882 = ((IFn)const__16.getRawRoot()).invoke(k4);
      if (__r2882 != null && !(__r2882 == Boolean.FALSE)) {
       return ((IFn)this.err6).invoke("Invalid 'for' keyword ", k4);
      } else {
       Object __r2884 = const__17;
       if (__r2884 != null && !(__r2884 == Boolean.FALSE)) {
        return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__18), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__19), ((IFn)const__8.getRawRoot()).invoke(this.gb16), ((IFn)const__8.getRawRoot()).invoke(this.body_expr4)))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__20), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(this.gi15)))))))));
       } else {
        return null;
       }
      }
     }
    }
   }
  }
 }
}
