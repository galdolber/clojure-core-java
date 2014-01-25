package clojure;

import clojure.lang.*;

public final class zip_replace extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "changed?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_replace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1, java.lang.Object node2) {
  {
   Object vec__70293 = loc1;
   Object _4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70293), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object path5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70293), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__3.getRawRoot()).invoke(RT.vector(node2, ((IFn)const__4.getRawRoot()).invoke(path5, const__5, Boolean.TRUE)), ((IFn)const__6.getRawRoot()).invoke(loc1));
  }
 }
}
