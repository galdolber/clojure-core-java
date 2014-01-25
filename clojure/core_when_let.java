package clojure;

import clojure.lang.*;

public final class core_when_let extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
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
  const__9 = (java.lang.Object)0L;
  const__10 = (java.lang.Object)1L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "temp__4117__auto__");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
 }
 public core_when_let() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2421 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2421 != null && !(__r2421 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.equiv((long)2L, (long)clojure.lang.RT.count(((java.lang.Object)bindings3)))) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "exactly 2 forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object form5 = ((IFn)bindings3).invoke(const__9);
   Object tst6 = ((IFn)bindings3).invoke(const__10);
   return ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__14), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__17), ((IFn)const__13.getRawRoot()).invoke(tst6))))), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__18), ((IFn)const__13.getRawRoot()).invoke(const__17), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(const__19), ((IFn)const__13.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(const__16.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(form5), ((IFn)const__13.getRawRoot()).invoke(const__17))))), body4))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
