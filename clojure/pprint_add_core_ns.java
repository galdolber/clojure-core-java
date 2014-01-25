package clojure;

import clojure.lang.*;

public final class pprint_add_core_ns extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public pprint_add_core_ns() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object amap1) {
  {
   Object core2 = "clojure.core";
   return ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_add_core_ns_fn__8479(core2), amap1));
  }
 }
}
