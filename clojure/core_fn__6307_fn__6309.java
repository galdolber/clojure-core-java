package clojure;

import clojure.lang.*;

public final class core_fn__6307_fn__6309 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
 }
 Object f2;
 public core_fn__6307_fn__6309(final Object f2) {
  super();
  this.f2 = f2;
 }
 public java.lang.Object invoke(java.lang.Object ret1, java.lang.Object p__63082) {
  {
   Object vec__63103 = p__63082;
   Object k4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__63103), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__63103), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)this.f2).invoke(ret1, k4, v5);
  }
 }
}
