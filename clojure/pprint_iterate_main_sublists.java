package clojure;

import clojure.lang.*;

public final class pprint_iterate_main_sublists extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Var const__19;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "max-iterations");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "get-format-arg");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg-or-nil");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "colon-up-arrow");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_iterate_main_sublists() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object max_count4 = RT.get(params1, Keyword.intern(null, "max-iterations"));
   Object param_clause5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "clauses")));
   Object __r5499;
   Object __r5500 = ((IFn)const__3.getRawRoot()).invoke(param_clause5);
   if (__r5500 != null && !(__r5500 == Boolean.FALSE)) {
    __r5499 = ((IFn)const__4.getRawRoot()).invoke(navigator2);
   } else {
    __r5499 = RT.vector(param_clause5, navigator2);
   }
   Object vec__78296 = __r5499;
   Object clause7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78296), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78296), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    long count9 = 0L;
    Object navigator10 = navigator8;
    while(true) {
     Object __r5502 = null;
     {
      Object __r5503 = null;
      {
       Object and__3966__auto__11 = ((IFn)const__3.getRawRoot()).invoke(RT.get(navigator10, Keyword.intern(null, "rest")));
       Object __r5504;
       Object __r5505 = and__3966__auto__11;
       if (__r5505 != null && !(__r5505 == Boolean.FALSE)) {
        Object __r5506 = null;
        {
         Object or__3968__auto__12 = ((IFn)const__9.getRawRoot()).invoke(RT.get(RT.get(params1, Keyword.intern(null, "right-params")), Keyword.intern(null, "colon")));
         Object __r5507;
         Object __r5508 = or__3968__auto__12;
         if (__r5508 != null && !(__r5508 == Boolean.FALSE)) {
          __r5507 = or__3968__auto__12;
         } else {
          __r5507 = (clojure.lang.Numbers.gt((long)count9, (long)0L) ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5506 = __r5507;
        }
        __r5504 = __r5506;
       } else {
        __r5504 = and__3966__auto__11;
       }
       __r5503 = __r5504;
      }
      Object or__3968__auto__13 = __r5503;
      Object __r5509;
      Object __r5510 = or__3968__auto__13;
      if (__r5510 != null && !(__r5510 == Boolean.FALSE)) {
       __r5509 = or__3968__auto__13;
      } else {
       Object __r5511 = null;
       {
        Object and__3966__auto__14 = max_count4;
        Object __r5512;
        Object __r5513 = and__3966__auto__14;
        if (__r5513 != null && !(__r5513 == Boolean.FALSE)) {
         __r5512 = (clojure.lang.Numbers.gte((long)count9, ((java.lang.Object)max_count4)) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5512 = and__3966__auto__14;
        }
        __r5511 = __r5512;
       }
       __r5509 = __r5511;
      }
      __r5502 = __r5509;
     }
     Object __r5514 = __r5502;
     if (__r5514 != null && !(__r5514 == Boolean.FALSE)) {
      return navigator10;
     } else {
      {
       Object vec__783015 = ((IFn)const__14.getRawRoot()).invoke(navigator10);
       Object sublist16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__783015), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object navigator17 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__783015), (int)RT.intCast(1L), ((java.lang.Object)null)));
       Object iter_result18 = ((IFn)const__15.getRawRoot()).invoke(clause7, ((IFn)const__16.getRawRoot()).invoke(sublist16), navigator17);
       if (clojure.lang.Util.equiv(((java.lang.Object)const__18), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(iter_result18)))) {
        return navigator17;
       } else {
        long count9___aux = clojure.lang.Numbers.inc((long)count9);
        java.lang.Object navigator10___aux = navigator17;
        count9 = count9___aux;
        navigator10 = navigator10___aux;
        continue;
       }
      }
     }
    }
   }
  }
 }
}
