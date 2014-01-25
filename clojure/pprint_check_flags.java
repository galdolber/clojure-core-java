package clojure;

import clojure.lang.*;

public final class pprint_check_flags extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "flags");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "both");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "min");
 }
 public pprint_check_flags() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object def1, java.lang.Object flags2) {
  {
   Object allowed3 = RT.get(def1, Keyword.intern(null, "flags"));
   Object __r5778 = null;
   {
    Object and__3966__auto__4 = ((IFn)const__1.getRawRoot()).invoke(RT.get(allowed3, Keyword.intern(null, "at")));
    Object __r5779;
    Object __r5780 = and__3966__auto__4;
    if (__r5780 != null && !(__r5780 == Boolean.FALSE)) {
     __r5779 = RT.get(flags2, Keyword.intern(null, "at"));
    } else {
     __r5779 = and__3966__auto__4;
    }
    __r5778 = __r5779;
   }
   Object __r5781 = __r5778;
   if (__r5781 != null && !(__r5781 == Boolean.FALSE)) {
    ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("\"@\" is an illegal flag for format directive \"", RT.get(def1, Keyword.intern(null, "directive")), "\""), ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)RT.get(flags2, Keyword.intern(null, "at"))), (int)RT.intCast(1L))));
   } else {
   }
   Object __r5783 = null;
   {
    Object and__3966__auto__5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(allowed3, Keyword.intern(null, "colon")));
    Object __r5784;
    Object __r5785 = and__3966__auto__5;
    if (__r5785 != null && !(__r5785 == Boolean.FALSE)) {
     __r5784 = RT.get(flags2, Keyword.intern(null, "colon"));
    } else {
     __r5784 = and__3966__auto__5;
    }
    __r5783 = __r5784;
   }
   Object __r5786 = __r5783;
   if (__r5786 != null && !(__r5786 == Boolean.FALSE)) {
    ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("\":\" is an illegal flag for format directive \"", RT.get(def1, Keyword.intern(null, "directive")), "\""), ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)RT.get(flags2, Keyword.intern(null, "colon"))), (int)RT.intCast(1L))));
   } else {
   }
   Object __r5788 = null;
   {
    Object and__3966__auto__6 = ((IFn)const__1.getRawRoot()).invoke(RT.get(allowed3, Keyword.intern(null, "both")));
    Object __r5789;
    Object __r5790 = and__3966__auto__6;
    if (__r5790 != null && !(__r5790 == Boolean.FALSE)) {
     Object __r5791 = null;
     {
      Object and__3966__auto__7 = RT.get(flags2, Keyword.intern(null, "at"));
      Object __r5792;
      Object __r5793 = and__3966__auto__7;
      if (__r5793 != null && !(__r5793 == Boolean.FALSE)) {
       __r5792 = RT.get(flags2, Keyword.intern(null, "colon"));
      } else {
       __r5792 = and__3966__auto__7;
      }
      __r5791 = __r5792;
     }
     __r5789 = __r5791;
    } else {
     __r5789 = and__3966__auto__6;
    }
    __r5788 = __r5789;
   }
   Object __r5794 = __r5788;
   if (__r5794 != null && !(__r5794 == Boolean.FALSE)) {
    return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("Cannot combine \"@\" and \":\" flags for format directive \"", RT.get(def1, Keyword.intern(null, "directive")), "\""), ((java.lang.Object)clojure.lang.Numbers.min(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)RT.get(flags2, Keyword.intern(null, "colon"))), (int)RT.intCast(1L)))), ((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)RT.get(flags2, Keyword.intern(null, "at"))), (int)RT.intCast(1L)))))));
   } else {
    return null;
   }
  }
 }
}
