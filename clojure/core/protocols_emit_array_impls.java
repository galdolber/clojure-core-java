package clojure.core;

import clojure.lang.*;

public final class protocols_emit_array_impls extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "extend-protocol");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core.protocols", "InternalReduce");
  const__5 = (clojure.lang.Var)RT.var("clojure.core.protocols", "emit-array-impls*");
 }
 public protocols_emit_array_impls() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object syms3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__5.getRawRoot()).invoke(syms3)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
