package clojure;

import clojure.lang.*;

public final class core_emit_extend_type extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "parse-impls");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "extend");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "partial");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "emit-hinted-impl");
 }
 public core_emit_extend_type() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object specs2) {
  {
   Object impls3 = ((IFn)const__0.getRawRoot()).invoke(specs2);
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(c1), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), c1), impls3)));
  }
 }
}
