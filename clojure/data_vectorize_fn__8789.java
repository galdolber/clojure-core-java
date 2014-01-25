package clojure;

import clojure.lang.*;

public final class data_vectorize_fn__8789 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public data_vectorize_fn__8789() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object result1, java.lang.Object p__87882) {
  {
   Object vec__87903 = p__87882;
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87903), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87903), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(result1, k4, v5);
  }
 }
}
