package clojure;

import clojure.lang.*;

public final class core_iterate extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_iterate() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object x2) {
  return ((IFn)const__0.getRawRoot()).invoke(x2, new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_iterate_fn__4291(f1, x2))));
 }
}
