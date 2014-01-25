package clojure;

import clojure.lang.*;

public final class core_complement_fn__4073 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 public core_complement_fn__4073(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object zs3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.f1, x1, y2, zs3));
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)this.f1).invoke(x1, y2));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)this.f1).invoke(x1));
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)this.f1).invoke());
 }
 public int getRequiredArity() {
  return 2;
 }
}
