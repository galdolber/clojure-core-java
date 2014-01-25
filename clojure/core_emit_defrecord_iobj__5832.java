package clojure;

import clojure.lang.*;

public final class core_emit_defrecord_iobj__5832 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Symbol const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IObj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "meta");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "this__5778__auto__");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "__meta");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "withMeta");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, "this__5779__auto__");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "replace");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "__meta");
 }
 Object tagname1;
 Object fields13;
 Object gs15;
 public core_emit_defrecord_iobj__5832(final Object tagname1, final Object fields13, final Object gs15) {
  super();
  this.tagname1 = tagname1;
  this.fields13 = fields13;
  this.gs15 = gs15;
 }
 public java.lang.Object invoke(java.lang.Object p__58311) {
  {
   Object vec__58332 = p__58311;
   Object i3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58332), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object m4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58332), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(((IFn)const__3.getRawRoot()).invoke(i3, const__4), ((IFn)const__3.getRawRoot()).invoke(m4, ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__11))))), ((IFn)const__7.getRawRoot()).invoke(const__12))), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__13), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__14), ((IFn)const__7.getRawRoot()).invoke(this.gs15))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__15), ((IFn)const__7.getRawRoot()).invoke(this.tagname1), ((IFn)const__16.getRawRoot()).invoke(RT.mapUniqueKeys(const__17, this.gs15), this.fields13))))))));
  }
 }
}
