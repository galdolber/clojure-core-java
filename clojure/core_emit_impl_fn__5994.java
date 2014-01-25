package clojure;

import clojure.lang.*;

public final class core_emit_impl_fn__5994 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "fn");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__3 = (java.lang.Object)1L;
 }
 public core_emit_impl_fn__5994() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5989_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(const__3, p1__5989_SHARP_1));
 }
}
