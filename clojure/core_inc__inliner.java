package clojure;

import clojure.lang.*;

public final class core_inc__inliner extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Numbers");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*unchecked-math*");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "unchecked_inc");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "inc");
 }
 public core_inc__inliner() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r2341;
  Object __r2342 = const__5.get();
  if (__r2342 != null && !(__r2342 == Boolean.FALSE)) {
   __r2341 = const__6;
  } else {
   __r2341 = const__7;
  }
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(__r2341), ((IFn)const__2.getRawRoot()).invoke(x1))))));
 }
}
