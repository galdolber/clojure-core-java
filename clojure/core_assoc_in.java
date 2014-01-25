package clojure;

import clojure.lang.*;

public final class core_assoc_in extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "assoc-in");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 public core_assoc_in() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object p__50482, java.lang.Object v3) {
  {
   Object vec__50494 = p__50482;
   Object k5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50494), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object ks6 = ((IFn)const__2.getRawRoot()).invoke(vec__50494, const__3);
   Object __r3237 = ks6;
   if (__r3237 != null && !(__r3237 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(m1, k5, ((IFn)const__5.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m1), ((java.lang.Object)k5))), ks6, v3));
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(m1, k5, v3);
   }
  }
 }
}
