package clojure;

import clojure.lang.*;

public final class core_letfn extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "letfn*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_letfn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object fnspecs3, java.lang.Object body4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), fnspecs3), ((IFn)const__6.getRawRoot()).invoke(new clojure.core_letfn_fn__5084(), fnspecs3)))), body4));
 }
 public int getRequiredArity() {
  return 3;
 }
}
