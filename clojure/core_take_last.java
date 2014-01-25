package clojure;

import clojure.lang.*;

public final class core_take_last extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_take_last() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  {
   Object s3 = ((IFn)const__0.getRawRoot()).invoke(coll2);
   Object lead4 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(n1, coll2));
   while(true) {
    Object __r2514 = lead4;
    if (__r2514 != null && !(__r2514 == Boolean.FALSE)) {
     java.lang.Object s3___aux = ((IFn)const__2.getRawRoot()).invoke(s3);
     java.lang.Object lead4___aux = ((IFn)const__2.getRawRoot()).invoke(lead4);
     s3 = s3___aux;
     lead4 = lead4___aux;
     continue;
    } else {
     return s3;
    }
   }
  }
 }
}
