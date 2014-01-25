package clojure.java;

import clojure.lang.*;

public final class io_fn__8706_fn__8707 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "type");
 }
 public io_fn__8706_fn__8707() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(input1), ((IFn)const__0.getRawRoot()).invoke(output2));
 }
}
