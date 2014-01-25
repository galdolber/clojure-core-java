package clojure;

import clojure.lang.*;

public final class core_prep_hashes_fn__5154 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "shift-mask");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash");
 }
 Object mask9;
 Object shift8;
 public core_prep_hashes_fn__5154(final Object mask9, final Object shift8) {
  super();
  this.mask9 = mask9;
  this.shift8 = shift8;
 }
 public java.lang.Object invoke(java.lang.Object p1__5151_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.shift8, this.mask9, ((IFn)const__1.getRawRoot()).invoke(p1__5151_SHARP_1));
 }
}
