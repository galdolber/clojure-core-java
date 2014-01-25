package clojure;

import clojure.lang.*;

public final class core_some__GT__GT__pstep__6582 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "nil?");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "->>");
 }
 Object g5;
 public core_some__GT__GT__pstep__6582(final Object g5) {
  super();
  this.g5 = g5;
 }
 public java.lang.Object invoke(java.lang.Object step1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(this.g5)))), ((IFn)const__2.getRawRoot()).invoke(null), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(this.g5), ((IFn)const__2.getRawRoot()).invoke(step1))))));
 }
}
