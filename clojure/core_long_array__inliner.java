package clojure;

import clojure.lang.*;

public final class core_long_array__inliner extends clojure.lang.RestFn {
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
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "long_array");
 }
 public core_long_array__inliner() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(const__5), args1));
 }
 public int getRequiredArity() {
  return 0;
 }
}
