package clojure;

import clojure.lang.*;

public final class core_unchecked_multiply_int__inliner extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Numbers");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "unchecked_int_multiply");
 }
 public core_unchecked_multiply_int__inliner() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(x1), ((IFn)const__2.getRawRoot()).invoke(y2))))));
 }
}
