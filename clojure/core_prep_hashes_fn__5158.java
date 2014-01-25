package clojure;

import clojure.lang.*;

public final class core_prep_hashes_fn__5158 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "shift-mask");
 }
 Object mask16;
 Object shift15;
 public core_prep_hashes_fn__5158(final Object mask16, final Object shift15) {
  super();
  this.mask16 = mask16;
  this.shift15 = shift15;
 }
 public java.lang.Object invoke(java.lang.Object p1__5152_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.shift15, this.mask16, p1__5152_SHARP_1);
 }
}
