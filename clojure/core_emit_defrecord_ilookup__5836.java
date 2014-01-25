package clojure;

import clojure.lang.*;

public final class core_emit_defrecord_ilookup__5836 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
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
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Keyword const__32;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.ILookup");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IKeywordLookup");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "valAt");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "this__5780__auto__");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "k__5781__auto__");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, ".valAt");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "valAt");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "this__5782__auto__");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "k__5783__auto__");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "else__5784__auto__");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "case");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "get");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "__extmap");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "getLookupThunk");
  const__24 = (clojure.lang.Symbol)Symbol.intern(null, "this__5785__auto__");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, "k__5786__auto__");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__27 = (clojure.lang.Symbol)Symbol.intern(null, "gclass");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "class");
  const__29 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "case");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__31 = (clojure.lang.Symbol)Symbol.intern(null, "gtarget");
  const__32 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
 }
 Object tagname1;
 Object base_fields12;
 public core_emit_defrecord_ilookup__5836(final Object tagname1, final Object base_fields12) {
  super();
  this.tagname1 = tagname1;
  this.base_fields12 = base_fields12;
 }
 public java.lang.Object invoke(java.lang.Object p__58351) {
  {
   Object vec__58372 = p__58351;
   Object i3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58372), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object m4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58372), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r3720 = null;
   {
    Object hinted_target5 = ((IFn)const__30.getRawRoot()).invoke(const__31, RT.mapUniqueKeys(const__32, this.tagname1));
    __r3720 = ((IFn)const__20.getRawRoot()).invoke(new clojure.core_emit_defrecord_ilookup__5836_fn__5840(hinted_target5), this.base_fields12);
   }
   return RT.vector(((IFn)const__3.getRawRoot()).invoke(i3, const__4, const__5), ((IFn)const__3.getRawRoot()).invoke(m4, ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__12), ((IFn)const__8.getRawRoot()).invoke(const__13))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__14), ((IFn)const__8.getRawRoot()).invoke(const__12), ((IFn)const__8.getRawRoot()).invoke(const__13), ((IFn)const__8.getRawRoot()).invoke(null)))))), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__15), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__16), ((IFn)const__8.getRawRoot()).invoke(const__17), ((IFn)const__8.getRawRoot()).invoke(const__18))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__19), ((IFn)const__8.getRawRoot()).invoke(const__17), ((IFn)const__20.getRawRoot()).invoke(new clojure.core_emit_defrecord_ilookup__5836_fn__5838(), this.base_fields12), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__21), ((IFn)const__8.getRawRoot()).invoke(const__22), ((IFn)const__8.getRawRoot()).invoke(const__17), ((IFn)const__8.getRawRoot()).invoke(const__18))))))))), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__23), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__24), ((IFn)const__8.getRawRoot()).invoke(const__25))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__26), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__27), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__28), ((IFn)const__8.getRawRoot()).invoke(const__24)))))))), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__29), ((IFn)const__8.getRawRoot()).invoke(const__25), __r3720, ((IFn)const__8.getRawRoot()).invoke(null)))))))))));
  }
 }
}
