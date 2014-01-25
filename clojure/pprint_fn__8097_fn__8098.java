package clojure;

import clojure.lang.*;

public final class pprint_fn__8097_fn__8098 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "write");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
 }
 Object bindings4;
 public pprint_fn__8097_fn__8098(final Object bindings4) {
  super();
  this.bindings4 = bindings4;
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__80994 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80994), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80994), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5740 = ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), arg5, this.bindings4);
   if (__r5740 != null && !(__r5740 == Boolean.FALSE)) {
    return RT.vector(const__6, navigator6);
   } else {
    return navigator6;
   }
  }
 }
}
