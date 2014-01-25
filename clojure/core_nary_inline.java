package clojure;

import clojure.lang.*;

public final class core_nary_inline extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nary-inline");
 }
 public core_nary_inline() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object op1, java.lang.Object unchecked_op2) {
  return new clojure.core_nary_inline_fn__3986(op1, unchecked_op2);
 }
 public java.lang.Object invoke(java.lang.Object op1) {
  return ((IFn)const__0.getRawRoot()).invoke(op1, op1);
 }
}
