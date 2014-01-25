package clojure;

import clojure.lang.*;

public final class core_emit_impl_fn__5992 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "keyword");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_emit_impl_fn__5992() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5988_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5988_SHARP_1));
 }
}
