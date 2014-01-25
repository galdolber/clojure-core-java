package clojure;

import clojure.lang.*;

public final class pprint_fn__7978_fn__7979 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "format-ascii");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
 }
 public pprint_fn__7978_fn__7979() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7935_SHARP_1, java.lang.Object p2__7936_SHARP_2, java.lang.Object p3__7937_SHARP_3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), p1__7935_SHARP_1, p2__7936_SHARP_2, p3__7937_SHARP_3);
 }
}
