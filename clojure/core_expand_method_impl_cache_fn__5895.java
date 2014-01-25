package clojure;

import clojure.lang.*;

public final class core_expand_method_impl_cache_fn__5895 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "shift-mask");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "hash");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "aset");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 Object shift9;
 Object mask10;
 public core_expand_method_impl_cache_fn__5895(final Object shift9, final Object mask10) {
  super();
  this.shift9 = shift9;
  this.mask10 = mask10;
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object p__58942) {
  {
   Object vec__58963 = p__58942;
   Object c4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58963), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object e5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__58963), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    long i6 = clojure.lang.Numbers.multiply((long)2L, (long)clojure.lang.RT.intCast(((java.lang.Object)((IFn)const__6.getRawRoot()).invoke(this.shift9, this.mask10, ((IFn)const__7.getRawRoot()).invoke(c4)))));
    clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])t1), (int)clojure.lang.RT.intCast((long)i6), ((java.lang.Object)c4));
    clojure.lang.RT.aset((java.lang.Object[])((java.lang.Object[])t1), (int)clojure.lang.RT.intCast((long)clojure.lang.Numbers.inc((long)i6)), ((java.lang.Object)e5));
    return t1;
   }
  }
 }
}
