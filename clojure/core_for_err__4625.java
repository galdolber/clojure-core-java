package clojure;

import clojure.lang.*;

public final class core_for_err__4625 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_for_err__4625() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object msg1) {
  Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), msg1))));
  return null;
 }
 public int getRequiredArity() {
  return 0;
 }
}
