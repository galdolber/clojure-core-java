package clojure.core;

import clojure.lang.*;

public final class reducers_reducer_reify__6661 extends java.lang.Object implements clojure.core.protocols.CollReduce, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
 }
 final clojure.lang.IPersistentMap __meta;
 Object coll1;
 Object xf2;
 public reducers_reducer_reify__6661(final clojure.lang.IPersistentMap __meta, final Object coll1, final Object xf2) {
  super();
  this.__meta = __meta;
  this.coll1 = coll1;
  this.xf2 = xf2;
 }
 public reducers_reducer_reify__6661(java.lang.Object __r4377, java.lang.Object __r4378) {
  this(null, __r4377, __r4378);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new reducers_reducer_reify__6661(__meta, (Object)coll1, (Object)xf2);
 }
 public java.lang.Object coll_reduce(java.lang.Object f11, java.lang.Object init2)  {
  Object __r4379 = this.coll1;
  if (!(__r4379 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4379, ((IFn)this.xf2).invoke(f11), init2);
  } else {
   return ((clojure.core.protocols.CollReduce) __r4379).coll_reduce(((java.lang.Object)((IFn)this.xf2).invoke(f11)), ((java.lang.Object)init2));
  }
 }
 public java.lang.Object coll_reduce(java.lang.Object f11)  {
  Object __r4380 = this;
  if (!(__r4380 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4380, f11, ((IFn)f11).invoke());
  } else {
   return ((clojure.core.protocols.CollReduce) __r4380).coll_reduce(((java.lang.Object)f11), ((java.lang.Object)((IFn)f11).invoke()));
  }
 }
}
