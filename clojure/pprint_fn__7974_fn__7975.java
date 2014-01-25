package clojure;

import clojure.lang.*;

public final class pprint_fn__7974_fn__7975 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "format-ascii");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-str");
 }
 public pprint_fn__7974_fn__7975() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7932_SHARP_1, java.lang.Object p2__7933_SHARP_2, java.lang.Object p3__7934_SHARP_3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), p1__7932_SHARP_1, p2__7933_SHARP_2, p3__7934_SHARP_3);
 }
}
