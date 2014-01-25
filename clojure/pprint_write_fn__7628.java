package clojure;

import clojure.lang.*;

public final class pprint_write_fn__7628 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object object1;
 public pprint_write_fn__7628(final Object object1) {
  super();
  this.object1 = object1;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)const__0.get()).invoke(this.object1);
  } finally {
   ((IFn)const__1.getRawRoot()).invoke();
  }
 }
}
