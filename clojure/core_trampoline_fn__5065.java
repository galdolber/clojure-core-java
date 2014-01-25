package clojure;

import clojure.lang.*;

public final class core_trampoline_fn__5065 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 Object args2;
 public core_trampoline_fn__5065(final Object f1, final Object args2) {
  super();
  this.f1 = f1;
  this.args2 = args2;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, this.args2);
 }
}
