package clojure;

import clojure.lang.*;

public final class set_map_invert_fn__6887 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public set_map_invert_fn__6887() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object p__68862) {
  {
   Object vec__68883 = p__68862;
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68883), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68883), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(m1, v5, k4);
  }
 }
}
