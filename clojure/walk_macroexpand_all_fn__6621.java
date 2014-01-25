package clojure;

import clojure.lang.*;

public final class walk_macroexpand_all_fn__6621 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "macroexpand");
 }
 public walk_macroexpand_all_fn__6621() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r4365 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r4365 != null && !(__r4365 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(x1);
  } else {
   return x1;
  }
 }
}
