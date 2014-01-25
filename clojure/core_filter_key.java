package clojure;

import clojure.lang.*;

public final class core_filter_key extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_filter_key() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object keyfn1, java.lang.Object pred2, java.lang.Object amap3) {
  {
   Object ret4 = clojure.lang.PersistentArrayMap.EMPTY;
   Object es5 = ((IFn)const__0.getRawRoot()).invoke(amap3);
   while(true) {
    Object __r2721 = es5;
    if (__r2721 != null && !(__r2721 == Boolean.FALSE)) {
     Object __r2723 = ((IFn)pred2).invoke(((IFn)keyfn1).invoke(((IFn)const__1.getRawRoot()).invoke(es5)));
     if (__r2723 != null && !(__r2723 == Boolean.FALSE)) {
      java.lang.Object ret4___aux = ((IFn)const__2.getRawRoot()).invoke(ret4, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(es5)), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(es5)));
      java.lang.Object es5___aux = ((IFn)const__5.getRawRoot()).invoke(es5);
      ret4 = ret4___aux;
      es5 = es5___aux;
      continue;
     } else {
      java.lang.Object es5___aux = ((IFn)const__5.getRawRoot()).invoke(es5);
      es5 = es5___aux;
      continue;
     }
    } else {
     return ret4;
    }
   }
  }
 }
}
