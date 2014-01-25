package clojure;

import clojure.lang.*;

public final class zip_insert_right extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "r");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "changed?");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_insert_right() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1, java.lang.Object item2) {
  {
   Object vec__70263 = loc1;
   Object node4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70263), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70275 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70263), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4599;
   Object __r4600 = ((IFn)const__3.getRawRoot()).invoke(map__70275);
   if (__r4600 != null && !(__r4600 == Boolean.FALSE)) {
    __r4599 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70275))));
   } else {
    __r4599 = map__70275;
   }
   Object map__70276 = __r4599;
   Object path7 = map__70276;
   Object r8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70276), ((java.lang.Object)const__6)));
   if (clojure.lang.Util.identical(((java.lang.Object)path7), ((java.lang.Object)null))) {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Insert at top")));
    return null;
   } else {
    return ((IFn)const__8.getRawRoot()).invoke(RT.vector(node4, ((IFn)const__9.getRawRoot()).invoke(path7, const__6, ((IFn)const__10.getRawRoot()).invoke(item2, r8), const__11, Boolean.TRUE)), ((IFn)const__12.getRawRoot()).invoke(loc1));
   }
  }
 }
}
