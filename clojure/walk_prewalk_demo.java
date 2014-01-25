package clojure;

import clojure.lang.*;

public final class walk_prewalk_demo extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk");
 }
 public walk_prewalk_demo() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.walk_prewalk_demo_fn__6598(), form1);
 }
}
