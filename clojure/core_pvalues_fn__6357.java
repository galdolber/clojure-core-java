package clojure;

import clojure.lang.*;

public final class core_pvalues_fn__6357 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
 }
 public core_pvalues_fn__6357() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__6356_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, clojure.lang.PersistentVector.EMPTY, p1__6356_SHARP_1);
 }
}
