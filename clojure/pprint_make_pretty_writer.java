package clojure;

import clojure.lang.*;

public final class pprint_make_pretty_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-writer");
 }
 public pprint_make_pretty_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object base_writer1, java.lang.Object right_margin2, java.lang.Object miser_width3) {
  return ((IFn)const__0.getRawRoot()).invoke(base_writer1, right_margin2, miser_width3);
 }
}
