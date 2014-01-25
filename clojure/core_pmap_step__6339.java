package clojure;

import clojure.lang.*;

public final class core_pmap_step__6339 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__3 = (java.lang.Object)1L;
 }
 public core_pmap_step__6339() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__63381, java.lang.Object fs2) {
  {
   Object vec__63403 = p__63381;
   Object x4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__63403), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object xs5 = ((IFn)const__2.getRawRoot()).invoke(vec__63403, const__3);
   Object vs6 = vec__63403;
   return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_pmap_step__6339_fn__6341(this, vs6, xs5, x4, fs2)));
  }
 }
}
