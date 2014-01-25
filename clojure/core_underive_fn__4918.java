package clojure;

import clojure.lang.*;

public final class core_underive_fn__4918 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "derive");
 }
 public core_underive_fn__4918() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4914_SHARP_1, java.lang.Object p2__4915_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), p1__4914_SHARP_1, p2__4915_SHARP_2);
 }
}
