package clojure;

import clojure.lang.*;

public final class main_repl_opt_fn__6829 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "initialize");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "require");
  const__3 = (clojure.lang.Var)RT.var("clojure.main", "repl-requires");
 }
 Object args5;
 Object inits2;
 public main_repl_opt_fn__6829(final Object args5, final Object inits2) {
  super();
  this.args5 = args5;
  this.inits2 = inits2;
 }
 public java.lang.Object invoke() {
  ((IFn)const__0.getRawRoot()).invoke(this.args5, this.inits2);
  return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), const__3.getRawRoot());
 }
}
