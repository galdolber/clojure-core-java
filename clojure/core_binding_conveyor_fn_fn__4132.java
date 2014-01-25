package clojure;

import clojure.lang.*;

public final class core_binding_conveyor_fn_fn__4132 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 Object frame2;
 public core_binding_conveyor_fn_fn__4132(final Object f1, final Object frame2) {
  super();
  this.f1 = f1;
  this.frame2 = frame2;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  clojure.lang.Var.resetThreadBindingFrame(((java.lang.Object)this.frame2));
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, x1, y2, z3, args4);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  clojure.lang.Var.resetThreadBindingFrame(((java.lang.Object)this.frame2));
  return ((IFn)this.f1).invoke(x1, y2, z3);
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  clojure.lang.Var.resetThreadBindingFrame(((java.lang.Object)this.frame2));
  return ((IFn)this.f1).invoke(x1, y2);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  clojure.lang.Var.resetThreadBindingFrame(((java.lang.Object)this.frame2));
  return ((IFn)this.f1).invoke(x1);
 }
 public java.lang.Object invoke() {
  clojure.lang.Var.resetThreadBindingFrame(((java.lang.Object)this.frame2));
  return ((IFn)this.f1).invoke();
 }
 public int getRequiredArity() {
  return 3;
 }
}
