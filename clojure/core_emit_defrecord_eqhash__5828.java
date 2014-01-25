package clojure;

import clojure.lang.*;

public final class core_emit_defrecord_eqhash__5828 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IHashEq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "hasheq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "this__5775__auto__");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "bit-xor");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.APersistentMap", "mapHasheq");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "hashCode");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, "this__5776__auto__");
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.APersistentMap", "mapHash");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "equals");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "this__5777__auto__");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.APersistentMap", "mapEquals");
 }
 Object type_hash14;
 Object gs15;
 public core_emit_defrecord_eqhash__5828(final Object type_hash14, final Object gs15) {
  super();
  this.type_hash14 = type_hash14;
  this.gs15 = gs15;
 }
 public java.lang.Object invoke(java.lang.Object p__58271) {
  {
   Object vec__58292 = p__58271;
   Object i3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58292), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object m4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58292), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(((IFn)const__3.getRawRoot()).invoke(i3, const__4), ((IFn)const__3.getRawRoot()).invoke(m4, ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__11))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__12), ((IFn)const__7.getRawRoot()).invoke(this.type_hash14), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__13), ((IFn)const__7.getRawRoot()).invoke(const__11))))))))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__14), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__15))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__16), ((IFn)const__7.getRawRoot()).invoke(const__15)))))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__17), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__18), ((IFn)const__7.getRawRoot()).invoke(this.gs15))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__19), ((IFn)const__7.getRawRoot()).invoke(const__18), ((IFn)const__7.getRawRoot()).invoke(this.gs15))))))));
  }
 }
}
