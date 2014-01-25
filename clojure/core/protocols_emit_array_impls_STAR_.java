package clojure.core;

import clojure.lang.*;

public final class protocols_emit_array_impls_STAR_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public protocols_emit_array_impls_STAR_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object syms1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(new clojure.core.protocols_emit_array_impls_STAR__fn__6105(), syms1));
 }
}
