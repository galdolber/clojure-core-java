package clojure.core.reducers;

import clojure.lang.*;

public final class Cat extends java.lang.Object implements clojure.core.reducers.CollFold, clojure.lang.Counted, clojure.lang.Seqable, clojure.core.protocols.CollReduce, clojure.lang.IType {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "fjinvoke");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public  final Object cnt;
 public  final Object left;
 public  final Object right;
 public Cat(final Object cnt, final Object left, final Object right) {
  super();
  this.cnt = cnt;
  this.left = left;
  this.right = right;
 }
 public static clojure.lang.IPersistentVector getBasis() {
  return RT.vector(Symbol.intern(null, "cnt"), Symbol.intern(null, "left"), Symbol.intern(null, "right"));
 }
 public int count()  {
  return RT.intCast(this.cnt);
 }
 public clojure.lang.ISeq seq()  {
  return (clojure.lang.ISeq)((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.left), ((IFn)const__3.getRawRoot()).invoke(this.right));
 }
 public java.lang.Object coll_reduce(java.lang.Object f11, java.lang.Object init2)  {
  Object __r4409 = this.right;
  if (!(__r4409 instanceof clojure.core.protocols.CollReduce)) {
   Object __r4410 = this.left;
   if (!(__r4410 instanceof clojure.core.protocols.CollReduce)) {
    __r4410 = ((IFn)const__1.getRawRoot()).invoke(__r4410, f11, init2);
   } else {
    __r4410 = ((java.lang.Object)((clojure.core.protocols.CollReduce) __r4410).coll_reduce(((java.lang.Object)f11), ((java.lang.Object)init2)));
   }
   return ((IFn)const__1.getRawRoot()).invoke(__r4409, f11, __r4410);
  } else {
   Object __r4411 = this.left;
   if (!(__r4411 instanceof clojure.core.protocols.CollReduce)) {
    __r4411 = ((IFn)const__1.getRawRoot()).invoke(__r4411, f11, init2);
   } else {
    __r4411 = ((java.lang.Object)((clojure.core.protocols.CollReduce) __r4411).coll_reduce(((java.lang.Object)f11), ((java.lang.Object)init2)));
   }
   return ((clojure.core.protocols.CollReduce) __r4409).coll_reduce(((java.lang.Object)f11), ((java.lang.Object)__r4411));
  }
 }
 public java.lang.Object coll_reduce(java.lang.Object f11)  {
  Object __r4412 = this;
  if (!(__r4412 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__1.getRawRoot()).invoke(__r4412, f11, ((IFn)f11).invoke());
  } else {
   return ((clojure.core.protocols.CollReduce) __r4412).coll_reduce(((java.lang.Object)f11), ((java.lang.Object)((IFn)f11).invoke()));
  }
 }
 public java.lang.Object coll_fold(java.lang.Object n1, java.lang.Object combinef2, java.lang.Object reducef3)  {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core.reducers.Cat_fn__6732(n1, combinef2, this.right, this.left, reducef3));
 }
}
