package clojure;

import clojure.lang.*;

public final class core_last extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_last() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  while(true) {
   Object __r2254 = ((IFn)const__0.getRawRoot()).invoke(s1);
   if (__r2254 != null && !(__r2254 == Boolean.FALSE)) {
    java.lang.Object s1___aux = ((IFn)const__0.getRawRoot()).invoke(s1);
    s1 = s1___aux;
    continue;
   } else {
    return ((IFn)const__1.getRawRoot()).invoke(s1);
   }
  }
 }
}
