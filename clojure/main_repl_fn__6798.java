package clojure;

import clojure.lang.*;

public final class main_repl_fn__6798 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*e");
 }
 Object init12;
 Object caught5;
 public main_repl_fn__6798(final Object init12, final Object caught5) {
  super();
  this.init12 = init12;
  this.caught5 = caught5;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)this.init12).invoke();
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Throwable) {
    java.lang.Throwable e3 = (java.lang.Throwable) ex___;
    ((IFn)this.caught5).invoke(e3);
    return const__0.set(e3);
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
