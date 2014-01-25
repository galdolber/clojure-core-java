package clojure;

import clojure.lang.*;

public final class core_merge_hash_collisions_fn__5145 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "==");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "ffirst");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 Object assoc_multi6;
 public core_merge_hash_collisions_fn__5145(final Object assoc_multi6) {
  super();
  this.assoc_multi6 = assoc_multi6;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object p__51442) {
  {
   Object vec__51463 = p__51442;
   Object h4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51463), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object bucket5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51463), (int)RT.intCast(1L), ((java.lang.Object)null)));
   if (clojure.lang.Numbers.equiv((long)1L, (long)clojure.lang.RT.count(((java.lang.Object)bucket5)))) {
    return ((IFn)const__5.getRawRoot()).invoke(m1, ((IFn)const__6.getRawRoot()).invoke(bucket5), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(bucket5)));
   } else {
    return ((IFn)this.assoc_multi6).invoke(m1, h4, bucket5);
   }
  }
 }
}
