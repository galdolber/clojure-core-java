package clojure;

import clojure.lang.*;

public final class walk_prewalk_demo_fn__6598 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "prn");
 }
 public walk_prewalk_demo_fn__6598() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  ((IFn)const__0.getRawRoot()).invoke("Walked: ");
  ((IFn)const__1.getRawRoot()).invoke(x1);
  return x1;
 }
}
