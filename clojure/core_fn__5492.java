package clojure;

import clojure.lang.*;

public final class core_fn__5492 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
 }
 public core_fn__5492() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1, w2);
 }
}
