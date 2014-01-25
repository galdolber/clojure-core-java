package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4202 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 Object fs5;
 public core_juxt_fn__4202(final Object fs5) {
  super();
  this.fs5 = fs5;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_juxt_fn__4202_fn__4211(y2, args4, z3, x1), clojure.lang.PersistentVector.EMPTY, this.fs5);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_juxt_fn__4202_fn__4209(y2, x1, z3), clojure.lang.PersistentVector.EMPTY, this.fs5);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_juxt_fn__4202_fn__4207(x1, y2), clojure.lang.PersistentVector.EMPTY, this.fs5);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_juxt_fn__4202_fn__4205(x1), clojure.lang.PersistentVector.EMPTY, this.fs5);
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_juxt_fn__4202_fn__4203(), clojure.lang.PersistentVector.EMPTY, this.fs5);
 }
 public int getRequiredArity() {
  return 3;
 }
}
