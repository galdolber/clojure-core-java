package clojure.core;

import clojure.lang.*;

public final class reducers_reduce extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "reduce");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__2 = (java.lang.Object)java.util.Map.class;
  const__3 = (clojure.lang.Var)RT.var("clojure.core.protocols", "kv-reduce");
  const__4 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
 }
 public reducers_reduce() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object init2, java.lang.Object coll3) {
  if ((coll3 instanceof java.util.Map)) {
   Object __r4371 = coll3;
   if (!(__r4371 instanceof clojure.core.protocols.IKVReduce)) {
    return ((IFn)const__3.getRawRoot()).invoke(__r4371, f1, init2);
   } else {
    return ((clojure.core.protocols.IKVReduce) __r4371).kv_reduce(((java.lang.Object)f1), ((java.lang.Object)init2));
   }
  } else {
   Object __r4372 = coll3;
   if (!(__r4372 instanceof clojure.core.protocols.CollReduce)) {
    return ((IFn)const__4.getRawRoot()).invoke(__r4372, f1, init2);
   } else {
    return ((clojure.core.protocols.CollReduce) __r4372).coll_reduce(((java.lang.Object)f1), ((java.lang.Object)init2));
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(f1, ((IFn)f1).invoke(), coll2);
 }
}
