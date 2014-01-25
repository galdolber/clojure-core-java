package clojure;

import clojure.lang.*;

public final class pprint_prlabel_fn__7383 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
 }
 public pprint_prlabel_fn__7383() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7382_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(const__1, p1__7382_SHARP_1), "=", p1__7382_SHARP_1);
 }
}
