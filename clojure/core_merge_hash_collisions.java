package clojure;

import clojure.lang.*;

public final class core_merge_hash_collisions extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vals");
 }
 public core_merge_hash_collisions() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object expr_sym1, java.lang.Object default2, java.lang.Object tests3, java.lang.Object thens4) {
  {
   Object buckets5 = ((IFn)new clojure.core_merge_hash_collisions_fn__5139(tests3, thens4)).invoke();
   Object assoc_multi6 = new clojure.core_merge_hash_collisions_assoc_multi__5142(expr_sym1, default2);
   Object hmap7 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_merge_hash_collisions_fn__5145(assoc_multi6), clojure.lang.PersistentArrayMap.EMPTY, buckets5);
   Object skip_check8 = ((IFn)const__1.getRawRoot()).invoke(clojure.lang.PersistentHashSet.EMPTY, ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(new clojure.core_merge_hash_collisions_fn__5148(), buckets5)));
   return RT.vector(((IFn)const__5.getRawRoot()).invoke(hmap7), ((IFn)const__6.getRawRoot()).invoke(hmap7), skip_check8);
  }
 }
}
