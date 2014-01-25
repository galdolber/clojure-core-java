package clojure;

import clojure.lang.*;

public final class main_repl_opt_fn__6827 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.main", "eval-opt");
  const__2 = (clojure.lang.Var)RT.var("clojure.main", "init-dispatch");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public main_repl_opt_fn__6827() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__6824_SHARP_1) {
  return (clojure.lang.Util.equiv(((java.lang.Object)const__1.getRawRoot()), ((java.lang.Object)((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(p1__6824_SHARP_1)))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
