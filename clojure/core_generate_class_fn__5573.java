package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5573 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
 }
 public core_generate_class_fn__5573() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5545_SHARP_1) {
  {
   Object vec__55742 = ((IFn)const__0.getRawRoot()).invoke(p1__5545_SHARP_1);
   Object m3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55742), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object p4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55742), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.mapUniqueKeys(m3, RT.vector(p4));
  }
 }
}
