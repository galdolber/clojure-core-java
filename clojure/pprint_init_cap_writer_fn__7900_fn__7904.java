package clojure;

import clojure.lang.*;

public final class pprint_init_cap_writer_fn__7900_fn__7904 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
 }
 Object capped2;
 public pprint_init_cap_writer_fn__7900_fn__7904(final Object capped2) {
  super();
  this.capped2 = capped2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.capped2, Boolean.TRUE);
 }
}
