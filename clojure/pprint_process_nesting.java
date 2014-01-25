package clojure;

import clojure.lang.*;

public final class pprint_process_nesting extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_process_nesting() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object format1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_process_nesting_fn__8188(), format1));
 }
}
