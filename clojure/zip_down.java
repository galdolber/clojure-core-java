package clojure;

import clojure.lang.*;

public final class zip_down extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "branch?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.zip", "children");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "l");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "pnodes");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "ppath");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "r");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_down() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  Object __r4551 = ((IFn)const__0.getRawRoot()).invoke(loc1);
  if (__r4551 != null && !(__r4551 == Boolean.FALSE)) {
   {
    Object vec__69982 = loc1;
    Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69982), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object path4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69982), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object vec__69995 = ((IFn)const__4.getRawRoot()).invoke(loc1);
    Object c6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69995), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object cnext7 = ((IFn)const__5.getRawRoot()).invoke(vec__69995, const__3);
    Object cs8 = vec__69995;
    Object __r4553 = cs8;
    if (__r4553 != null && !(__r4553 == Boolean.FALSE)) {
     Object __r4554;
     Object __r4555 = path4;
     if (__r4555 != null && !(__r4555 == Boolean.FALSE)) {
      __r4554 = ((IFn)const__9.getRawRoot()).invoke(RT.get(path4, Keyword.intern(null, "pnodes")), node3);
     } else {
      __r4554 = RT.vector(node3);
     }
     return ((IFn)const__6.getRawRoot()).invoke(RT.vector(c6, RT.mapUniqueKeys(const__7, clojure.lang.PersistentVector.EMPTY, const__8, __r4554, const__10, path4, const__11, cnext7)), ((IFn)const__12.getRawRoot()).invoke(loc1));
    } else {
     return null;
    }
   }
  } else {
   return null;
  }
 }
}
