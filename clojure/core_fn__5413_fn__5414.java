package clojure;

import clojure.lang.*;

public final class core_fn__5413_fn__5414 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
 }
 public core_fn__5413_fn__5414() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5411_SHARP_1, java.lang.Object p2__5412_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke("[", const__1.getRawRoot(), " ", "]", p1__5411_SHARP_1, p2__5412_SHARP_2);
 }
}
