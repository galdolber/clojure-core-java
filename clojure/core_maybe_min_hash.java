package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "max-mask-bits");
 }
 public core_maybe_min_hash() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object hashes1) {
  Object __r3283 = null;
  {
   Object iter__4618__auto__2 = new clojure.core_maybe_min_hash_iter__5103__5109();
   __r3283 = ((IFn)iter__4618__auto__2).invoke(((IFn)const__2.getRawRoot()).invoke(new clojure.core_maybe_min_hash_fn__5126(), ((IFn)const__3.getRawRoot()).invoke(const__4, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)const__6.getRawRoot()))))));
  }
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core_maybe_min_hash_fn__5098(hashes1), __r3283));
 }
}
