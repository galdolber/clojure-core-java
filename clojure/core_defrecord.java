package clojure;

import clojure.lang.*;

public final class core_defrecord extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "validate-fields");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "parse-opts+specs");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (java.lang.Object)2L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "namespace-munge");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "declare");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "->");
  const__20 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "declare");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "map->");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "emit-defrecord");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "import");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "build-positional-factory");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "map->");
  const__27 = (clojure.lang.Symbol)Symbol.intern(null, "m__5877__auto__");
 }
 public core_defrecord() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object fields4, java.lang.Object opts_PLUS_specs5) {
  ((IFn)const__0.getRawRoot()).invoke(fields4);
  {
   Object gname6 = name3;
   Object vec__58787 = ((IFn)const__1.getRawRoot()).invoke(opts_PLUS_specs5);
   Object interfaces8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58787), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object methods9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58787), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object opts10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58787), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object ns_part11 = ((IFn)const__6.getRawRoot()).invoke(const__7.get());
   Object classname12 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(ns_part11, ".", gname6));
   Object hinted_fields13 = fields4;
   Object fields14 = ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(new clojure.core_defrecord_fn__5879(), fields4));
   return ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke()))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__18), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__19, gname6)))))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__20), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__21, gname6)))))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__22.getRawRoot()).invoke(name3, gname6, ((IFn)const__10.getRawRoot()).invoke(hinted_fields13), ((IFn)const__10.getRawRoot()).invoke(interfaces8), methods9)), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__23), ((IFn)const__14.getRawRoot()).invoke(classname12)))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__24.getRawRoot()).invoke(gname6, classname12, fields14)), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__25), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__26, gname6))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke("Factory function for class ", classname12, ", taking a map of keywords to field values.")), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__27))))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(classname12, "/create"))), ((IFn)const__14.getRawRoot()).invoke(const__27)))))))))), ((IFn)const__14.getRawRoot()).invoke(classname12)));
  }
 }
 public int getRequiredArity() {
  return 4;
 }
}
