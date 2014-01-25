package clojure;

import clojure.lang.*;

public final class core_when_first extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__7 = (java.lang.Object)2L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__10 = (java.lang.Object)0L;
  const__11 = (java.lang.Object)1L;
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-let");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "xs__4607__auto__");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__20 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "first");
 }
 public core_when_first() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2865 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2865 != null && !(__r2865 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.equiv((long)2L, (long)clojure.lang.RT.count(((java.lang.Object)bindings3)))) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "exactly 2 forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object vec__46085 = bindings3;
   Object x6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46085), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object xs7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46085), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__18), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__19), ((IFn)const__14.getRawRoot()).invoke(xs7)))))))), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__20), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17.getRawRoot(), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(x6), ((IFn)const__14.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__21), ((IFn)const__14.getRawRoot()).invoke(const__18)))))))), body4)))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
