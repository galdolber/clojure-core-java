package clojure;

import clojure.lang.*;

public final class zip_up extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "l");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "ppath");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "pnodes");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "r");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "changed?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "peek");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__13 = (clojure.lang.Var)RT.var("clojure.zip", "make-node");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_up() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object vec__70012 = loc1;
   Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70012), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70024 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70012), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4556;
   Object __r4557 = ((IFn)const__3.getRawRoot()).invoke(map__70024);
   if (__r4557 != null && !(__r4557 == Boolean.FALSE)) {
    __r4556 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70024))));
   } else {
    __r4556 = map__70024;
   }
   Object map__70025 = __r4556;
   Object path6 = map__70025;
   Object l7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70025), ((java.lang.Object)const__6)));
   Object ppath8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70025), ((java.lang.Object)const__7)));
   Object pnodes9 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70025), ((java.lang.Object)const__8)));
   Object r10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70025), ((java.lang.Object)const__9)));
   Object changed_QMARK_11 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70025), ((java.lang.Object)const__10)));
   Object __r4559 = pnodes9;
   if (__r4559 != null && !(__r4559 == Boolean.FALSE)) {
    {
     Object pnode12 = ((IFn)const__11.getRawRoot()).invoke(pnodes9);
     Object __r4560;
     Object __r4561 = changed_QMARK_11;
     if (__r4561 != null && !(__r4561 == Boolean.FALSE)) {
      Object __r4562 = null;
      {
       Object and__3966__auto__13 = ppath8;
       Object __r4563;
       Object __r4564 = and__3966__auto__13;
       if (__r4564 != null && !(__r4564 == Boolean.FALSE)) {
        __r4563 = ((IFn)const__16.getRawRoot()).invoke(ppath8, const__10, Boolean.TRUE);
       } else {
        __r4563 = and__3966__auto__13;
       }
       __r4562 = __r4563;
      }
      __r4560 = RT.vector(((IFn)const__13.getRawRoot()).invoke(loc1, pnode12, ((IFn)const__14.getRawRoot()).invoke(l7, ((IFn)const__15.getRawRoot()).invoke(node3, r10))), __r4562);
     } else {
      __r4560 = RT.vector(pnode12, ppath8);
     }
     return ((IFn)const__12.getRawRoot()).invoke(__r4560, ((IFn)const__17.getRawRoot()).invoke(loc1));
    }
   } else {
    return null;
   }
  }
 }
}
