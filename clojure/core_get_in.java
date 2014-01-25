package clojure;

import clojure.lang.*;

public final class core_get_in extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_get_in() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object ks2, java.lang.Object not_found3) {
  {
   Object sentinel4 = new java.lang.Object();
   Object m5 = m1;
   Object ks6 = ((IFn)const__2.getRawRoot()).invoke(ks2);
   while(true) {
    Object __r3234 = ks6;
    if (__r3234 != null && !(__r3234 == Boolean.FALSE)) {
     {
      Object m7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)m5), ((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(ks6)), ((java.lang.Object)sentinel4)));
      if (clojure.lang.Util.identical(((java.lang.Object)sentinel4), ((java.lang.Object)m7))) {
       return not_found3;
      } else {
       java.lang.Object m5___aux = m7;
       java.lang.Object ks6___aux = ((IFn)const__5.getRawRoot()).invoke(ks6);
       m5 = m5___aux;
       ks6 = ks6___aux;
       continue;
      }
     }
    } else {
     return m5;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object ks2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), m1, ks2);
 }
}
