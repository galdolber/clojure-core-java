package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash_fn__5098 extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "distinct?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 Object hashes1;
 public core_maybe_min_hash_fn__5098(final Object hashes1) {
  super();
  this.hashes1 = hashes1;
 }
 public java.lang.Object invoke(java.lang.Object p__50971) {
  {
   Object vec__50992 = p__50971;
   Object s3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50992), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object m4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__50992), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(new clojure.core_maybe_min_hash_fn__5098_fn__5100(s3, m4), this.hashes1));
  }
 }
}
