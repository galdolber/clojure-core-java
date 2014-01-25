package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4202_fn__4209 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 Object y2;
 Object x1;
 Object z3;
 public core_juxt_fn__4202_fn__4209(final Object y2, final Object x1, final Object z3) {
  super();
  this.y2 = y2;
  this.x1 = x1;
  this.z3 = z3;
 }
 public java.lang.Object invoke(java.lang.Object p1__4192_SHARP_1, java.lang.Object p2__4193_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__4192_SHARP_1, ((IFn)p2__4193_SHARP_2).invoke(this.x1, this.y2, this.z3));
 }
}
