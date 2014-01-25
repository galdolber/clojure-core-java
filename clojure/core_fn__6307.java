package clojure;

import clojure.lang.*;

public final class core_fn__6307 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 public core_fn__6307() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object amap1, java.lang.Object f2, java.lang.Object init3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_fn__6307_fn__6309(f2), init3, amap1);
 }
}
