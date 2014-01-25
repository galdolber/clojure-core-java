package clojure;

import clojure.lang.*;

public final class test_get_possibly_unbound_var extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
 }
 public test_get_possibly_unbound_var() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  try {
   return ((IFn)const__0.getRawRoot()).invoke(v1);
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.IllegalStateException) {
    java.lang.IllegalStateException e4 = (java.lang.IllegalStateException) ex___;
    return null;
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
