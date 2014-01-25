package clojure;

import clojure.lang.*;

public final class core_prep_ints extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.IPersistentStack const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "fits-table?");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "case-map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "compact");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "maybe-min-hash");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.IPersistentStack)RT.vector(0L, 0L);
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__9 = (java.lang.Object)1L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "sparse");
 }
 public core_prep_ints() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tests1, java.lang.Object thens2) {
  Object __r3285 = ((IFn)const__0.getRawRoot()).invoke(tests1);
  if (__r3285 != null && !(__r3285 == Boolean.FALSE)) {
   return RT.vector(const__1, const__1, ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), const__3.getRawRoot(), tests1, thens2), const__4);
  } else {
   {
    Object __r3286 = null;
    {
     Object or__3968__auto__3 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__3.getRawRoot(), tests1));
     Object __r3287;
     Object __r3288 = or__3968__auto__3;
     if (__r3288 != null && !(__r3288 == Boolean.FALSE)) {
      __r3287 = or__3968__auto__3;
     } else {
      __r3287 = const__7;
     }
     __r3286 = __r3287;
    }
    Object vec__51334 = __r3286;
    Object shift5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51334), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object mask6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51334), (int)RT.intCast(1L), ((java.lang.Object)null)));
    if (clojure.lang.Numbers.isZero(((java.lang.Object)mask6))) {
     return RT.vector(const__1, const__1, ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), const__3.getRawRoot(), tests1, thens2), const__11);
    } else {
     return RT.vector(shift5, mask6, ((IFn)const__2.getRawRoot()).invoke(new clojure.core_prep_ints_fn__5134(shift5, mask6), const__3.getRawRoot(), tests1, thens2), const__4);
    }
   }
  }
 }
}
