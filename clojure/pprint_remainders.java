package clojure;

import clojure.lang.*;

public final class pprint_remainders extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reverse");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_remainders() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object base1, java.lang.Object val2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(new clojure.pprint_remainders_fn__7683(base1), val2)));
 }
}
