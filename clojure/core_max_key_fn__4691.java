package clojure;

import clojure.lang.*;

public final class core_max_key_fn__4691 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "max-key");
 }
 Object k1;
 public core_max_key_fn__4691(final Object k1) {
  super();
  this.k1 = k1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4689_SHARP_1, java.lang.Object p2__4690_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(this.k1, p1__4689_SHARP_1, p2__4690_SHARP_2);
 }
}
