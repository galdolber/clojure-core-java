package clojure;

import clojure.lang.*;

public final class core_prependss extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
 }
 public core_prependss() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object coll2) {
  Object __r3140 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r3140 != null && !(__r3140 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(x1, coll2);
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(x1, coll2);
  }
 }
}
