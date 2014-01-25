package clojure;

import clojure.lang.*;

public final class main_eval_opt_fn__6807 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "read");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object reader3;
 Object eof2;
 public main_eval_opt_fn__6807(final Object reader3, final Object eof2) {
  super();
  this.reader3 = reader3;
  this.eof2 = eof2;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)const__0.getRawRoot()).invoke(this.reader3, Boolean.FALSE, this.eof2);
  } finally {
   ((IFn)const__1.getRawRoot()).invoke();
  }
 }
}
