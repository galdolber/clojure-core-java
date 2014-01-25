package clojure;

import clojure.lang.*;

public final class instant_fn__6265 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.instant", "print-date");
 }
 public instant_fn__6265() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object d1, java.lang.Object w2) {
  return ((IFn)const__0.getRawRoot()).invoke(d1, w2);
 }
}
