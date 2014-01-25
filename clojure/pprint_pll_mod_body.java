package clojure;

import clojure.lang.*;

public final class pprint_pll_mod_body extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "walk");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "identity");
 }
 public pprint_pll_mod_body() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object var_sym1, java.lang.Object body2) {
  IFn inner3 = new clojure.pprint_pll_mod_body_inner__7652(var_sym1);
  return ((IFn)const__0.getRawRoot()).invoke(inner3, const__1.getRawRoot(), body2);
 }
}
