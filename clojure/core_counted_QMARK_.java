package clojure;

import clojure.lang.*;

public final class core_counted_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Counted.class;
 }
 public core_counted_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((coll1 instanceof clojure.lang.Counted) ? Boolean.TRUE : Boolean.FALSE);
 }
}
