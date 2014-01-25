package clojure;

import clojure.lang.*;

public final class core_protocol_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
 }
 public core_protocol_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object maybe_p1) {
  return (clojure.lang.RT.booleanCast(((java.lang.Object)RT.get(maybe_p1, Keyword.intern(null, "on-interface")))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
