package clojure;

import clojure.lang.*;

public final class core_expand_method_impl_cache_fn__5890 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public core_expand_method_impl_cache_fn__5890() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__58891) {
  {
   Object vec__58912 = p__58891;
   Object c3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58912), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object e4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58912), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return (clojure.lang.Util.identical(((java.lang.Object)e4), ((java.lang.Object)null)) ? Boolean.TRUE : Boolean.FALSE);
  }
 }
}
