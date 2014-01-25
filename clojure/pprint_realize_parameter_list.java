package clojure;

import clojure.lang.*;

public final class pprint_realize_parameter_list extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "map-passing-context");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "realize-parameter");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "into");
 }
 public pprint_realize_parameter_list() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object parameter_map1, java.lang.Object navigator2) {
  {
   Object vec__76733 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), navigator2, parameter_map1);
   Object pairs4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76733), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object new_navigator5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76733), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(((IFn)const__5.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, pairs4), new_navigator5);
  }
 }
}
