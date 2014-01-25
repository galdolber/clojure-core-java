package clojure;

import clojure.lang.*;

public final class main_with_read_known extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "binding");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*read-eval*");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "=");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "unknown");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*read-eval*");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*read-eval*");
 }
 public main_with_read_known() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object body3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__7), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(const__9), ((IFn)const__2.getRawRoot()).invoke(const__10)))), ((IFn)const__2.getRawRoot()).invoke(Boolean.TRUE), ((IFn)const__2.getRawRoot()).invoke(const__11)))))))), body3));
 }
 public int getRequiredArity() {
  return 2;
 }
}
