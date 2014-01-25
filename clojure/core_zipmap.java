package clojure;

import clojure.lang.*;

public final class core_zipmap extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_zipmap() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object keys1, java.lang.Object vals2) {
  {
   Object map3 = clojure.lang.PersistentArrayMap.EMPTY;
   Object ks4 = ((IFn)const__0.getRawRoot()).invoke(keys1);
   Object vs5 = ((IFn)const__0.getRawRoot()).invoke(vals2);
   while(true) {
    Object __r2546 = null;
    {
     Object and__3966__auto__6 = ks4;
     Object __r2547;
     Object __r2548 = and__3966__auto__6;
     if (__r2548 != null && !(__r2548 == Boolean.FALSE)) {
      __r2547 = vs5;
     } else {
      __r2547 = and__3966__auto__6;
     }
     __r2546 = __r2547;
    }
    Object __r2549 = __r2546;
    if (__r2549 != null && !(__r2549 == Boolean.FALSE)) {
     java.lang.Object map3___aux = ((IFn)const__1.getRawRoot()).invoke(map3, ((IFn)const__2.getRawRoot()).invoke(ks4), ((IFn)const__2.getRawRoot()).invoke(vs5));
     java.lang.Object ks4___aux = ((IFn)const__3.getRawRoot()).invoke(ks4);
     java.lang.Object vs5___aux = ((IFn)const__3.getRawRoot()).invoke(vs5);
     map3 = map3___aux;
     ks4 = ks4___aux;
     vs5 = vs5___aux;
     continue;
    } else {
     return map3;
    }
   }
  }
 }
}
