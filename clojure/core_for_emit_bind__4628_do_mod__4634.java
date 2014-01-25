package clojure;

import clojure.lang.*;

public final class core_for_emit_bind__4628_do_mod__4634 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Keyword const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Symbol const__30;
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
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "rest");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "iterys__4614__auto__");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "fs__4615__auto__");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "concat");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "rest");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "rest");
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__29 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "cons");
  const__30 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "rest");
 }
 Object body_expr4;
 Object giter12;
 Object next_groups11;
 Object emit_bind0;
 Object gxs13;
 Object next_expr10;
 Object err6;
 public core_for_emit_bind__4628_do_mod__4634(final Object body_expr4, final Object giter12, final Object next_groups11, final Object emit_bind0, final Object gxs13, final Object next_expr10, final Object err6) {
  super();
  this.body_expr4 = body_expr4;
  this.giter12 = giter12;
  this.next_groups11 = next_groups11;
  this.emit_bind0 = emit_bind0;
  this.gxs13 = gxs13;
  this.next_expr10 = next_expr10;
  this.err6 = err6;
 }
 public java.lang.Object invoke(java.lang.Object p__46331) {
  {
   Object vec__46352 = p__46331;
   Object vec__46363 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46352), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46363), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46363), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object pair6 = vec__46363;
   Object etc7 = ((IFn)const__3.getRawRoot()).invoke(vec__46352, const__2);
   if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__5))) {
    return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7))));
   } else {
    if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__10))) {
     return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__11), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7))));
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)k4), ((java.lang.Object)const__12))) {
      return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__13), ((IFn)const__8.getRawRoot()).invoke(v5), ((IFn)const__8.getRawRoot()).invoke(((IFn)this).invoke(etc7)), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__14), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__15), ((IFn)const__8.getRawRoot()).invoke(this.gxs13)))))))));
     } else {
      Object __r2873 = ((IFn)const__16.getRawRoot()).invoke(k4);
      if (__r2873 != null && !(__r2873 == Boolean.FALSE)) {
       return ((IFn)this.err6).invoke("Invalid 'for' keyword ", k4);
      } else {
       Object __r2875 = this.next_groups11;
       if (__r2875 != null && !(__r2875 == Boolean.FALSE)) {
        return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__17), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(const__19.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__20), ((IFn)const__8.getRawRoot()).invoke(((IFn)this.emit_bind0).invoke(this.next_groups11)), ((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__22), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__20), ((IFn)const__8.getRawRoot()).invoke(this.next_expr10))))))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__23), ((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__24), ((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this.giter12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__25), ((IFn)const__8.getRawRoot()).invoke(this.gxs13)))))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__26), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__27), ((IFn)const__8.getRawRoot()).invoke(this.gxs13))))))))))));
       } else {
        Object __r2877 = const__28;
        if (__r2877 != null && !(__r2877 == Boolean.FALSE)) {
         return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__29), ((IFn)const__8.getRawRoot()).invoke(this.body_expr4), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this.giter12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__30), ((IFn)const__8.getRawRoot()).invoke(this.gxs13)))))))));
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
}
