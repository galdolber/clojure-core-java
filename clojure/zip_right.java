package clojure;

import clojure.lang.*;

public final class zip_right extends clojure.lang.AFunction {
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
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "l");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "r");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_right() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object vec__70062 = loc1;
   Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70062), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70074 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70062), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4568;
   Object __r4569 = ((IFn)const__3.getRawRoot()).invoke(map__70074);
   if (__r4569 != null && !(__r4569 == Boolean.FALSE)) {
    __r4568 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70074))));
   } else {
    __r4568 = map__70074;
   }
   Object map__70075 = __r4568;
   Object path6 = map__70075;
   Object l7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70075), ((java.lang.Object)const__6)));
   Object vec__70088 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70075), ((java.lang.Object)const__7)));
   Object r9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70088), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object rnext10 = ((IFn)const__8.getRawRoot()).invoke(vec__70088, const__2);
   Object rs11 = vec__70088;
   Object __r4571 = null;
   {
    Object and__3966__auto__12 = path6;
    Object __r4572;
    Object __r4573 = and__3966__auto__12;
    if (__r4573 != null && !(__r4573 == Boolean.FALSE)) {
     __r4572 = rs11;
    } else {
     __r4572 = and__3966__auto__12;
    }
    __r4571 = __r4572;
   }
   Object __r4574 = __r4571;
   if (__r4574 != null && !(__r4574 == Boolean.FALSE)) {
    return ((IFn)const__9.getRawRoot()).invoke(RT.vector(r9, ((IFn)const__10.getRawRoot()).invoke(path6, const__6, ((IFn)const__11.getRawRoot()).invoke(l7, node3), const__7, rnext10)), ((IFn)const__12.getRawRoot()).invoke(loc1));
   } else {
    return null;
   }
  }
 }
}
