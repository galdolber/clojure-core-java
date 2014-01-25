package clojure.test;

import clojure.lang.*;

public final class tap_print_diagnostics_fn__7233 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.Throwable.class;
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__3 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-cause-trace");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "*stack-trace-depth*");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "prn");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object s__4646__auto__2;
 Object data1;
 public tap_print_diagnostics_fn__7233(final Object s__4646__auto__2, final Object data1) {
  super();
  this.s__4646__auto__2 = s__4646__auto__2;
  this.data1 = data1;
 }
 public java.lang.Object invoke() {
  try {
   if ((RT.get(this.data1, Keyword.intern(null, "actual")) instanceof java.lang.Throwable)) {
    ((IFn)const__3.getRawRoot()).invoke(RT.get(this.data1, Keyword.intern(null, "actual")), const__4.get());
   } else {
    ((IFn)const__5.getRawRoot()).invoke(RT.get(this.data1, Keyword.intern(null, "actual")));
   }
   return ((IFn)const__6.getRawRoot()).invoke(this.s__4646__auto__2);
  } finally {
   ((IFn)const__7.getRawRoot()).invoke();
  }
 }
}
