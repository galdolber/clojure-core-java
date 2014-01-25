package clojure;

import clojure.lang.*;

public final class set_project_fn__6871 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "select-keys");
 }
 Object ks2;
 public set_project_fn__6871(final Object ks2) {
  super();
  this.ks2 = ks2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6870_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__6870_SHARP_1, this.ks2);
 }
}
