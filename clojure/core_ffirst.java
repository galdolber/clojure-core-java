package clojure;

import clojure.lang.*;

public final class core_ffirst extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_ffirst() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(x1));
 }
}
