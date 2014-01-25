package clojure;

import clojure.lang.*;

public final class core_super_chain extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "super-chain");
 }
 public core_super_chain() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  Object __r3745 = c1;
  if (__r3745 != null && !(__r3745 == Boolean.FALSE)) {
   return ((IFn)const__0.getRawRoot()).invoke(c1, ((IFn)const__1.getRawRoot()).invoke(((java.lang.Class)((java.lang.Class)c1).getSuperclass())));
  } else {
   return null;
  }
 }
}
