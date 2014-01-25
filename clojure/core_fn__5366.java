package clojure;

import clojure.lang.*;

public final class core_fn__5366 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
 }
 public core_fn__5366() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(o1, new clojure.core_fn__5366_fn__5367()), w2);
 }
}
