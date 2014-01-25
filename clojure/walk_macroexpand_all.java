package clojure;

import clojure.lang.*;

public final class walk_macroexpand_all extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk");
 }
 public walk_macroexpand_all() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.walk_macroexpand_all_fn__6621(), form1);
 }
}
