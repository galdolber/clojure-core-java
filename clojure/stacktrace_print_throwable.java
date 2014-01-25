package clojure;

import clojure.lang.*;

public final class stacktrace_print_throwable extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "printf");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "class");
 }
 public stacktrace_print_throwable() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object tr1) {
  return ((IFn)const__0.getRawRoot()).invoke("%s: %s", ((java.lang.String)((java.lang.Class)((IFn)const__1.getRawRoot()).invoke(tr1)).getName()), ((java.lang.String)((java.lang.Throwable)tr1).getMessage()));
 }
}
