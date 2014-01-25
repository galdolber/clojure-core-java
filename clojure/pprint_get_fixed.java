package clojure;

import clojure.lang.*;

public final class pprint_get_fixed extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "insert-decimal");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "expand-fixed");
 }
 public pprint_get_fixed() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object e2, java.lang.Object d3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(m1, e2, d3), e2);
 }
}
