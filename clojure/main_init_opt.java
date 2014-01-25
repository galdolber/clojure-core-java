package clojure;

import clojure.lang.*;

public final class main_init_opt extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "load-script");
 }
 public main_init_opt() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object path1) {
  return ((IFn)const__0.getRawRoot()).invoke(path1);
 }
}
