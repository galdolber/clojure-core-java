package clojure;

import clojure.lang.*;

public final class core_fn__5413 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-ctor");
 }
 public core_fn__5413() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(o1, new clojure.core_fn__5413_fn__5414(), w2);
 }
}
