package clojure;

import clojure.lang.*;

public final class main_repl_read_eval_print__6791_fn__6792 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object request_exit14;
 Object read8;
 Object request_prompt13;
 public main_repl_read_eval_print__6791_fn__6792(final Object request_exit14, final Object read8, final Object request_prompt13) {
  super();
  this.request_exit14 = request_exit14;
  this.read8 = read8;
  this.request_prompt13 = request_prompt13;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)this.read8).invoke(this.request_prompt13, this.request_exit14);
  } finally {
   ((IFn)const__0.getRawRoot()).invoke();
  }
 }
}
