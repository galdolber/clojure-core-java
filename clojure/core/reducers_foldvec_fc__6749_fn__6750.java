package clojure.core;

import clojure.lang.*;

public final class reducers_foldvec_fc__6749_fn__6750 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "foldvec");
 }
 Object n2;
 Object child1;
 Object combinef3;
 Object reducef4;
 public reducers_foldvec_fc__6749_fn__6750(final Object n2, final Object child1, final Object combinef3, final Object reducef4) {
  super();
  this.n2 = n2;
  this.child1 = child1;
  this.combinef3 = combinef3;
  this.reducef4 = reducef4;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.child1, this.n2, this.combinef3, this.reducef4);
 }
}
