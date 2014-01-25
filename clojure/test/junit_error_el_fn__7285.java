package clojure.test;

import clojure.lang.*;

public final class junit_error_el_fn__7285 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-cause-trace");
  const__1 = (clojure.lang.Var)RT.var("clojure.test", "*stack-trace-depth*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object actual3;
 Object s__4646__auto__4;
 public junit_error_el_fn__7285(final Object actual3, final Object s__4646__auto__4) {
  super();
  this.actual3 = actual3;
  this.s__4646__auto__4 = s__4646__auto__4;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0.getRawRoot()).invoke(this.actual3, const__1.get());
   return ((IFn)const__2.getRawRoot()).invoke(this.s__4646__auto__4);
  } finally {
   ((IFn)const__3.getRawRoot()).invoke();
  }
 }
}
