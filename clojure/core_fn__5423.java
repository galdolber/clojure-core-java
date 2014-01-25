package clojure;

import clojure.lang.*;

public final class core_fn__5423 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
 }
 public core_fn__5423() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(s1, w2);
 }
}
