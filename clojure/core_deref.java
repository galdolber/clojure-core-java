package clojure;

import clojure.lang.*;

public final class core_deref extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IDeref.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref-future");
  const__3 = (java.lang.Object)clojure.lang.IBlockingDeref.class;
 }
 public core_deref() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ref1, java.lang.Object timeout_ms2, java.lang.Object timeout_val3) {
  if ((ref1 instanceof clojure.lang.IBlockingDeref)) {
   return ((java.lang.Object)((clojure.lang.IBlockingDeref)ref1).deref((long)RT.longCast(timeout_ms2), ((java.lang.Object)timeout_val3)));
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(ref1, timeout_ms2, timeout_val3);
  }
 }
 public java.lang.Object invoke(java.lang.Object ref1) {
  if ((ref1 instanceof clojure.lang.IDeref)) {
   return ((java.lang.Object)((clojure.lang.IDeref)ref1).deref());
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(ref1);
  }
 }
}
