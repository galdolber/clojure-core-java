package clojure;

import clojure.lang.*;

public final class pprint_process_clause extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
 }
 public pprint_process_clause() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bracket_info1, java.lang.Object offset2, java.lang.Object remainder3) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.pprint_process_clause_fn__8177(bracket_info1, offset2), remainder3);
 }
}
