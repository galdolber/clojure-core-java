package clojure;

import clojure.lang.*;

public final class pprint_defdirectives extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "directive-table");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "hash-map");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "process-directive-table-element");
 }
 public pprint_defdirectives() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object directives3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5, ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(Boolean.TRUE)))))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__9), ((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), directives3))))));
 }
 public int getRequiredArity() {
  return 2;
 }
}
