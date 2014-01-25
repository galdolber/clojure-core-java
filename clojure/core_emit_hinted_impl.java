package clojure;

import clojure.lang.*;

public final class core_emit_hinted_impl extends clojure.lang.AFunction {
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
 public core_emit_hinted_impl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object p__59992) {
  {
   Object vec__60003 = p__59992;
   Object p4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60003), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object fs5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__60003), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    Object hint6 = new clojure.core_emit_hinted_impl_hint__6001(c1);
    return RT.vector(p4, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(new clojure.core_emit_hinted_impl_fn__6008(), fs5), ((IFn)const__4.getRawRoot()).invoke(new clojure.core_emit_hinted_impl_fn__6010(hint6), fs5)));
   }
  }
 }
}
