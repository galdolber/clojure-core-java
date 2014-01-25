package clojure;

import clojure.lang.*;

public final class core_send_via_fn__4140 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "binding-conveyor-fn");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object f3;
 public core_send_via_fn__4140(final Object f3) {
  super();
  this.f3 = f3;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)const__0.getRawRoot()).invoke(this.f3);
  } finally {
   ((IFn)const__1.getRawRoot()).invoke();
  }
 }
}
