package clojure;

import clojure.lang.*;

public final class zip_left extends clojure.lang.AFunction {
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
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "peek");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "pop");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_left() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object vec__70152 = loc1;
   Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70152), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70164 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70152), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4582;
   Object __r4583 = ((IFn)const__3.getRawRoot()).invoke(map__70164);
   if (__r4583 != null && !(__r4583 == Boolean.FALSE)) {
    __r4582 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70164))));
   } else {
    __r4582 = map__70164;
   }
   Object map__70165 = __r4582;
   Object path6 = map__70165;
   Object l7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70165), ((java.lang.Object)const__6)));
   Object r8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70165), ((java.lang.Object)const__7)));
   Object __r4585 = null;
   {
    Object and__3966__auto__9 = path6;
    Object __r4586;
    Object __r4587 = and__3966__auto__9;
    if (__r4587 != null && !(__r4587 == Boolean.FALSE)) {
     __r4586 = ((IFn)const__4.getRawRoot()).invoke(l7);
    } else {
     __r4586 = and__3966__auto__9;
    }
    __r4585 = __r4586;
   }
   Object __r4588 = __r4585;
   if (__r4588 != null && !(__r4588 == Boolean.FALSE)) {
    return ((IFn)const__8.getRawRoot()).invoke(RT.vector(((IFn)const__9.getRawRoot()).invoke(l7), ((IFn)const__10.getRawRoot()).invoke(path6, const__6, ((IFn)const__11.getRawRoot()).invoke(l7), const__7, ((IFn)const__12.getRawRoot()).invoke(node3, r8))), ((IFn)const__13.getRawRoot()).invoke(loc1));
   } else {
    return null;
   }
  }
 }
}
