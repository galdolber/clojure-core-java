package clojure;

import clojure.lang.*;

public final class core_process_print_annotation_fn__4855 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "print-annotation-value");
 }
 public core_process_print_annotation_fn__4855() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__48541) {
  {
   Object vec__48562 = p__48541;
   Object k3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48562), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__48562), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(k3), "=", ((IFn)const__5.getRawRoot()).invoke(v4));
  }
 }
}
