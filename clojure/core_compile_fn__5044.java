package clojure;

import clojure.lang.*;

public final class core_compile_fn__5044 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "load-one");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object lib1;
 public core_compile_fn__5044(final Object lib1) {
  super();
  this.lib1 = lib1;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)const__0.getRawRoot()).invoke(this.lib1, Boolean.TRUE, Boolean.TRUE);
  } finally {
   ((IFn)const__1.getRawRoot()).invoke();
  }
 }
}
