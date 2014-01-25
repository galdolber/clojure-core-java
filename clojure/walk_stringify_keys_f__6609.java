package clojure;

import clojure.lang.*;

public final class walk_stringify_keys_f__6609 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "name");
 }
 public walk_stringify_keys_f__6609() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__66081) {
  {
   Object vec__66102 = p__66081;
   Object k3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__66102), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__66102), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4357 = ((IFn)const__3.getRawRoot()).invoke(k3);
   if (__r4357 != null && !(__r4357 == Boolean.FALSE)) {
    return RT.vector(((IFn)const__4.getRawRoot()).invoke(k3), v4);
   } else {
    return RT.vector(k3, v4);
   }
  }
 }
}
