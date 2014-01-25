package clojure;

import clojure.lang.*;

public final class core_satisfies_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "find-protocol-impl");
 }
 public core_satisfies_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1, java.lang.Object x2) {
  return (clojure.lang.RT.booleanCast(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(protocol1, x2))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
