package clojure;

import clojure.lang.*;

public final class core_prep_hashes extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.IPersistentStack const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Var const__18;
 public static final java.lang.Object const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "==");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "fits-table?");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "case-map");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "compact");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "maybe-min-hash");
  const__11 = (clojure.lang.IPersistentStack)RT.vector(0L, 0L);
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__13 = (java.lang.Object)1L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "sparse");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "merge-hash-collisions");
  const__17 = (java.lang.Object)2L;
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "prep-hashes");
  const__19 = (java.lang.Object)3L;
 }
 public core_prep_hashes() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object expr_sym1, java.lang.Object default2, java.lang.Object tests3, java.lang.Object thens4) {
  {
   Object hashes5 = ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentHashSet.EMPTY, ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), tests3));
   if (clojure.lang.Numbers.equiv((long)clojure.lang.RT.count(((java.lang.Object)tests3)), (long)clojure.lang.RT.count(((java.lang.Object)hashes5)))) {
    Object __r3298 = ((IFn)const__5.getRawRoot()).invoke(hashes5);
    if (__r3298 != null && !(__r3298 == Boolean.FALSE)) {
     return RT.vector(const__6, const__6, ((IFn)const__7.getRawRoot()).invoke(const__2.getRawRoot(), const__8.getRawRoot(), tests3, thens4), const__9);
    } else {
     {
      Object __r3299 = null;
      {
       Object or__3968__auto__6 = ((IFn)const__10.getRawRoot()).invoke(hashes5);
       Object __r3300;
       Object __r3301 = or__3968__auto__6;
       if (__r3301 != null && !(__r3301 == Boolean.FALSE)) {
        __r3300 = or__3968__auto__6;
       } else {
        __r3300 = const__11;
       }
       __r3299 = __r3300;
      }
      Object vec__51537 = __r3299;
      Object shift8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51537), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object mask9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51537), (int)RT.intCast(1L), ((java.lang.Object)null)));
      if (clojure.lang.Numbers.isZero(((java.lang.Object)mask9))) {
       return RT.vector(const__6, const__6, ((IFn)const__7.getRawRoot()).invoke(const__2.getRawRoot(), const__8.getRawRoot(), tests3, thens4), const__15);
      } else {
       return RT.vector(shift8, mask9, ((IFn)const__7.getRawRoot()).invoke(new clojure.core_prep_hashes_fn__5154(mask9, shift8), const__8.getRawRoot(), tests3, thens4), const__9);
      }
     }
    }
   } else {
    {
     Object vec__515610 = ((IFn)const__16.getRawRoot()).invoke(expr_sym1, default2, tests3, thens4);
     Object tests11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515610), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object thens12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515610), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object skip_check13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515610), (int)RT.intCast(2L), ((java.lang.Object)null)));
     Object vec__515714 = ((IFn)const__18.getRawRoot()).invoke(expr_sym1, default2, tests11, thens12);
     Object shift15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515714), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object mask16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515714), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object case_map17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515714), (int)RT.intCast(2L), ((java.lang.Object)null)));
     Object switch_type18 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__515714), (int)RT.intCast(3L), ((java.lang.Object)null)));
     Object __r3303;
     if (clojure.lang.Numbers.isZero(((java.lang.Object)mask16))) {
      __r3303 = skip_check13;
     } else {
      __r3303 = ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentHashSet.EMPTY, ((IFn)const__1.getRawRoot()).invoke(new clojure.core_prep_hashes_fn__5158(mask16, shift15), skip_check13));
     }
     Object skip_check19 = __r3303;
     return RT.vector(shift15, mask16, case_map17, switch_type18, skip_check19);
    }
   }
  }
 }
}
