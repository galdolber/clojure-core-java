package clojure;

import clojure.lang.*;

public final class core_split_with extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "drop-while");
 }
 public core_split_with() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(pred1, coll2), ((IFn)const__1.getRawRoot()).invoke(pred1, coll2));
 }
}
