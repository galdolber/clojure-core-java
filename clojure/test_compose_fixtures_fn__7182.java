package clojure;

import clojure.lang.*;

public final class test_compose_fixtures_fn__7182 extends clojure.lang.AFunction {
 static {
 }
 Object f22;
 Object f11;
 public test_compose_fixtures_fn__7182(final Object f22, final Object f11) {
  super();
  this.f22 = f22;
  this.f11 = f11;
 }
 public java.lang.Object invoke(java.lang.Object g1) {
  return ((IFn)this.f11).invoke(new clojure.test_compose_fixtures_fn__7182_fn__7183(this.f22, g1));
 }
}
