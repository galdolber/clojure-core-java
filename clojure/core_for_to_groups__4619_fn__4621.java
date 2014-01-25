package clojure;

import clojure.lang.*;

public final class core_for_to_groups__4619_fn__4621 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pop");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "peek");
 }
 public core_for_to_groups__4619_fn__4621() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object groups1, java.lang.Object p__46202) {
  {
   Object vec__46223 = p__46202;
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46223), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__46223), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r2868 = ((IFn)const__3.getRawRoot()).invoke(k4);
   if (__r2868 != null && !(__r2868 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(groups1), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(groups1), RT.vector(k4, v5)));
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(groups1, RT.vector(k4, v5));
   }
  }
 }
}
