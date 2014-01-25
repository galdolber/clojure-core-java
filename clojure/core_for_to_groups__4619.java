package clojure;

import clojure.lang.*;

public final class core_for_to_groups__4619 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__2 = (java.lang.Object)2L;
 }
 public core_for_to_groups__4619() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object seq_exprs1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_for_to_groups__4619_fn__4621(), clojure.lang.PersistentVector.EMPTY, ((IFn)const__1.getRawRoot()).invoke(const__2, seq_exprs1));
 }
}
