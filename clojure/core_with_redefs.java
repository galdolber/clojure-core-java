package clojure;

import clojure.lang.*;

public final class core_with_redefs extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "with-redefs-fn");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "take-nth");
  const__7 = (java.lang.Object)2L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 public core_with_redefs() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(new clojure.core_with_redefs_fn__6564(), ((IFn)const__6.getRawRoot()).invoke(const__7, bindings3)), ((IFn)const__6.getRawRoot()).invoke(const__7, ((IFn)const__8.getRawRoot()).invoke(bindings3)))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__9), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke()))), body4)))));
 }
 public int getRequiredArity() {
  return 3;
 }
}
