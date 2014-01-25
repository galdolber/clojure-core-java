package clojure;

import clojure.lang.*;

public final class main_repl_fn__6800 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*e");
 }
 Object read_eval_print15;
 Object request_exit14;
 Object caught5;
 public main_repl_fn__6800(final Object read_eval_print15, final Object request_exit14, final Object caught5) {
  super();
  this.read_eval_print15 = read_eval_print15;
  this.request_exit14 = request_exit14;
  this.caught5 = caught5;
 }
 public java.lang.Object invoke() {
  try {
   return (clojure.lang.Util.identical(((java.lang.Object)((IFn)this.read_eval_print15).invoke()), ((java.lang.Object)this.request_exit14)) ? Boolean.TRUE : Boolean.FALSE);
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Throwable) {
    java.lang.Throwable e3 = (java.lang.Throwable) ex___;
    ((IFn)this.caught5).invoke(e3);
    const__1.set(e3);
    return null;
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
