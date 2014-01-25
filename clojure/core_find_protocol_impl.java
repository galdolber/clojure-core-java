package clojure;

import clojure.lang.*;

public final class core_find_protocol_impl extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "remove");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "butlast");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "super-chain");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "pref");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "supers");
  const__14 = (java.lang.Object)java.lang.Object.class;
 }
 public core_find_protocol_impl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1, java.lang.Object x2) {
  Object __r3748 = ((IFn)const__0.getRawRoot()).invoke(RT.get(protocol1, Keyword.intern(null, "on-interface")), x2);
  if (__r3748 != null && !(__r3748 == Boolean.FALSE)) {
   return x2;
  } else {
   {
    Object c3 = ((IFn)const__2.getRawRoot()).invoke(x2);
    Object impl4 = new clojure.core_find_protocol_impl_impl__5903(protocol1);
    {
     Object or__3968__auto__5 = ((IFn)impl4).invoke(c3);
     Object __r3750 = or__3968__auto__5;
     if (__r3750 != null && !(__r3750 == Boolean.FALSE)) {
      return or__3968__auto__5;
     } else {
      {
       Object and__3966__auto__6 = c3;
       Object __r3752 = and__3966__auto__6;
       if (__r3752 != null && !(__r3752 == Boolean.FALSE)) {
        {
         Object or__3968__auto__7 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(impl4, ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(c3)))));
         Object __r3754 = or__3968__auto__7;
         if (__r3754 != null && !(__r3754 == Boolean.FALSE)) {
          return or__3968__auto__7;
         } else {
          {
           Object __r3755 = null;
           {
            Object temp__4117__auto__8 = ((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke(impl4, ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(c3), const__14)));
            Object __r3756;
            Object __r3757 = temp__4117__auto__8;
            if (__r3757 != null && !(__r3757 == Boolean.FALSE)) {
             Object __r3758 = null;
             {
              Object t9 = temp__4117__auto__8;
              __r3758 = ((IFn)impl4).invoke(t9);
             }
             __r3756 = __r3758;
            } else {
             __r3756 = null;
            }
            __r3755 = __r3756;
           }
           Object or__3968__auto__10 = __r3755;
           Object __r3760 = or__3968__auto__10;
           if (__r3760 != null && !(__r3760 == Boolean.FALSE)) {
            return or__3968__auto__10;
           } else {
            return ((IFn)impl4).invoke(const__14);
           }
          }
         }
        }
       } else {
        return and__3966__auto__6;
       }
      }
     }
    }
   }
  }
 }
}
