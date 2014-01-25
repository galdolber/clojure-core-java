package clojure;

import clojure.lang.*;

public final class test_test_all_vars_fn__7192_fn__7197 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "test-var");
 }
 Object v5;
 public test_test_all_vars_fn__7192_fn__7197(final Object v5) {
  super();
  this.v5 = v5;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.get()).invoke(this.v5);
 }
}
