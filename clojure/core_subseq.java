package clojure;

import clojure.lang.*;

public final class core_subseq extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "mk-bound-fn");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
 }
 public core_subseq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sc1, java.lang.Object start_test2, java.lang.Object start_key3, java.lang.Object end_test4, java.lang.Object end_key5) {
  {
   Object temp__4117__auto__6 = ((clojure.lang.ISeq)((clojure.lang.Sorted)sc1).seqFrom(((java.lang.Object)start_key3), (boolean)((Boolean)Boolean.TRUE).booleanValue()));
   Object __r2920 = temp__4117__auto__6;
   if (__r2920 != null && !(__r2920 == Boolean.FALSE)) {
    {
     Object vec__47247 = temp__4117__auto__6;
     Object e8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47247), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object s9 = vec__47247;
     Object __r2921;
     Object __r2922 = ((IFn)((IFn)const__0.getRawRoot()).invoke(sc1, start_test2, start_key3)).invoke(e8);
     if (__r2922 != null && !(__r2922 == Boolean.FALSE)) {
      __r2921 = s9;
     } else {
      __r2921 = ((IFn)const__5.getRawRoot()).invoke(s9);
     }
     return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(sc1, end_test4, end_key5), __r2921);
    }
   } else {
    return null;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object sc1, java.lang.Object test2, java.lang.Object key3) {
  {
   Object include4 = ((IFn)const__0.getRawRoot()).invoke(sc1, test2, key3);
   Object __r2924 = ((IFn)RT.set(const__1.getRawRoot(), const__2.getRawRoot())).invoke(test2);
   if (__r2924 != null && !(__r2924 == Boolean.FALSE)) {
    {
     Object temp__4117__auto__5 = ((clojure.lang.ISeq)((clojure.lang.Sorted)sc1).seqFrom(((java.lang.Object)key3), (boolean)((Boolean)Boolean.TRUE).booleanValue()));
     Object __r2926 = temp__4117__auto__5;
     if (__r2926 != null && !(__r2926 == Boolean.FALSE)) {
      {
       Object vec__47236 = temp__4117__auto__5;
       Object e7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47236), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object s8 = vec__47236;
       Object __r2928 = ((IFn)include4).invoke(e7);
       if (__r2928 != null && !(__r2928 == Boolean.FALSE)) {
        return s8;
       } else {
        return ((IFn)const__5.getRawRoot()).invoke(s8);
       }
      }
     } else {
      return null;
     }
    }
   } else {
    return ((IFn)const__6.getRawRoot()).invoke(include4, ((clojure.lang.ISeq)((clojure.lang.Sorted)sc1).seq((boolean)((Boolean)Boolean.TRUE).booleanValue())));
   }
  }
 }
}
