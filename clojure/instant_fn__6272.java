package clojure;

import clojure.lang.*;

public final class instant_fn__6272 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "print-calendar");
 }
 public instant_fn__6272() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(c1, w2);
 }
}
