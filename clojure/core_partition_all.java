package clojure;

import clojure.lang.*;

public final class core_partition_all extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "partition-all");
 }
 public core_partition_all() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object step2, java.lang.Object coll3) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_partition_all_fn__6390(step2, coll3, n1)));
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(n1, n1, coll2);
 }
}
