package clojure.java;

import clojure.lang.*;

public final class io_fn__8730 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "do-copy");
 }
 public io_fn__8730() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  return ((IFn)const__0.getRawRoot()).invoke(new java.io.StringReader((java.lang.String)((java.lang.String)input1)), output2, opts3);
 }
}
