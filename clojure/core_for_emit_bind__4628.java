package clojure;

import clojure.lang.*;

public final class core_for_emit_bind__4628 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Symbol const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Symbol const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Symbol const__34;
 public static final clojure.lang.Symbol const__35;
 public static final clojure.lang.Symbol const__36;
 public static final clojure.lang.Symbol const__37;
 public static final clojure.lang.Symbol const__38;
 public static final clojure.lang.Symbol const__39;
 public static final clojure.lang.Symbol const__40;
 public static final clojure.lang.Symbol const__41;
 public static final clojure.lang.Symbol const__42;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "lazy-seq");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-first");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "lazy-seq");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-let");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunked-seq?");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "c__4616__auto__");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-first");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, "size__4617__auto__");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "int");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "count");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-buffer");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__30 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__31 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "int");
  const__32 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__33 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "<");
  const__34 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__35 = (clojure.lang.Symbol)Symbol.intern(null, ".nth");
  const__36 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-cons");
  const__37 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk");
  const__38 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-rest");
  const__39 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-cons");
  const__40 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk");
  const__41 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__42 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "first");
 }
 Object body_expr4;
 Object err6;
 public core_for_emit_bind__4628(final Object body_expr4, final Object err6) {
  super();
  this.body_expr4 = body_expr4;
  this.err6 = err6;
 }
 public java.lang.Object invoke(java.lang.Object p__46271) {
  {
   Object vec__46292 = p__46271;
   Object vec__46303 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46292), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object bind4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46303), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object expr5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46303), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object mod_pairs6 = ((IFn)const__3.getRawRoot()).invoke(vec__46303, const__4);
   Object vec__46317 = ((IFn)const__3.getRawRoot()).invoke(vec__46292, const__2);
   Object vec__46328 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46317), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object _9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46328), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object next_expr10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46328), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object next_groups11 = vec__46317;
   {
    Object giter12 = ((IFn)const__5.getRawRoot()).invoke("iter__");
    Object gxs13 = ((IFn)const__5.getRawRoot()).invoke("s__");
    Object do_mod14 = new clojure.core_for_emit_bind__4628_do_mod__4634(this.body_expr4, giter12, next_groups11, this, gxs13, next_expr10, this.err6);
    Object __r2886 = next_groups11;
    if (__r2886 != null && !(__r2886 == Boolean.FALSE)) {
     return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(giter12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gxs13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__13), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gxs13), ((IFn)const__8.getRawRoot()).invoke(gxs13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__14), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(bind4), ((IFn)const__8.getRawRoot()).invoke(gxs13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)do_mod14).invoke(mod_pairs6)))))))))))));
    } else {
     {
      Object gi15 = ((IFn)const__5.getRawRoot()).invoke("i__");
      Object gb16 = ((IFn)const__5.getRawRoot()).invoke("b__");
      Object do_cmod17 = new clojure.core_for_emit_bind__4628_do_cmod__4639(this.body_expr4, gb16, this.err6, gi15);
      return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__15), ((IFn)const__8.getRawRoot()).invoke(giter12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gxs13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__16), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__17), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gxs13), ((IFn)const__8.getRawRoot()).invoke(gxs13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__18), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gxs13), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__19), ((IFn)const__8.getRawRoot()).invoke(gxs13)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__20), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(gxs13)))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__22), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__23), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__24), ((IFn)const__8.getRawRoot()).invoke(gxs13)))), ((IFn)const__8.getRawRoot()).invoke(const__25), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__26), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__27), ((IFn)const__8.getRawRoot()).invoke(const__23))))))), ((IFn)const__8.getRawRoot()).invoke(gb16), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__28), ((IFn)const__8.getRawRoot()).invoke(const__25)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__29), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__30), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(gi15), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__31), ((IFn)const__8.getRawRoot()).invoke(const__1)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__32), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__33), ((IFn)const__8.getRawRoot()).invoke(gi15), ((IFn)const__8.getRawRoot()).invoke(const__25)))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__34), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(bind4), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__35), ((IFn)const__8.getRawRoot()).invoke(const__23), ((IFn)const__8.getRawRoot()).invoke(gi15)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)do_cmod17).invoke(mod_pairs6))))), ((IFn)const__8.getRawRoot()).invoke(Boolean.TRUE))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__36), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__37), ((IFn)const__8.getRawRoot()).invoke(gb16)))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(giter12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__38), ((IFn)const__8.getRawRoot()).invoke(gxs13)))))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__39), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__40), ((IFn)const__8.getRawRoot()).invoke(gb16)))), ((IFn)const__8.getRawRoot()).invoke(null)))))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__41), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(bind4), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__42), ((IFn)const__8.getRawRoot()).invoke(gxs13)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)do_mod14).invoke(mod_pairs6)))))))))))))))))));
     }
    }
   }
  }
 }
}
