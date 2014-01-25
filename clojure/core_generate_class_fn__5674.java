package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5674 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 Object exposes_methods7;
 public core_generate_class_fn__5674(final Object exposes_methods7) {
  super();
  this.exposes_methods7 = exposes_methods7;
 }
 public java.lang.Object invoke(java.lang.Object ms1, java.lang.Object p__56732) {
  {
   Object vec__56753 = p__56732;
   Object vec__56764 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__56753), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object name5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__56764), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object _6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__56764), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object _7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__56764), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object m8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__56753), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r3566 = ((IFn)const__4.getRawRoot()).invoke(this.exposes_methods7, ((IFn)const__5.getRawRoot()).invoke(name5));
   if (__r3566 != null && !(__r3566 == Boolean.FALSE)) {
    return ((IFn)const__6.getRawRoot()).invoke(ms1, RT.vector(((IFn)((IFn)const__5.getRawRoot()).invoke(name5)).invoke(this.exposes_methods7), m8));
   } else {
    return ms1;
   }
  }
 }
}
