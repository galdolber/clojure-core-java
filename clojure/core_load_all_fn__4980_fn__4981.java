package clojure;

import clojure.lang.*;

public final class core_load_all_fn__4980_fn__4981 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_load_all_fn__4980_fn__4981() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4978_SHARP_1, java.lang.Object p2__4979_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), p1__4978_SHARP_1, p2__4979_SHARP_2);
 }
}
