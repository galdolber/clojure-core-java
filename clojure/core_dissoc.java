package clojure;

import clojure.lang.*;

public final class core_dissoc extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_dissoc() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object map1, java.lang.Object key2, java.lang.Object ks3) {
  while(true) {
   {
    Object ret4 = ((IFn)const__0.getRawRoot()).invoke(map1, key2);
    Object __r2377 = ks3;
    if (__r2377 != null && !(__r2377 == Boolean.FALSE)) {
     java.lang.Object map1___aux = ret4;
     java.lang.Object key2___aux = ((IFn)const__1.getRawRoot()).invoke(ks3);
     java.lang.Object ks3___aux = ((IFn)const__2.getRawRoot()).invoke(ks3);
     map1 = map1___aux;
     key2 = key2___aux;
     ks3 = ks3___aux;
     continue;
    } else {
     return ret4;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object key2) {
  return ((java.lang.Object)clojure.lang.RT.dissoc(((java.lang.Object)map1), ((java.lang.Object)key2)));
 }
 public java.lang.Object invoke(java.lang.Object map1) {
  return map1;
 }
 public int getRequiredArity() {
  return 2;
 }
}
