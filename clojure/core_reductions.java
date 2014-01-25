package clojure;

import clojure.lang.*;

public final class core_reductions extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_reductions() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object init2, java.lang.Object coll3) {
  return ((IFn)const__0.getRawRoot()).invoke(init2, new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_reductions_fn__6385(coll3, init2, f1))));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_reductions_fn__6382(coll2, f1)));
 }
}
