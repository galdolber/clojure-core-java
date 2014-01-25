package clojure;

import clojure.lang.*;

public final class pprint_extract_params extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "extract-param");
 }
 public pprint_extract_params() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object offset2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), RT.vector(s1, offset2, Boolean.FALSE));
 }
}
