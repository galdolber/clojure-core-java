package clojure.core.reducers;

import clojure.lang.*;

public final class Cat_fn__6732_fn__6733 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "coll-fold");
 }
 Object n1;
 Object combinef2;
 Object right;
 Object reducef3;
 public Cat_fn__6732_fn__6733(final Object n1, final Object combinef2, final Object right, final Object reducef3) {
  super();
  this.n1 = n1;
  this.combinef2 = combinef2;
  this.right = right;
  this.reducef3 = reducef3;
 }
 public java.lang.Object invoke() {
  Object __r4407 = this.right;
  if (!(__r4407 instanceof clojure.core.reducers.CollFold)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4407, this.n1, this.combinef2, this.reducef3);
  } else {
   return ((clojure.core.reducers.CollFold) __r4407).coll_fold(((java.lang.Object)this.n1), ((java.lang.Object)this.combinef2), ((java.lang.Object)this.reducef3));
  }
 }
}
