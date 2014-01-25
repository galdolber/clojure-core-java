package clojure;

import clojure.lang.*;

public final class core_nil_QMARK___inliner extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern("clojure.lang.Util", "identical");
 }
 public core_nil_QMARK___inliner() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, x1, null);
 }
}
