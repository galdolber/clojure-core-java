package clojure;

import clojure.lang.*;

public final class core_comp_fn__4181 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object h3;
 Object g2;
 Object f1;
 public core_comp_fn__4181(final Object h3, final Object g2, final Object f1) {
  super();
  this.h3 = h3;
  this.g2 = g2;
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3, java.lang.Object args4) {
  return ((IFn)this.f1).invoke(((IFn)this.g2).invoke(((IFn)const__0.getRawRoot()).invoke(this.h3, x1, y2, z3, args4)));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object z3) {
  return ((IFn)this.f1).invoke(((IFn)this.g2).invoke(((IFn)this.h3).invoke(x1, y2, z3)));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)this.f1).invoke(((IFn)this.g2).invoke(((IFn)this.h3).invoke(x1, y2)));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)this.f1).invoke(((IFn)this.g2).invoke(((IFn)this.h3).invoke(x1)));
 }
 public java.lang.Object invoke() {
  return ((IFn)this.f1).invoke(((IFn)this.g2).invoke(((IFn)this.h3).invoke()));
 }
 public int getRequiredArity() {
  return 3;
 }
}
