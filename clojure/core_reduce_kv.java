package clojure;

import clojure.lang.*;

public final class core_reduce_kv extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.protocols", "kv-reduce");
 }
 public core_reduce_kv() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object init2, java.lang.Object coll3) {
  Object __r4079 = coll3;
  if (!(__r4079 instanceof clojure.core.protocols.IKVReduce)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4079, f1, init2);
  } else {
   return ((clojure.core.protocols.IKVReduce) __r4079).kv_reduce(((java.lang.Object)f1), ((java.lang.Object)init2));
  }
 }
}
