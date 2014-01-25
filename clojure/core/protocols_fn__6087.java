package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6087 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.protocols", "seq-reduce");
 }
 public protocols_fn__6087() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2, java.lang.Object val3) {
  return ((IFn)const__0.getRawRoot()).invoke(coll1, f2, val3);
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2) {
  return ((IFn)const__0.getRawRoot()).invoke(coll1, f2);
 }
}
