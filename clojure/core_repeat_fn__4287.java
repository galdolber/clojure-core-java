package clojure;

import clojure.lang.*;

public final class core_repeat_fn__4287 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
 }
 Object x1;
 public core_repeat_fn__4287(final Object x1) {
  super();
  this.x1 = x1;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(this.x1, ((IFn)const__1.getRawRoot()).invoke(this.x1));
 }
}
