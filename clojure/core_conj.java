package clojure;

import clojure.lang.*;

public final class core_conj extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_conj() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object coll1, java.lang.Object x2, java.lang.Object xs3) {
  while(true) {
   Object __r2236 = xs3;
   if (__r2236 != null && !(__r2236 == Boolean.FALSE)) {
    java.lang.Object coll1___aux = ((IFn)this).invoke(coll1, x2);
    java.lang.Object x2___aux = ((IFn)const__0.getRawRoot()).invoke(xs3);
    java.lang.Object xs3___aux = ((IFn)const__1.getRawRoot()).invoke(xs3);
    coll1 = coll1___aux;
    x2 = x2___aux;
    xs3 = xs3___aux;
    continue;
   } else {
    return ((IFn)this).invoke(coll1, x2);
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object x2) {
  return ((clojure.lang.IPersistentCollection)clojure.lang.RT.conj((clojure.lang.IPersistentCollection)((clojure.lang.IPersistentCollection)coll1), ((java.lang.Object)x2)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
