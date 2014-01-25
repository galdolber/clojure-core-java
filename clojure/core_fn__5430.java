package clojure;

import clojure.lang.*;

public final class core_fn__5430 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
 }
 public core_fn__5430() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object w2) {
  ((IFn)const__0.getRawRoot()).invoke(m1, w2);
  return ((IFn)const__1.getRawRoot()).invoke(m1, const__2.getRawRoot(), w2);
 }
}
