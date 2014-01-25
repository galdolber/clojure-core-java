package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5585 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_generate_class_fn__5585() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__55841) {
  {
   Object vec__55862 = p__55841;
   Object m3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55862), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object s4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__55862), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_class_fn__5585_fn__5587(m3), s4);
  }
 }
}
