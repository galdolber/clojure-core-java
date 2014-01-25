package clojure;

import clojure.lang.*;

public final class set_subset_QMARK__fn__6908 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
 }
 Object set22;
 public set_subset_QMARK__fn__6908(final Object set22) {
  super();
  this.set22 = set22;
 }
 public java.lang.Object invoke(java.lang.Object p1__6907_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.set22, p1__6907_SHARP_1);
 }
}
