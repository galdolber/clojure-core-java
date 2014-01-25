package clojure;

import clojure.lang.*;

public final class core_import_fn__4384_fn__4385 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object p3;
 public core_import_fn__4384_fn__4385(final Object p3) {
  super();
  this.p3 = p3;
 }
 public java.lang.Object invoke(java.lang.Object p1__4378_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.p3, ".", p1__4378_SHARP_1);
 }
}
