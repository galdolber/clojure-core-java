package clojure;

import clojure.lang.*;

public final class main_repl_read_eval_print__6791_fn__6794 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object eval7;
 Object input4;
 public main_repl_read_eval_print__6791_fn__6794(final Object eval7, final Object input4) {
  super();
  this.eval7 = eval7;
  this.input4 = input4;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)this.eval7).invoke(this.input4);
  } finally {
   ((IFn)const__0.getRawRoot()).invoke();
  }
 }
}
