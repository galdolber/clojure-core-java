package clojure;

import clojure.lang.*;

public final class set_superset_QMARK__fn__6913 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
 }
 Object set11;
 public set_superset_QMARK__fn__6913(final Object set11) {
  super();
  this.set11 = set11;
 }
 public java.lang.Object invoke(java.lang.Object p1__6912_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.set11, p1__6912_SHARP_1);
 }
}
