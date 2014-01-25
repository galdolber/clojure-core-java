package clojure;

import clojure.lang.*;

public final class test_test_all_vars_fn__7192_fn__7199 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "test-var");
 }
 Object v9;
 public test_test_all_vars_fn__7192_fn__7199(final Object v9) {
  super();
  this.v9 = v9;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.get()).invoke(this.v9);
 }
}
