package clojure;

import clojure.lang.*;

public final class instant_fn__6283 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "print-timestamp");
 }
 public instant_fn__6283() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ts1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(ts1, w2);
 }
}
