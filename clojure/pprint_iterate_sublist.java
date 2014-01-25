package clojure;

import clojure.lang.*;

public final class pprint_iterate_sublist extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Keyword const__22;
 public static final clojure.lang.Var const__23;
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
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "num");
  const__11 = (java.lang.Object)(-1L);
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__20 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "up-arrow");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_iterate_sublist() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object max_count4 = RT.get(params1, Keyword.intern(null, "max-iterations"));
   Object param_clause5 = ((IFn)const__1.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "clauses")));
   Object __r5434;
   Object __r5435 = ((IFn)const__3.getRawRoot()).invoke(param_clause5);
   if (__r5435 != null && !(__r5435 == Boolean.FALSE)) {
    __r5434 = ((IFn)const__4.getRawRoot()).invoke(navigator2);
   } else {
    __r5434 = RT.vector(param_clause5, navigator2);
   }
   Object vec__78056 = __r5434;
   Object clause7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78056), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78056), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object vec__78069 = ((IFn)const__8.getRawRoot()).invoke(navigator8);
   Object arg_list10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78069), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78069), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object args12 = ((IFn)const__9.getRawRoot()).invoke(arg_list10);
   {
    long count13 = 0L;
    Object args14 = args12;
    Object last_pos15 = ((java.lang.Number)clojure.lang.Numbers.num((long)-1L));
    while(true) {
     Object __r5437 = null;
     {
      Object and__3966__auto__16 = ((IFn)const__12.getRawRoot()).invoke(max_count4);
      Object __r5438;
      Object __r5439 = and__3966__auto__16;
      if (__r5439 != null && !(__r5439 == Boolean.FALSE)) {
       Object __r5440 = null;
       {
        boolean and__3966__auto__17 = clojure.lang.Util.equiv(((java.lang.Object)RT.get(args14, Keyword.intern(null, "pos"))), ((java.lang.Object)last_pos15));
        Object __r5441;
        if (and__3966__auto__17) {
         __r5441 = (clojure.lang.Numbers.gt((long)count13, (long)1L) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5441 = (and__3966__auto__17 ? Boolean.TRUE : Boolean.FALSE);
        }
        __r5440 = (java.lang.Boolean)__r5441;
       }
       __r5438 = __r5440;
      } else {
       __r5438 = and__3966__auto__16;
      }
      __r5437 = __r5438;
     }
     Object __r5442 = __r5437;
     if (__r5442 != null && !(__r5442 == Boolean.FALSE)) {
      Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)"%{ construct not consuming any arguments: Infinite loop!")));
     } else {
     }
     Object __r5444 = null;
     {
      Object __r5445 = null;
      {
       Object and__3966__auto__18 = ((IFn)const__3.getRawRoot()).invoke(RT.get(args14, Keyword.intern(null, "rest")));
       Object __r5446;
       Object __r5447 = and__3966__auto__18;
       if (__r5447 != null && !(__r5447 == Boolean.FALSE)) {
        Object __r5448 = null;
        {
         Object or__3968__auto__19 = ((IFn)const__12.getRawRoot()).invoke(RT.get(RT.get(params1, Keyword.intern(null, "right-params")), Keyword.intern(null, "colon")));
         Object __r5449;
         Object __r5450 = or__3968__auto__19;
         if (__r5450 != null && !(__r5450 == Boolean.FALSE)) {
          __r5449 = or__3968__auto__19;
         } else {
          __r5449 = (clojure.lang.Numbers.gt((long)count13, (long)0L) ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5448 = __r5449;
        }
        __r5446 = __r5448;
       } else {
        __r5446 = and__3966__auto__18;
       }
       __r5445 = __r5446;
      }
      Object or__3968__auto__20 = __r5445;
      Object __r5451;
      Object __r5452 = or__3968__auto__20;
      if (__r5452 != null && !(__r5452 == Boolean.FALSE)) {
       __r5451 = or__3968__auto__20;
      } else {
       Object __r5453 = null;
       {
        Object and__3966__auto__21 = max_count4;
        Object __r5454;
        Object __r5455 = and__3966__auto__21;
        if (__r5455 != null && !(__r5455 == Boolean.FALSE)) {
         __r5454 = (clojure.lang.Numbers.gte((long)count13, ((java.lang.Object)max_count4)) ? Boolean.TRUE : Boolean.FALSE);
        } else {
         __r5454 = and__3966__auto__21;
        }
        __r5453 = __r5454;
       }
       __r5451 = __r5453;
      }
      __r5444 = __r5451;
     }
     Object __r5456 = __r5444;
     if (__r5456 != null && !(__r5456 == Boolean.FALSE)) {
      return navigator11;
     } else {
      {
       Object iter_result22 = ((IFn)const__20.getRawRoot()).invoke(clause7, args14, RT.get(params1, Keyword.intern(null, "base-args")));
       if (clojure.lang.Util.equiv(((java.lang.Object)const__22), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(iter_result22)))) {
        return navigator11;
       } else {
        long count13___aux = clojure.lang.Numbers.inc((long)count13);
        java.lang.Object args14___aux = iter_result22;
        java.lang.Object last_pos15___aux = RT.get(args14, Keyword.intern(null, "pos"));
        count13 = count13___aux;
        args14 = args14___aux;
        last_pos15 = last_pos15___aux;
        continue;
       }
      }
     }
    }
   }
  }
 }
}
