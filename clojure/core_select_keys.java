package clojure;

import clojure.lang.*;

public final class core_select_keys extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_select_keys() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object keyseq2) {
  {
   Object ret3 = clojure.lang.PersistentArrayMap.EMPTY;
   Object keys4 = ((IFn)const__0.getRawRoot()).invoke(keyseq2);
   while(true) {
    Object __r2385 = keys4;
    if (__r2385 != null && !(__r2385 == Boolean.FALSE)) {
     {
      Object entry5 = ((java.lang.Object)clojure.lang.RT.find(((java.lang.Object)map1), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(keys4))));
      Object __r2386;
      Object __r2387 = entry5;
      if (__r2387 != null && !(__r2387 == Boolean.FALSE)) {
       __r2386 = ((IFn)const__2.getRawRoot()).invoke(ret3, entry5);
      } else {
       __r2386 = ret3;
      }
      java.lang.Object ret3___aux = __r2386;
      java.lang.Object keys4___aux = ((IFn)const__3.getRawRoot()).invoke(keys4);
      ret3 = ret3___aux;
      keys4 = keys4___aux;
      continue;
     }
    } else {
     return ((IFn)const__4.getRawRoot()).invoke(ret3, ((IFn)const__5.getRawRoot()).invoke(map1));
    }
   }
  }
 }
}
