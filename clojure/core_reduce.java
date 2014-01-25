package clojure;

import clojure.lang.*;

public final class core_reduce extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.protocols", "coll-reduce");
 }
 public core_reduce() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object val2, java.lang.Object coll3) {
  Object __r4077 = coll3;
  if (!(__r4077 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4077, f1, val2);
  } else {
   return ((clojure.core.protocols.CollReduce) __r4077).coll_reduce(((java.lang.Object)f1), ((java.lang.Object)val2));
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  Object __r4078 = coll2;
  if (!(__r4078 instanceof clojure.core.protocols.CollReduce)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r4078, f1);
  } else {
   return ((clojure.core.protocols.CollReduce) __r4078).coll_reduce(((java.lang.Object)f1));
  }
 }
}
