package clojure;

import clojure.lang.*;

public final class core_group_by_sig_fn__5178 extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "peek");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pop");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public core_group_by_sig_fn__5178() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object p__51772) {
  {
   Object vec__51793 = p__51772;
   Object msig4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51793), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object meth5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__51793), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    Object rtype6 = ((IFn)const__3.getRawRoot()).invoke(msig4);
    Object argsig7 = ((IFn)const__4.getRawRoot()).invoke(msig4);
    return ((IFn)const__5.getRawRoot()).invoke(m1, argsig7, ((IFn)const__5.getRawRoot()).invoke(((IFn)m1).invoke(argsig7, clojure.lang.PersistentArrayMap.EMPTY), rtype6, meth5));
   }
  }
 }
}
