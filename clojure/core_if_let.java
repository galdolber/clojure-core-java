package clojure;

import clojure.lang.*;

public final class core_if_let extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 public static final java.lang.Object const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "if-let");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__12 = (java.lang.Object)2L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__14 = (java.lang.Object)0L;
  const__15 = (java.lang.Object)1L;
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "temp__4115__auto__");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
 }
 public core_if_let() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object then4, java.lang.Object else5, java.lang.Object oldform6) {
  Object __r2417 = ((IFn)const__4.getRawRoot()).invoke(bindings3);
  if (__r2417 != null && !(__r2417 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__7.get(), ":", RT.get(((IFn)const__9.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.identical(((java.lang.Object)oldform6), ((java.lang.Object)null))) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "1 or 2 forms after binding vector", " in ", const__7.get(), ":", RT.get(((IFn)const__9.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.equiv((long)2L, (long)clojure.lang.RT.count(((java.lang.Object)bindings3)))) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "exactly 2 forms in binding vector", " in ", const__7.get(), ":", RT.get(((IFn)const__9.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object form7 = ((IFn)bindings3).invoke(const__14);
   Object tst8 = ((IFn)bindings3).invoke(const__15);
   return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__16), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(const__18.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__19), ((IFn)const__2.getRawRoot()).invoke(tst8))))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__20), ((IFn)const__2.getRawRoot()).invoke(const__19), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__21), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__17.getRawRoot()).invoke(const__18.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(form7), ((IFn)const__2.getRawRoot()).invoke(const__19))))), ((IFn)const__2.getRawRoot()).invoke(then4)))), ((IFn)const__2.getRawRoot()).invoke(else5))))));
  }
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object then4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(bindings3), ((IFn)const__2.getRawRoot()).invoke(then4), ((IFn)const__2.getRawRoot()).invoke(null)));
 }
 public int getRequiredArity() {
  return 5;
 }
}
