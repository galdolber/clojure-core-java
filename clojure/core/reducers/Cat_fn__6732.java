package clojure.core.reducers;

import clojure.lang.*;

public final class Cat_fn__6732 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjfork");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjtask");
  const__2 = (clojure.lang.Var)RT.var("clojure.core.reducers", "coll-fold");
  const__3 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjjoin");
 }
 Object n1;
 Object combinef2;
 Object right;
 Object left;
 Object reducef3;
 public Cat_fn__6732(final Object n1, final Object combinef2, final Object right, final Object left, final Object reducef3) {
  super();
  this.n1 = n1;
  this.combinef2 = combinef2;
  this.right = right;
  this.left = left;
  this.reducef3 = reducef3;
 }
 public java.lang.Object invoke() {
  {
   Object rt1 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core.reducers.Cat_fn__6732_fn__6733(this.n1, this.combinef2, this.right, this.reducef3)));
   Object __r4408 = this.left;
   if (!(__r4408 instanceof clojure.core.reducers.CollFold)) {
    __r4408 = ((IFn)const__2.getRawRoot()).invoke(__r4408, this.n1, this.combinef2, this.reducef3);
   } else {
    __r4408 = ((java.lang.Object)((clojure.core.reducers.CollFold) __r4408).coll_fold(((java.lang.Object)this.n1), ((java.lang.Object)this.combinef2), ((java.lang.Object)this.reducef3)));
   }
   return ((IFn)this.combinef2).invoke(__r4408, ((IFn)const__3.getRawRoot()).invoke(rt1));
  }
 }
}
