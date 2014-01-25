package clojure;

import clojure.lang.*;

public final class core_assoc_BANG_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
 }
 public core_assoc_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object coll1, java.lang.Object key2, java.lang.Object val3, java.lang.Object kvs4) {
  while(true) {
   {
    Object ret5 = ((clojure.lang.ITransientAssociative)((clojure.lang.ITransientAssociative)coll1).assoc(((java.lang.Object)key2), ((java.lang.Object)val3)));
    Object __r2622 = kvs4;
    if (__r2622 != null && !(__r2622 == Boolean.FALSE)) {
     java.lang.Object coll1___aux = ret5;
     java.lang.Object key2___aux = ((IFn)const__0.getRawRoot()).invoke(kvs4);
     java.lang.Object val3___aux = ((IFn)const__1.getRawRoot()).invoke(kvs4);
     java.lang.Object kvs4___aux = ((IFn)const__2.getRawRoot()).invoke(kvs4);
     coll1 = coll1___aux;
     key2 = key2___aux;
     val3 = val3___aux;
     kvs4 = kvs4___aux;
     continue;
    } else {
     return ret5;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object key2, java.lang.Object val3) {
  return ((clojure.lang.ITransientAssociative)((clojure.lang.ITransientAssociative)coll1).assoc(((java.lang.Object)key2), ((java.lang.Object)val3)));
 }
 public int getRequiredArity() {
  return 3;
 }
}
