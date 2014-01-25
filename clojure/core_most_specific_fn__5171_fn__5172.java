package clojure;

import clojure.lang.*;

public final class core_most_specific_fn__5171_fn__5172 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "isa?");
 }
 Object t1;
 public core_most_specific_fn__5171_fn__5172(final Object t1) {
  super();
  this.t1 = t1;
 }
 public java.lang.Object invoke(java.lang.Object p1__5170_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.t1, p1__5170_SHARP_1);
 }
}
