package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5267 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "most-specific");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public core_generate_proxy_fn__5267() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5197_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5197_SHARP_1));
 }
}
