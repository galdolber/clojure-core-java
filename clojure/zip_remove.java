package clojure;

import clojure.lang.*;

public final class zip_remove extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
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
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "peek");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "pop");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "changed?");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__19 = (clojure.lang.Var)RT.var("clojure.zip", "branch?");
  const__20 = (clojure.lang.Var)RT.var("clojure.zip", "down");
  const__21 = (clojure.lang.Var)RT.var("clojure.zip", "rightmost");
  const__22 = (clojure.lang.Var)RT.var("clojure.zip", "make-node");
 }
 public zip_remove() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  {
   Object vec__70442 = loc1;
   Object node3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70442), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object map__70454 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__70442), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4621;
   Object __r4622 = ((IFn)const__3.getRawRoot()).invoke(map__70454);
   if (__r4622 != null && !(__r4622 == Boolean.FALSE)) {
    __r4621 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__4.getRawRoot()).invoke(map__70454))));
   } else {
    __r4621 = map__70454;
   }
   Object map__70455 = __r4621;
   Object path6 = map__70455;
   Object l7 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70455), ((java.lang.Object)const__6)));
   Object ppath8 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70455), ((java.lang.Object)const__7)));
   Object pnodes9 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70455), ((java.lang.Object)const__8)));
   Object rs10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__70455), ((java.lang.Object)const__9)));
   if (clojure.lang.Util.identical(((java.lang.Object)path6), ((java.lang.Object)null))) {
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)"Remove at top")));
    return null;
   } else {
    if (clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)l7)))) {
     {
      Object loc11 = ((IFn)const__13.getRawRoot()).invoke(RT.vector(((IFn)const__14.getRawRoot()).invoke(l7), ((IFn)const__15.getRawRoot()).invoke(path6, const__6, ((IFn)const__16.getRawRoot()).invoke(l7), const__17, Boolean.TRUE)), ((IFn)const__18.getRawRoot()).invoke(loc1));
      while(true) {
       {
        Object __r4625 = null;
        {
         Object and__3966__auto__12 = ((IFn)const__19.getRawRoot()).invoke(loc11);
         Object __r4626;
         Object __r4627 = and__3966__auto__12;
         if (__r4627 != null && !(__r4627 == Boolean.FALSE)) {
          __r4626 = ((IFn)const__20.getRawRoot()).invoke(loc11);
         } else {
          __r4626 = and__3966__auto__12;
         }
         __r4625 = __r4626;
        }
        Object temp__4115__auto__13 = __r4625;
        Object __r4629 = temp__4115__auto__13;
        if (__r4629 != null && !(__r4629 == Boolean.FALSE)) {
         {
          Object child14 = temp__4115__auto__13;
          java.lang.Object loc11___aux = ((IFn)const__21.getRawRoot()).invoke(child14);
          loc11 = loc11___aux;
          continue;
         }
        } else {
         return loc11;
        }
       }
      }
     }
    } else {
     Object __r4630 = null;
     {
      Object and__3966__auto__15 = ppath8;
      Object __r4631;
      Object __r4632 = and__3966__auto__15;
      if (__r4632 != null && !(__r4632 == Boolean.FALSE)) {
       __r4631 = ((IFn)const__15.getRawRoot()).invoke(ppath8, const__17, Boolean.TRUE);
      } else {
       __r4631 = and__3966__auto__15;
      }
      __r4630 = __r4631;
     }
     return ((IFn)const__13.getRawRoot()).invoke(RT.vector(((IFn)const__22.getRawRoot()).invoke(loc1, ((IFn)const__14.getRawRoot()).invoke(pnodes9), rs10), __r4630), ((IFn)const__18.getRawRoot()).invoke(loc1));
    }
   }
  }
 }
}
