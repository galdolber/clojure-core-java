package clojure;

import clojure.lang.*;

public final class core_repeatedly_fn__4733 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "repeatedly");
 }
 Object f1;
 public core_repeatedly_fn__4733(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)this.f1).invoke(), ((IFn)const__1.getRawRoot()).invoke(this.f1));
 }
}
