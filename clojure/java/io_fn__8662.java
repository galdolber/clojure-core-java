package clojure.java;

import clojure.lang.*;

public final class io_fn__8662 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pr-str");
 }
 public io_fn__8662() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("Cannot open <", ((IFn)const__1.getRawRoot()).invoke(x1), "> as an OutputStream."))));
  return null;
 }
}
