package clojure;

import clojure.lang.*;

public final class zip_rightmost extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "l");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "r");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "last");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "butlast");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_rightmost() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object vec__70112 = loc1;
   Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70112), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70124 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70112), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4575;
   Object __r4576 = ((IFn)const__3.getRawRoot()).invoke(map__70124);
   if (__r4576 != null && !(__r4576 == Boolean.FALSE)) {
    __r4575 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70124))));
   } else {
    __r4575 = map__70124;
   }
   Object map__70125 = __r4575;
   Object path6 = map__70125;
   Object l7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70125), ((java.lang.Object)const__6)));
   Object r8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70125), ((java.lang.Object)const__7)));
   Object __r4578 = null;
   {
    Object and__3966__auto__9 = path6;
    Object __r4579;
    Object __r4580 = and__3966__auto__9;
    if (__r4580 != null && !(__r4580 == Boolean.FALSE)) {
     __r4579 = r8;
    } else {
     __r4579 = and__3966__auto__9;
    }
    __r4578 = __r4579;
   }
   Object __r4581 = __r4578;
   if (__r4581 != null && !(__r4581 == Boolean.FALSE)) {
    return ((IFn)const__8.getRawRoot()).invoke(RT.vector(((IFn)const__9.getRawRoot()).invoke(r8), ((IFn)const__10.getRawRoot()).invoke(path6, const__6, ((IFn)const__11.getRawRoot()).invoke(const__12.getRawRoot(), l7, node3, ((IFn)const__13.getRawRoot()).invoke(r8)), const__7, null)), ((IFn)const__14.getRawRoot()).invoke(loc1));
   } else {
    return loc1;
   }
  }
 }
}
