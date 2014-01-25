package clojure;

import clojure.lang.*;

public final class main_init_dispatch extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "init-opt");
  const__1 = (clojure.lang.Var)RT.var("clojure.main", "eval-opt");
 }
 public main_init_dispatch() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opt1) {
  return ((IFn)RT.mapUniqueKeys("-i", const__0.getRawRoot(), "--init", const__0.getRawRoot(), "-e", const__1.getRawRoot(), "--eval", const__1.getRawRoot())).invoke(opt1);
 }
}
