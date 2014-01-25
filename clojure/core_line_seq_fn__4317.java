package clojure;

import clojure.lang.*;

public final class core_line_seq_fn__4317 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "line-seq");
 }
 Object rdr1;
 public core_line_seq_fn__4317(final Object rdr1) {
  super();
  this.rdr1 = rdr1;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.rdr1);
 }
}
