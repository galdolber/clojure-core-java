package clojure;

import clojure.lang.*;

public final class core_with_local_vars extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final java.lang.Object const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.IPersistentStack const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "take-nth");
  const__16 = (java.lang.Object)2L;
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__18 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, ".."), Symbol.intern(null, "clojure.lang.Var"), Symbol.intern(null, "create"), Symbol.intern(null, "setDynamic")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 3970, Keyword.intern(null, "column"), 33));
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Var");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "pushThreadBindings");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "hash-map");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__24 = (clojure.lang.Symbol)Symbol.intern(null, "finally");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Var");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "popThreadBindings");
 }
 public core_with_local_vars() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name_vals_vec3, java.lang.Object body4) {
  Object __r2783 = ((IFn)const__0.getRawRoot()).invoke(name_vals_vec3);
  if (__r2783 != null && !(__r2783 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  Object __r2785 = ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)name_vals_vec3))));
  if (__r2785 != null && !(__r2785 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "an even number of forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__16, name_vals_vec3), ((IFn)const__17.getRawRoot()).invoke(const__18)))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__19), ((IFn)const__10.getRawRoot()).invoke(const__20), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__21), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__22), name_vals_vec3))))))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__23), body4, ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__24), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__25), ((IFn)const__10.getRawRoot()).invoke(const__26), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__27)))))))))))))));
 }
 public int getRequiredArity() {
  return 3;
 }
}
