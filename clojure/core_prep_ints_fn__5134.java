package clojure;

import clojure.lang.*;

public final class core_prep_ints_fn__5134 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "shift-mask");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "int");
 }
 Object shift5;
 Object mask6;
 public core_prep_ints_fn__5134(final Object shift5, final Object mask6) {
  super();
  this.shift5 = shift5;
  this.mask6 = mask6;
 }
 public java.lang.Object invoke(java.lang.Object p1__5132_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.shift5, this.mask6, Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)p1__5132_SHARP_1))));
 }
}
