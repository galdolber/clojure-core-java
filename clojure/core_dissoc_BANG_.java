package clojure;

import clojure.lang.*;

public final class core_dissoc_BANG_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_dissoc_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object map1, java.lang.Object key2, java.lang.Object ks3) {
  while(true) {
   {
    Object ret4 = ((clojure.lang.ITransientMap)((clojure.lang.ITransientMap)map1).without(((java.lang.Object)key2)));
    Object __r2624 = ks3;
    if (__r2624 != null && !(__r2624 == Boolean.FALSE)) {
     java.lang.Object map1___aux = ret4;
     java.lang.Object key2___aux = ((IFn)const__0.getRawRoot()).invoke(ks3);
     java.lang.Object ks3___aux = ((IFn)const__1.getRawRoot()).invoke(ks3);
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
  return ((clojure.lang.ITransientMap)((clojure.lang.ITransientMap)map1).without(((java.lang.Object)key2)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
