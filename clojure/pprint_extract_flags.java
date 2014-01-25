package clojure;

import clojure.lang.*;

public final class pprint_extract_flags extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_extract_flags() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object offset2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.pprint_extract_flags_fn__8121(), RT.vector(s1, offset2, clojure.lang.PersistentArrayMap.EMPTY));
 }
}
