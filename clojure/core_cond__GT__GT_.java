package clojure;

import clojure.lang.*;

public final class core_cond__GT__GT_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.IPersistentStack const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final java.lang.Object const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
  const__4 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "even?"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "count"), Symbol.intern(null, "clauses")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 6873, Keyword.intern(null, "column"), 18))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 6873, Keyword.intern(null, "column"), 11));
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__16 = (java.lang.Object)2L;
 }
 public core_cond__GT__GT_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object expr3, java.lang.Object clauses4) {
  Object __r4333 = ((IFn)const__0.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)clauses4))));
  if (__r4333 != null && !(__r4333 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.AssertionError(((java.lang.Object)((IFn)const__2.getRawRoot()).invoke("Assert failed: ", ((IFn)const__3.getRawRoot()).invoke(const__4)))));
  }
  {
   Object g5 = ((IFn)const__5.getRawRoot()).invoke();
   Object pstep6 = new clojure.core_cond__GT__GT__pstep__6574(g5);
   return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(g5), ((IFn)const__8.getRawRoot()).invoke(expr3), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(g5), ((IFn)const__14.getRawRoot()).invoke(pstep6, ((IFn)const__15.getRawRoot()).invoke(const__16, clauses4))))))), ((IFn)const__8.getRawRoot()).invoke(g5)));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
