package clojure;

import clojure.lang.*;

public final class core_iterate_fn__4291 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "iterate");
 }
 Object f1;
 Object x2;
 public core_iterate_fn__4291(final Object f1, final Object x2) {
  super();
  this.f1 = f1;
  this.x2 = x2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, ((IFn)this.f1).invoke(this.x2));
 }
}
