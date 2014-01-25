package clojure.core;

import clojure.lang.*;

public final class reducers_rfn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core.reducers", "do-rfn");
 }
 public reducers_rfn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object p__66743, java.lang.Object fkv4) {
  {
   Object vec__66755 = p__66743;
   Object f16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__66755), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object k7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__66755), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(f16, k7, fkv4);
  }
 }
}
