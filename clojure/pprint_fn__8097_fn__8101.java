package clojure;

import clojure.lang.*;

public final class pprint_fn__8097_fn__8101 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
 }
 public pprint_fn__8097_fn__8101() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__81024 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81024), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81024), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5742 = ((IFn)const__4.getRawRoot()).invoke(arg5);
   if (__r5742 != null && !(__r5742 == Boolean.FALSE)) {
    return RT.vector(const__5, navigator6);
   } else {
    return navigator6;
   }
  }
 }
}
