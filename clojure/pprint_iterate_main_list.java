package clojure;

import clojure.lang.*;

public final class pprint_iterate_main_list extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "max-iterations");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "get-format-arg");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "num");
  const__9 = (java.lang.Object)(-1L);
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__18 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_iterate_main_list() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object max_count4 = RT.get(params1, Keyword.intern(null, "max-iterations"));
   Object param_clause5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "clauses")));
   Object __r5475;
   Object __r5476 = ((IFn)const__3.getRawRoot()).invoke(param_clause5);
   if (__r5476 != null && !(__r5476 == Boolean.FALSE)) {
    __r5475 = ((IFn)const__4.getRawRoot()).invoke(navigator2);
   } else {
    __r5475 = RT.vector(param_clause5, navigator2);
   }
   Object vec__78216 = __r5475;
   Object clause7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78216), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78216), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    long count9 = 0L;
    Object navigator10 = navigator8;
    Object last_pos11 = ((java.lang.Number)clojure.lang.Numbers.num((long)-1L));
    while(true) {
     Object __r5478 = null;
     {
      Object and__3966__auto__12 = ((IFn)const__10.getRawRoot()).invoke(max_count4);
      Object __r5479;
      Object __r5480 = and__3966__auto__12;
      if (__r5480 != null && !(__r5480 == Boolean.FALSE)) {
       Object __r5481 = null;
       {
        boolean and__3966__auto__13 = clojure.lang.Util.equiv(((java.lang.Object)RT.get(navigator10, Keyword.intern(null, "pos"))), ((java.lang.Object)last_pos11));
        Object __r5482;
        if (and__3966__auto__13) {
         __r5482 = (clojure.lang.Numbers.gt((long)count9, (long)1L) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5482 = (and__3966__auto__13 ? Boolean.TRUE : Boolean.FALSE);
        }
        __r5481 = (java.lang.Boolean)__r5482;
       }
       __r5479 = __r5481;
      } else {
       __r5479 = and__3966__auto__12;
      }
      __r5478 = __r5479;
     }
     Object __r5483 = __r5478;
     if (__r5483 != null && !(__r5483 == Boolean.FALSE)) {
      Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"%@{ construct not consuming any arguments: Infinite loop!")));
     } else {
     }
     Object __r5485 = null;
     {
      Object __r5486 = null;
      {
       Object and__3966__auto__14 = ((IFn)const__3.getRawRoot()).invoke(RT.get(navigator10, Keyword.intern(null, "rest")));
       Object __r5487;
       Object __r5488 = and__3966__auto__14;
       if (__r5488 != null && !(__r5488 == Boolean.FALSE)) {
        Object __r5489 = null;
        {
         Object or__3968__auto__15 = ((IFn)const__10.getRawRoot()).invoke(RT.get(RT.get(params1, Keyword.intern(null, "right-params")), Keyword.intern(null, "colon")));
         Object __r5490;
         Object __r5491 = or__3968__auto__15;
         if (__r5491 != null && !(__r5491 == Boolean.FALSE)) {
          __r5490 = or__3968__auto__15;
         } else {
          __r5490 = (clojure.lang.Numbers.gt((long)count9, (long)0L) ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5489 = __r5490;
        }
        __r5487 = __r5489;
       } else {
        __r5487 = and__3966__auto__14;
       }
       __r5486 = __r5487;
      }
      Object or__3968__auto__16 = __r5486;
      Object __r5492;
      Object __r5493 = or__3968__auto__16;
      if (__r5493 != null && !(__r5493 == Boolean.FALSE)) {
       __r5492 = or__3968__auto__16;
      } else {
       Object __r5494 = null;
       {
        Object and__3966__auto__17 = max_count4;
        Object __r5495;
        Object __r5496 = and__3966__auto__17;
        if (__r5496 != null && !(__r5496 == Boolean.FALSE)) {
         __r5495 = (clojure.lang.Numbers.gte((long)count9, ((java.lang.Object)max_count4)) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5495 = and__3966__auto__17;
        }
        __r5494 = __r5495;
       }
       __r5492 = __r5494;
      }
      __r5485 = __r5492;
     }
     Object __r5497 = __r5485;
     if (__r5497 != null && !(__r5497 == Boolean.FALSE)) {
      return navigator10;
     } else {
      {
       Object iter_result18 = ((IFn)const__18.getRawRoot()).invoke(clause7, navigator10, RT.get(params1, Keyword.intern(null, "base-args")));
       if (clojure.lang.Util.equiv(((java.lang.Object)const__20), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(iter_result18)))) {
        return ((IFn)const__21.getRawRoot()).invoke(iter_result18);
       } else {
        long count9___aux = clojure.lang.Numbers.inc((long)count9);
        java.lang.Object navigator10___aux = iter_result18;
        java.lang.Object last_pos11___aux = RT.get(navigator10, Keyword.intern(null, "pos"));
        count9 = count9___aux;
        navigator10 = navigator10___aux;
        last_pos11 = last_pos11___aux;
        continue;
       }
      }
     }
    }
   }
  }
 }
}
