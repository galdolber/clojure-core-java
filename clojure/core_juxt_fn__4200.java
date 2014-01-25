package clojure;

import clojure.lang.*;

public final class core_juxt_fn__4200 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object h3;
 Object f1;
 Object g2;
 public core_juxt_fn__4200(final Object h3, final Object f1, final Object g2) {
  super();
  this.h3 = h3;
  this.f1 = f1;
  this.g2 = g2;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(this.f1, x1, y2, z3, args4), ((IFn)const__0.getRawRoot()).invoke(this.g2, x1, y2, z3, args4), ((IFn)const__0.getRawRoot()).invoke(this.h3, x1, y2, z3, args4));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return RT.vector(((IFn)this.f1).invoke(x1, y2, z3), ((IFn)this.g2).invoke(x1, y2, z3), ((IFn)this.h3).invoke(x1, y2, z3));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return RT.vector(((IFn)this.f1).invoke(x1, y2), ((IFn)this.g2).invoke(x1, y2), ((IFn)this.h3).invoke(x1, y2));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return RT.vector(((IFn)this.f1).invoke(x1), ((IFn)this.g2).invoke(x1), ((IFn)this.h3).invoke(x1));
 }
 public java.lang.Object invoke() {
  return RT.vector(((IFn)this.f1).invoke(), ((IFn)this.g2).invoke(), ((IFn)this.h3).invoke());
 }
 public int getRequiredArity() {
  return 3;
 }
}
