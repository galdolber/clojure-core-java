package clojure;

import clojure.lang.*;

public final class pprint_fn__8068_fn__8069 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "modify-case");
 }
 Object mod_case_writer4;
 public pprint_fn__8068_fn__8069(final Object mod_case_writer4) {
  super();
  this.mod_case_writer4 = mod_case_writer4;
 }
 public java.lang.Object invoke(java.lang.Object p1__7971_SHARP_1, java.lang.Object p2__7972_SHARP_2, java.lang.Object p3__7973_SHARP_3) {
  return ((IFn)const__0.getRawRoot()).invoke(this.mod_case_writer4, p1__7971_SHARP_1, p2__7972_SHARP_2, p3__7973_SHARP_3);
 }
}
