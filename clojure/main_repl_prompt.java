package clojure;

import clojure.lang.*;

public final class main_repl_prompt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "printf");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
 }
 public main_repl_prompt() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke("%s=> ", ((IFn)const__1.getRawRoot()).invoke(const__2.get()));
 }
}
