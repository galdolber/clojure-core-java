package clojure;

import clojure.lang.*;

public final class core_binding extends clojure.lang.RestFn {
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
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
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
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "push-thread-bindings");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "hash-map");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "finally");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "pop-thread-bindings");
 }
 public core_binding() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2426 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2426 != null && !(__r2426 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  Object __r2428 = ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)bindings3))));
  if (__r2428 != null && !(__r2428 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "an even number of forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  {
   Object var_ize5 = new clojure.core_binding_var_ize__4122();
   return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke()))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__14), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__15), ((IFn)var_ize5).invoke(bindings3))))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__16), body4, ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__17), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__18))))))))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
