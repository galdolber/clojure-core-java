package clojure;

import clojure.lang.*;

public final class main_repl_exception extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "root-cause");
 }
 public main_repl_exception() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object throwable1) {
  return ((IFn)const__0.getRawRoot()).invoke(throwable1);
 }
}
