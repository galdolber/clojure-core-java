package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4202_fn__4203 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_juxt_fn__4202_fn__4203() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4186_SHARP_1, java.lang.Object p2__4187_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__4186_SHARP_1, ((IFn)p2__4187_SHARP_2).invoke());
 }
}
