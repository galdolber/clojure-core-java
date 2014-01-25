package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4202_fn__4211 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object y2;
 Object args4;
 Object z3;
 Object x1;
 public core_juxt_fn__4202_fn__4211(final Object y2, final Object args4, final Object z3, final Object x1) {
  super();
  this.y2 = y2;
  this.args4 = args4;
  this.z3 = z3;
  this.x1 = x1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4194_SHARP_1, java.lang.Object p2__4195_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__4194_SHARP_1, ((IFn)const__1.getRawRoot()).invoke(p2__4195_SHARP_2, this.x1, this.y2, this.z3, this.args4));
 }
}
