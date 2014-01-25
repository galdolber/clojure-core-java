package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4196 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 public core_juxt_fn__4196(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(this.f1, x1, y2, z3, args4));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return RT.vector(((IFn)this.f1).invoke(x1, y2, z3));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return RT.vector(((IFn)this.f1).invoke(x1, y2));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return RT.vector(((IFn)this.f1).invoke(x1));
 }
 public java.lang.Object invoke() {
  return RT.vector(((IFn)this.f1).invoke());
 }
 public int getRequiredArity() {
  return 3;
 }
}
