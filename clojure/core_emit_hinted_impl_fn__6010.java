package clojure;

import clojure.lang.*;

public final class core_emit_hinted_impl_fn__6010 extends clojure.lang.AFunction {
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
 Object hint6;
 public core_emit_hinted_impl_fn__6010(final Object hint6) {
  super();
  this.hint6 = hint6;
 }
 public java.lang.Object invoke(java.lang.Object p1__5998_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)this.hint6).invoke(((IFn)const__2.getRawRoot()).invoke(const__3, p1__5998_SHARP_1)));
 }
}
