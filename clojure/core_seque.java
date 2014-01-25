package clojure;

import clojure.lang.*;

public final class core_seque extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seque");
  const__1 = (java.lang.Object)100L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__3 = (java.lang.Object)java.util.concurrent.BlockingQueue.class;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "agent");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "send-off");
 }
 public core_seque() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n_or_q1, java.lang.Object s2) {
  {
   Object __r2952;
   if ((n_or_q1 instanceof java.util.concurrent.BlockingQueue)) {
    __r2952 = n_or_q1;
   } else {
    __r2952 = new java.util.concurrent.LinkedBlockingQueue((int)clojure.lang.RT.intCast(((java.lang.Object)n_or_q1)));
   }
   Object q3 = __r2952;
   Object NIL4 = new java.lang.Object();
   Object agt5 = ((IFn)const__5.getRawRoot()).invoke(new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_seque_fn__4813(s2))));
   Object log_error6 = new clojure.core_seque_log_error__4815();
   Object fill7 = new clojure.core_seque_fill__4817(q3, NIL4, log_error6);
   Object drain8 = new clojure.core_seque_drain__4823(q3, NIL4, agt5, fill7);
   ((IFn)const__6.getRawRoot()).invoke(agt5, fill7);
   return ((IFn)drain8).invoke();
  }
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, s1);
 }
}
