package clojure;

import clojure.lang.*;

public final class core_merge_hash_collisions_fn__5139 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "update-in");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "fnil");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object tests3;
 Object thens4;
 public core_merge_hash_collisions_fn__5139(final Object tests3, final Object thens4) {
  super();
  this.tests3 = tests3;
  this.thens4 = thens4;
 }
 public java.lang.Object invoke() {
  {
   Object m1 = clojure.lang.PersistentArrayMap.EMPTY;
   Object ks2 = this.tests3;
   Object vs3 = this.thens4;
   while(true) {
    Object __r3291 = null;
    {
     Object and__3966__auto__4 = ks2;
     Object __r3292;
     Object __r3293 = and__3966__auto__4;
     if (__r3293 != null && !(__r3293 == Boolean.FALSE)) {
      __r3292 = vs3;
     } else {
      __r3292 = and__3966__auto__4;
     }
     __r3291 = __r3292;
    }
    Object __r3294 = __r3291;
    if (__r3294 != null && !(__r3294 == Boolean.FALSE)) {
     java.lang.Object m1___aux = ((IFn)const__0.getRawRoot()).invoke(m1, RT.vector(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(ks2))), ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), clojure.lang.PersistentVector.EMPTY), RT.vector(((IFn)const__2.getRawRoot()).invoke(ks2), ((IFn)const__2.getRawRoot()).invoke(vs3)));
     java.lang.Object ks2___aux = ((IFn)const__5.getRawRoot()).invoke(ks2);
     java.lang.Object vs3___aux = ((IFn)const__5.getRawRoot()).invoke(vs3);
     m1 = m1___aux;
     ks2 = ks2___aux;
     vs3 = vs3___aux;
     continue;
    } else {
     return m1;
    }
   }
  }
 }
}
