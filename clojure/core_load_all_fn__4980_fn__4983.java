package clojure;

import clojure.lang.*;

public final class core_load_all_fn__4980_fn__4983 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "load-one");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object require3;
 Object need_ns2;
 Object lib1;
 public core_load_all_fn__4980_fn__4983(final Object require3, final Object need_ns2, final Object lib1) {
  super();
  this.require3 = require3;
  this.need_ns2 = need_ns2;
  this.lib1 = lib1;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0.getRawRoot()).invoke(this.lib1, this.need_ns2, this.require3);
   return ((IFn)const__1.getRawRoot()).invoke(const__2.get());
  } finally {
   ((IFn)const__3.getRawRoot()).invoke();
  }
 }
}
