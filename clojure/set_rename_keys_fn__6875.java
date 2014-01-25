package clojure;

import clojure.lang.*;

public final class set_rename_keys_fn__6875 extends clojure.lang.AFunction {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
 }
 Object map1;
 public set_rename_keys_fn__6875(final Object map1) {
  super();
  this.map1 = map1;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object p__68742) {
  {
   Object vec__68763 = p__68742;
   Object old4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68763), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object new5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68763), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4500 = ((IFn)const__3.getRawRoot()).invoke(this.map1, old4);
   if (__r4500 != null && !(__r4500 == Boolean.FALSE)) {
    return ((IFn)const__4.getRawRoot()).invoke(m1, new5, ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)this.map1), ((java.lang.Object)old4))));
   } else {
    return m1;
   }
  }
 }
}
