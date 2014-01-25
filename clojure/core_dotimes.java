package clojure;

import clojure.lang.*;

public final class core_dotimes extends clojure.lang.RestFn {
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
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final java.lang.Object const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
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
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "n__4366__auto__");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "long");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__19 = (java.lang.Object)0L;
  const__20 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "<");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "unchecked-inc");
 }
 public core_dotimes() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2619 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2619 != null && !(__r2619 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.equiv((long)2L, (long)clojure.lang.RT.count(((java.lang.Object)bindings3)))) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "exactly 2 forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object i5 = ((IFn)const__2.getRawRoot()).invoke(bindings3);
   Object n6 = ((IFn)const__9.getRawRoot()).invoke(bindings3);
   return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__16), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__17), ((IFn)const__12.getRawRoot()).invoke(n6)))))))), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__18), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(i5), ((IFn)const__12.getRawRoot()).invoke(const__19))))), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__20), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__21), ((IFn)const__12.getRawRoot()).invoke(i5), ((IFn)const__12.getRawRoot()).invoke(const__16)))), body4, ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__22), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__23), ((IFn)const__12.getRawRoot()).invoke(i5)))))))))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
