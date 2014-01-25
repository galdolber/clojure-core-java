package clojure.java;

import clojure.lang.*;

public final class io_append_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "append");
 }
 public io_append_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1) {
  return (clojure.lang.RT.booleanCast(((java.lang.Object)RT.get(opts1, Keyword.intern(null, "append")))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
