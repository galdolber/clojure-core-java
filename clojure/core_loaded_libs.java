package clojure;

import clojure.lang.*;

public final class core_loaded_libs extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
 }
 public core_loaded_libs() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get());
 }
}
