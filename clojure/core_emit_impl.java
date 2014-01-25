package clojure;

import clojure.lang.*;

public final class core_emit_impl extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_emit_impl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__59901) {
  {
   Object vec__59912 = p__59901;
   Object p3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59912), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object fs4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__59912), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(p3, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(new clojure.core_emit_impl_fn__5992(), fs4), ((IFn)const__4.getRawRoot()).invoke(new clojure.core_emit_impl_fn__5994(), fs4)));
  }
 }
}
