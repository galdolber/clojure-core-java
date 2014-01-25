package clojure;

import clojure.lang.*;

public final class core_expand_method_impl_cache extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "partition");
  const__6 = (java.lang.Object)2L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "maybe-min-hash");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "hash");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__11 = (java.lang.Object)0L;
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__14 = (java.lang.Object)java.lang.Object.class;
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_expand_method_impl_cache() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object cache1, java.lang.Object c2, java.lang.Object f3) {
  Object __r3741 = ((java.util.Map)((clojure.lang.MethodImplCache)cache1).map);
  if (__r3741 != null && !(__r3741 == Boolean.FALSE)) {
   {
    Object cs4 = ((IFn)const__0.getRawRoot()).invoke(((java.util.Map)((clojure.lang.MethodImplCache)cache1).map), c2, new clojure.lang.MethodImplCache.Entry((java.lang.Class)((java.lang.Class)c2), (clojure.lang.IFn)((clojure.lang.IFn)f3)));
    return new clojure.lang.MethodImplCache((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.MethodImplCache)cache1).protocol)), (clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.MethodImplCache)cache1).methodk)), (java.util.Map)((java.util.Map)cs4));
   }
  } else {
   {
    Object cs5 = ((IFn)const__1.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__2.getRawRoot()).invoke(new clojure.core_expand_method_impl_cache_fn__5890(), ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(const__6, ((java.lang.Object[])((clojure.lang.MethodImplCache)cache1).table)))));
    Object cs6 = ((IFn)const__0.getRawRoot()).invoke(cs5, c2, new clojure.lang.MethodImplCache.Entry((java.lang.Class)((java.lang.Class)c2), (clojure.lang.IFn)((clojure.lang.IFn)f3)));
    {
     Object temp__4115__auto__7 = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__8.getRawRoot(), ((IFn)const__9.getRawRoot()).invoke(cs6)));
     Object __r3743 = temp__4115__auto__7;
     if (__r3743 != null && !(__r3743 == Boolean.FALSE)) {
      {
       Object vec__58938 = temp__4115__auto__7;
       Object shift9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58938), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object mask10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58938), (int)RT.intCast(1L), ((java.lang.Object)null)));
       {
        Object table11 = ((IFn)const__13.getRawRoot()).invoke(const__14, ((java.lang.Number)clojure.lang.Numbers.multiply((long)2L, ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)mask10)))))));
        Object table12 = ((IFn)const__17.getRawRoot()).invoke(new clojure.core_expand_method_impl_cache_fn__5895(shift9, mask10), table11, cs6);
        return new clojure.lang.MethodImplCache((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.MethodImplCache)cache1).protocol)), (clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.MethodImplCache)cache1).methodk)), (int)RT.intCast(shift9), (int)RT.intCast(mask10), (java.lang.Object[])((java.lang.Object[])table12));
       }
      }
     } else {
      return new clojure.lang.MethodImplCache((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((clojure.lang.MethodImplCache)cache1).protocol)), (clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.Keyword)((clojure.lang.MethodImplCache)cache1).methodk)), (java.util.Map)((java.util.Map)cs6));
     }
    }
   }
  }
 }
}
