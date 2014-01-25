package clojure;

import clojure.lang.*;

public final class core_disj extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_disj() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object set1, java.lang.Object key2, java.lang.Object ks3) {
  while(true) {
   Object __r2379 = set1;
   if (__r2379 != null && !(__r2379 == Boolean.FALSE)) {
    {
     Object ret4 = ((IFn)const__0.getRawRoot()).invoke(set1, key2);
     Object __r2381 = ks3;
     if (__r2381 != null && !(__r2381 == Boolean.FALSE)) {
      java.lang.Object set1___aux = ret4;
      java.lang.Object key2___aux = ((IFn)const__1.getRawRoot()).invoke(ks3);
      java.lang.Object ks3___aux = ((IFn)const__2.getRawRoot()).invoke(ks3);
      set1 = set1___aux;
      key2 = key2___aux;
      ks3 = ks3___aux;
      continue;
     } else {
      return ret4;
     }
    }
   } else {
    return null;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object set1, java.lang.Object key2) {
  Object __r2383 = set1;
  if (__r2383 != null && !(__r2383 == Boolean.FALSE)) {
   return ((clojure.lang.IPersistentSet)((clojure.lang.IPersistentSet)set1).disjoin(((java.lang.Object)key2)));
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object set1) {
  return set1;
 }
 public int getRequiredArity() {
  return 2;
 }
}
