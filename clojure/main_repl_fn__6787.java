package clojure;

import clojure.lang.*;

public final class main_repl_fn__6787 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "identity");
 }
 public main_repl_fn__6787() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(Boolean.TRUE);
 }
}
