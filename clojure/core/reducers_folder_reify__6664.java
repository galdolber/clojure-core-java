package clojure.core;

import clojure.lang.*;

public final class reducers_folder_reify__6664 extends java.lang.Object implements clojure.core.reducers.CollFold, clojure.core.protocols.CollReduce, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "coll-fold");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
 }
 final clojure.lang.IPersistentMap __meta;
 Object xf2;
 Object coll1;
 public reducers_folder_reify__6664(final clojure.lang.IPersistentMap __meta, final Object xf2, final Object coll1) {
  super();
  this.__meta = __meta;
  this.xf2 = xf2;
  this.coll1 = coll1;
 }
 public reducers_folder_reify__6664(java.lang.Object __r4381, java.lang.Object __r4382) {
  this(null, __r4381, __r4382);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new reducers_folder_reify__6664(__meta, (Object)xf2, (Object)coll1);
 }
 public java.lang.Object coll_reduce(java.lang.Object f11, java.lang.Object init2)  {
  Object __r4383 = this.coll1;
  if (!(__r4383 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__1.getRawRoot()).invoke(__r4383, ((IFn)this.xf2).invoke(f11), init2);
  } else {
   return ((clojure.core.protocols.CollReduce) __r4383).coll_reduce(((java.lang.Object)((IFn)this.xf2).invoke(f11)), ((java.lang.Object)init2));
  }
 }
 public java.lang.Object coll_reduce(java.lang.Object f11)  {
  Object __r4384 = this.coll1;
  if (!(__r4384 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__1.getRawRoot()).invoke(__r4384, ((IFn)this.xf2).invoke(f11), ((IFn)f11).invoke());
  } else {
   return ((clojure.core.protocols.CollReduce) __r4384).coll_reduce(((java.lang.Object)((IFn)this.xf2).invoke(f11)), ((java.lang.Object)((IFn)f11).invoke()));
  }
 }
 public java.lang.Object coll_fold(java.lang.Object n1, java.lang.Object combinef2, java.lang.Object reducef3)  {
  Object __r4385 = this.coll1;
  if (!(__r4385 instanceof clojure.core.reducers.CollFold)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4385, n1, combinef2, ((IFn)this.xf2).invoke(reducef3));
  } else {
   return ((clojure.core.reducers.CollFold) __r4385).coll_fold(((java.lang.Object)n1), ((java.lang.Object)combinef2), ((java.lang.Object)((IFn)this.xf2).invoke(reducef3)));
  }
 }
}
