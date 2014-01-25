package clojure;

import clojure.lang.*;

public final class core_butlast extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_butlast() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object ret2 = clojure.lang.PersistentVector.EMPTY;
   Object s3 = s1;
   while(true) {
    Object __r2256 = ((IFn)const__0.getRawRoot()).invoke(s3);
    if (__r2256 != null && !(__r2256 == Boolean.FALSE)) {
     java.lang.Object ret2___aux = ((IFn)const__1.getRawRoot()).invoke(ret2, ((IFn)const__2.getRawRoot()).invoke(s3));
     java.lang.Object s3___aux = ((IFn)const__0.getRawRoot()).invoke(s3);
     ret2 = ret2___aux;
     s3 = s3___aux;
     continue;
    } else {
     return ((IFn)const__3.getRawRoot()).invoke(ret2);
    }
   }
  }
 }
}
