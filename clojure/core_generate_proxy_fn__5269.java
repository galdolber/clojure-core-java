package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5269 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
 }
 public core_generate_proxy_fn__5269() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5198_SHARP_1, java.lang.Object p2__5199_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)p1__5198_SHARP_1).invoke(p2__5199_SHARP_2), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(p1__5198_SHARP_1, p2__5199_SHARP_2)));
 }
}
