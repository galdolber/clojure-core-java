package clojure;

import clojure.lang.*;

public final class core_emit_hinted_impl_hint__6001 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 Object c1;
 public core_emit_hinted_impl_hint__6001(final Object c1) {
  super();
  this.c1 = c1;
 }
 public java.lang.Object invoke(java.lang.Object specs1) {
  {
   Object __r3823;
   Object __r3824 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(specs1));
   if (__r3824 != null && !(__r3824 == Boolean.FALSE)) {
    __r3823 = ((IFn)const__2.getRawRoot()).invoke(specs1);
   } else {
    __r3823 = specs1;
   }
   Object specs2 = __r3823;
   return ((IFn)const__3.getRawRoot()).invoke(new clojure.core_emit_hinted_impl_hint__6001_fn__6003(this.c1), specs2);
  }
 }
}
