package clojure;

import clojure.lang.*;

public final class core_assoc extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
 }
 public core_assoc() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object map1, java.lang.Object key2, java.lang.Object val3, java.lang.Object kvs4) {
  while(true) {
   {
    Object ret5 = ((IFn)this).invoke(map1, key2, val3);
    Object __r2238 = kvs4;
    if (__r2238 != null && !(__r2238 == Boolean.FALSE)) {
     Object __r2240 = ((IFn)const__0.getRawRoot()).invoke(kvs4);
     if (__r2240 != null && !(__r2240 == Boolean.FALSE)) {
      java.lang.Object map1___aux = ret5;
      java.lang.Object key2___aux = ((IFn)const__1.getRawRoot()).invoke(kvs4);
      java.lang.Object val3___aux = ((IFn)const__2.getRawRoot()).invoke(kvs4);
      java.lang.Object kvs4___aux = ((IFn)const__3.getRawRoot()).invoke(kvs4);
      map1 = map1___aux;
      key2 = key2___aux;
      val3 = val3___aux;
      kvs4 = kvs4___aux;
      continue;
     } else {
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"assoc expects even number of arguments after map/vector, found odd number")));
      return null;
     }
    } else {
     return ret5;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object key2, java.lang.Object val3) {
  return ((clojure.lang.Associative)clojure.lang.RT.assoc(((java.lang.Object)map1), ((java.lang.Object)key2), ((java.lang.Object)val3)));
 }
 public int getRequiredArity() {
  return 3;
 }
}
