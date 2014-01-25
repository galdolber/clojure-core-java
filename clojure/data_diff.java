package clojure;

import clojure.lang.*;

public final class data_diff extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.data", "equality-partition");
  const__2 = (clojure.lang.Var)RT.var("clojure.data", "diff-similar");
  const__3 = (clojure.lang.Var)RT.var("clojure.data", "atom-diff");
 }
 public data_diff() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  if (clojure.lang.Util.equiv(((java.lang.Object)a1), ((java.lang.Object)b2))) {
   return RT.vector(null, null, a1);
  } else {
   Object __r6401 = a1;
   if (!(__r6401 instanceof clojure.data.EqualityPartition)) {
    __r6401 = ((IFn)const__1.getRawRoot()).invoke(__r6401);
   } else {
    __r6401 = ((java.lang.Object)((clojure.data.EqualityPartition) __r6401).equality_partition());
   }
   Object __r6402 = b2;
   if (!(__r6402 instanceof clojure.data.EqualityPartition)) {
    __r6402 = ((IFn)const__1.getRawRoot()).invoke(__r6402);
   } else {
    __r6402 = ((java.lang.Object)((clojure.data.EqualityPartition) __r6402).equality_partition());
   }
   if (clojure.lang.Util.equiv(((java.lang.Object)__r6401), ((java.lang.Object)__r6402))) {
    Object __r6403 = a1;
    if (!(__r6403 instanceof clojure.data.Diff)) {
     return ((IFn)const__2.getRawRoot()).invoke(__r6403, b2);
    } else {
     return ((clojure.data.Diff) __r6403).diff_similar(((java.lang.Object)b2));
    }
   } else {
    return ((IFn)const__3.getRawRoot()).invoke(a1, b2);
   }
  }
 }
}
