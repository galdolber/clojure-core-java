package clojure;

import clojure.lang.*;

public final class pprint_translate_param extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.IPersistentSet const__7;
 public static final clojure.lang.Keyword const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Keyword const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__5 = (java.lang.Object)Character.valueOf((char)86);
  const__6 = (java.lang.Object)Character.valueOf((char)118);
  const__7 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Character.valueOf((char)86), Character.valueOf((char)118));
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "parameter-from-args");
  const__9 = (java.lang.Object)Character.valueOf((char)35);
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "remaining-arg-count");
  const__11 = (java.lang.Object)2L;
  const__12 = (java.lang.Object)Character.valueOf((char)39);
 }
 public pprint_translate_param() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__81141) {
  {
   Object vec__81152 = p__81141;
   Object p3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81152), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81152), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5758;
   if (clojure.lang.Util.equiv((long)((java.lang.String)p3).length(), (long)0L)) {
    __r5758 = null;
   } else {
    Object __r5759;
    Object __r5760 = null;
    {
     boolean and__3966__auto__5 = clojure.lang.Util.equiv((long)((java.lang.String)p3).length(), (long)1L);
     Object __r5761;
     if (and__3966__auto__5) {
      __r5761 = ((IFn)const__4.getRawRoot()).invoke(const__7, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)p3), (int)RT.intCast(0L))));
     } else {
      __r5761 = (and__3966__auto__5 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r5760 = __r5761;
    }
    Object __r5762 = __r5760;
    if (__r5762 != null && !(__r5762 == Boolean.FALSE)) {
     __r5759 = const__8;
    } else {
     Object __r5763;
     Object __r5764 = null;
     boolean and__3966__auto__6 = clojure.lang.Util.equiv((long)((java.lang.String)p3).length(), (long)1L);
     Object __r5765;
     if (and__3966__auto__6) {
      __r5765 = clojure.lang.Util.equiv(((java.lang.Object)const__9), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)p3), (int)RT.intCast(0L)))));
     } else {
      __r5765 = and__3966__auto__6;
     }
     if ((java.lang.Boolean)__r5765) {
      __r5763 = const__10;
     } else {
      Object __r5766;
      Object __r5767 = null;
      boolean and__3966__auto__7 = clojure.lang.Util.equiv((long)((java.lang.String)p3).length(), (long)2L);
      Object __r5768;
      if (and__3966__auto__7) {
       __r5768 = clojure.lang.Util.equiv(((java.lang.Object)const__12), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)p3), (int)RT.intCast(0L)))));
      } else {
       __r5768 = and__3966__auto__7;
      }
      if ((java.lang.Boolean)__r5768) {
       __r5766 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)p3), (int)RT.intCast(1L)));
      } else {
       Object __r5769;
       Object __r5770 = Boolean.TRUE;
       if (__r5770 != null && !(__r5770 == Boolean.FALSE)) {
        __r5769 = new java.lang.Integer((java.lang.String)((java.lang.String)p3));
       } else {
        __r5769 = null;
       }
       __r5766 = __r5769;
      }
      __r5763 = __r5766;
     }
     __r5759 = __r5763;
    }
    __r5758 = __r5759;
   }
   return RT.vector(__r5758, offset4);
  }
 }
}
