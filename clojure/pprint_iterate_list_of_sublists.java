package clojure;

import clojure.lang.*;

public final class pprint_iterate_list_of_sublists extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
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
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "colon-up-arrow");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_iterate_list_of_sublists() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object max_count4 = RT.get(params1, Keyword.intern(null, "max-iterations"));
   Object param_clause5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "clauses")));
   Object __r5458;
   Object __r5459 = ((IFn)const__3.getRawRoot()).invoke(param_clause5);
   if (__r5459 != null && !(__r5459 == Boolean.FALSE)) {
    __r5458 = ((IFn)const__4.getRawRoot()).invoke(navigator2);
   } else {
    __r5458 = RT.vector(param_clause5, navigator2);
   }
   Object vec__78146 = __r5458;
   Object clause7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78146), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78146), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object vec__78159 = ((IFn)const__8.getRawRoot()).invoke(navigator8);
   Object arg_list10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78159), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78159), (int)RT.intCast(1L), ((java.lang.Object)null)));
   {
    long count12 = 0L;
    Object arg_list13 = arg_list10;
    while(true) {
     Object __r5461 = null;
     {
      Object __r5462 = null;
      {
       Object and__3966__auto__14 = ((IFn)const__3.getRawRoot()).invoke(arg_list13);
       Object __r5463;
       Object __r5464 = and__3966__auto__14;
       if (__r5464 != null && !(__r5464 == Boolean.FALSE)) {
        Object __r5465 = null;
        {
         Object or__3968__auto__15 = ((IFn)const__9.getRawRoot()).invoke(RT.get(RT.get(params1, Keyword.intern(null, "right-params")), Keyword.intern(null, "colon")));
         Object __r5466;
         Object __r5467 = or__3968__auto__15;
         if (__r5467 != null && !(__r5467 == Boolean.FALSE)) {
          __r5466 = or__3968__auto__15;
         } else {
          __r5466 = (clojure.lang.Numbers.gt((long)count12, (long)0L) ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5465 = __r5466;
        }
        __r5463 = __r5465;
       } else {
        __r5463 = and__3966__auto__14;
       }
       __r5462 = __r5463;
      }
      Object or__3968__auto__16 = __r5462;
      Object __r5468;
      Object __r5469 = or__3968__auto__16;
      if (__r5469 != null && !(__r5469 == Boolean.FALSE)) {
       __r5468 = or__3968__auto__16;
      } else {
       Object __r5470 = null;
       {
        Object and__3966__auto__17 = max_count4;
        Object __r5471;
        Object __r5472 = and__3966__auto__17;
        if (__r5472 != null && !(__r5472 == Boolean.FALSE)) {
         __r5471 = (clojure.lang.Numbers.gte((long)count12, ((java.lang.Object)max_count4)) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5471 = and__3966__auto__17;
        }
        __r5470 = __r5471;
       }
       __r5468 = __r5470;
      }
      __r5461 = __r5468;
     }
     Object __r5473 = __r5461;
     if (__r5473 != null && !(__r5473 == Boolean.FALSE)) {
      return navigator11;
     } else {
      {
       Object iter_result18 = ((IFn)const__14.getRawRoot()).invoke(clause7, ((IFn)const__15.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(arg_list13)), ((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(arg_list13)));
       if (clojure.lang.Util.equiv(((java.lang.Object)const__18), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(iter_result18)))) {
        return navigator11;
       } else {
        long count12___aux = clojure.lang.Numbers.inc((long)count12);
        java.lang.Object arg_list13___aux = ((IFn)const__16.getRawRoot()).invoke(arg_list13);
        count12 = count12___aux;
        arg_list13 = arg_list13___aux;
        continue;
       }
      }
     }
    }
   }
  }
 }
}
