package clojure;

import clojure.lang.*;

public final class core_emit_defrecord_irecord__5824 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IRecord");
 }
 public core_emit_defrecord_irecord__5824() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__58231) {
  {
   Object vec__58252 = p__58231;
   Object i3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58252), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object m4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58252), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(((IFn)const__3.getRawRoot()).invoke(i3, const__4), m4);
  }
 }
}
