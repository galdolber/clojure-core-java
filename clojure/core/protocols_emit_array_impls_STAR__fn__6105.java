package clojure.core;

import clojure.lang.*;

public final class protocols_emit_array_impls_STAR__fn__6105 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.protocols", "arr-impl");
 }
 public protocols_emit_array_impls_STAR__fn__6105() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke("clojure.lang.ArraySeq$ArraySeq_", s1)), const__2.getRawRoot());
 }
}
