package clojure;

import clojure.lang.*;

public final class core_map_fn__4247 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 public core_map_fn__4247(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4231_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, p1__4231_SHARP_1);
 }
}
