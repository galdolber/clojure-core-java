package clojure;

import clojure.lang.*;

public final class core_disj_BANG_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_disj_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object set1, java.lang.Object key2, java.lang.Object ks3) {
  while(true) {
   {
    Object ret4 = ((clojure.lang.ITransientSet)((clojure.lang.ITransientSet)set1).disjoin(((java.lang.Object)key2)));
    Object __r2626 = ks3;
    if (__r2626 != null && !(__r2626 == Boolean.FALSE)) {
     java.lang.Object set1___aux = ret4;
     java.lang.Object key2___aux = ((IFn)const__0.getRawRoot()).invoke(ks3);
     java.lang.Object ks3___aux = ((IFn)const__1.getRawRoot()).invoke(ks3);
     set1 = set1___aux;
     key2 = key2___aux;
     ks3 = ks3___aux;
     continue;
    } else {
     return ret4;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object set1, java.lang.Object key2) {
  return ((clojure.lang.ITransientSet)((clojure.lang.ITransientSet)set1).disjoin(((java.lang.Object)key2)));
 }
 public java.lang.Object invoke(java.lang.Object set1) {
  return set1;
 }
 public int getRequiredArity() {
  return 2;
 }
}
