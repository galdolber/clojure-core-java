package clojure;

import clojure.lang.*;

public final class core_rand_nth extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "rand-int");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public core_rand_nth() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)coll1), (int)RT.intCast(((IFn)const__1.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)coll1)))))));
 }
}
