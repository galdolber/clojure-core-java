package clojure;

import clojure.lang.*;

public final class pprint_justify_clauses extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Keyword const__22;
 public static final clojure.lang.Keyword const__23;
 public static final clojure.lang.Keyword const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Keyword const__32;
 public static final clojure.lang.Var const__33;
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.Keyword const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Var const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 public static final clojure.lang.Var const__40;
 public static final clojure.lang.Var const__41;
 public static final clojure.lang.Var const__42;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "render-clauses");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (java.lang.Object)1L;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "else-params");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "realize-parameter-list");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "min-remaining");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "max-columns");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "get-max-column");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "minpad");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "colinc");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "*");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__32 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__33 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__34 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__40 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__41 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
 }
 public pprint_justify_clauses() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object __r5522 = null;
   {
    Object temp__4117__auto__4 = RT.get(params1, Keyword.intern(null, "else"));
    Object __r5523;
    Object __r5524 = temp__4117__auto__4;
    if (__r5524 != null && !(__r5524 == Boolean.FALSE)) {
     Object __r5525 = null;
     {
      Object else5 = temp__4117__auto__4;
      __r5525 = ((IFn)const__1.getRawRoot()).invoke(else5, navigator2, RT.get(params1, Keyword.intern(null, "base-args")));
     }
     __r5523 = __r5525;
    } else {
     __r5523 = null;
    }
    __r5522 = __r5523;
   }
   Object vec__78416 = __r5522;
   Object vec__78427 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78416), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object eol_str8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78427), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object new_navigator9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__78416), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5526 = null;
   {
    Object or__3968__auto__10 = new_navigator9;
    Object __r5527;
    Object __r5528 = or__3968__auto__10;
    if (__r5528 != null && !(__r5528 == Boolean.FALSE)) {
     __r5527 = or__3968__auto__10;
    } else {
     __r5527 = navigator2;
    }
    __r5526 = __r5527;
   }
   Object navigator11 = __r5526;
   Object __r5529 = null;
   {
    Object temp__4117__auto__12 = RT.get(params1, Keyword.intern(null, "else-params"));
    Object __r5530;
    Object __r5531 = temp__4117__auto__12;
    if (__r5531 != null && !(__r5531 == Boolean.FALSE)) {
     Object __r5532 = null;
     {
      Object p13 = temp__4117__auto__12;
      __r5532 = ((IFn)const__7.getRawRoot()).invoke(p13, navigator11);
     }
     __r5530 = __r5532;
    } else {
     __r5530 = null;
    }
    __r5529 = __r5530;
   }
   Object vec__784314 = __r5529;
   Object else_params15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__784314), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object new_navigator16 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__784314), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5533 = null;
   {
    Object or__3968__auto__17 = new_navigator16;
    Object __r5534;
    Object __r5535 = or__3968__auto__17;
    if (__r5535 != null && !(__r5535 == Boolean.FALSE)) {
     __r5534 = or__3968__auto__17;
    } else {
     __r5534 = navigator11;
    }
    __r5533 = __r5534;
   }
   Object navigator18 = __r5533;
   Object __r5536 = null;
   {
    Object or__3968__auto__19 = ((IFn)const__8.getRawRoot()).invoke(RT.get(else_params15, Keyword.intern(null, "min-remaining")));
    Object __r5537;
    Object __r5538 = or__3968__auto__19;
    if (__r5538 != null && !(__r5538 == Boolean.FALSE)) {
     __r5537 = or__3968__auto__19;
    } else {
     __r5537 = const__4;
    }
    __r5536 = __r5537;
   }
   Object min_remaining20 = __r5536;
   Object __r5539 = null;
   {
    Object or__3968__auto__21 = ((IFn)const__8.getRawRoot()).invoke(RT.get(else_params15, Keyword.intern(null, "max-columns")));
    Object __r5540;
    Object __r5541 = or__3968__auto__21;
    if (__r5541 != null && !(__r5541 == Boolean.FALSE)) {
     __r5540 = or__3968__auto__21;
    } else {
     __r5540 = ((IFn)const__11.getRawRoot()).invoke(const__12.get());
    }
    __r5539 = __r5540;
   }
   Object max_columns22 = __r5539;
   Object clauses23 = RT.get(params1, Keyword.intern(null, "clauses"));
   Object vec__784424 = ((IFn)const__1.getRawRoot()).invoke(clauses23, navigator18, RT.get(params1, Keyword.intern(null, "base-args")));
   Object strs25 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__784424), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator26 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__784424), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5542;
   Object __r5543 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5543 != null && !(__r5543 == Boolean.FALSE)) {
    __r5542 = 1L;
   } else {
    __r5542 = 0L;
   }
   Object __r5544;
   Object __r5545 = RT.get(params1, Keyword.intern(null, "at"));
   if (__r5545 != null && !(__r5545 == Boolean.FALSE)) {
    __r5544 = 1L;
   } else {
    __r5544 = 0L;
   }
   long slots27 = clojure.lang.Numbers.max((long)1L, (long)clojure.lang.Numbers.add((long)clojure.lang.Numbers.add((long)clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)strs25))), (long)(java.lang.Long)__r5542), (long)(java.lang.Long)__r5544));
   Object chars28 = ((IFn)const__20.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__21.getRawRoot()).invoke(const__17.getRawRoot(), strs25));
   Object mincol29 = RT.get(params1, Keyword.intern(null, "mincol"));
   Object minpad30 = RT.get(params1, Keyword.intern(null, "minpad"));
   Object colinc31 = RT.get(params1, Keyword.intern(null, "colinc"));
   Object minout32 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)chars28), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.multiply((long)slots27, ((java.lang.Object)minpad30))))));
   Object __r5546;
   if (clojure.lang.Numbers.lte(((java.lang.Object)minout32), ((java.lang.Object)mincol29))) {
    __r5546 = mincol29;
   } else {
    __r5546 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)mincol29), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.multiply(((java.lang.Object)colinc31), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add((long)1L, ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)minout32), ((java.lang.Object)mincol29)))), (long)1L))), ((java.lang.Object)colinc31))))))))))));
   }
   Object result_columns33 = __r5546;
   Object total_pad34 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)result_columns33), ((java.lang.Object)chars28)));
   Object pad35 = ((java.lang.Object)clojure.lang.Numbers.max(((java.lang.Object)minpad30), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)total_pad34), (long)slots27)))));
   Object extra_pad36 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)total_pad34), ((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.multiply(((java.lang.Object)pad35), (long)slots27)))));
   Object pad_str37 = ((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__31.getRawRoot()).invoke(pad35, RT.get(params1, Keyword.intern(null, "padchar"))));
   Object __r5548 = null;
   {
    Object and__3966__auto__38 = eol_str8;
    Object __r5549;
    Object __r5550 = and__3966__auto__38;
    if (__r5550 != null && !(__r5550 == Boolean.FALSE)) {
     __r5549 = (clojure.lang.Numbers.gt(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((IFn)const__34.getRawRoot()).invoke(RT.get(((IFn)const__36.getRawRoot()).invoke(((IFn)const__36.getRawRoot()).invoke(const__12.get())), Keyword.intern(null, "base")))), ((java.lang.Object)min_remaining20)))), ((java.lang.Object)result_columns33)))), ((java.lang.Object)max_columns22)) ? Boolean.TRUE : Boolean.FALSE);
    } else {
     __r5549 = and__3966__auto__38;
    }
    __r5548 = __r5549;
   }
   Object __r5551 = __r5548;
   if (__r5551 != null && !(__r5551 == Boolean.FALSE)) {
    ((IFn)const__37.getRawRoot()).invoke(eol_str8);
   } else {
   }
   {
    long slots39 = slots27;
    Object extra_pad40 = extra_pad36;
    Object strs41 = strs25;
    Object __r5552 = null;
    {
     Object or__3968__auto__42 = RT.get(params1, Keyword.intern(null, "colon"));
     Object __r5553;
     Object __r5554 = or__3968__auto__42;
     if (__r5554 != null && !(__r5554 == Boolean.FALSE)) {
      __r5553 = or__3968__auto__42;
     } else {
      Object __r5555 = null;
      {
       boolean and__3966__auto__43 = clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)strs41)), (long)1L);
       Object __r5556;
       if (and__3966__auto__43) {
        __r5556 = ((IFn)const__39.getRawRoot()).invoke(RT.get(params1, Keyword.intern(null, "at")));
       } else {
        __r5556 = (and__3966__auto__43 ? Boolean.TRUE : Boolean.FALSE);
       }
       __r5555 = __r5556;
      }
      __r5553 = __r5555;
     }
     __r5552 = __r5553;
    }
    Object pad_only44 = __r5552;
    while(true) {
     Object __r5558 = ((IFn)const__40.getRawRoot()).invoke(strs41);
     if (__r5558 != null && !(__r5558 == Boolean.FALSE)) {
      Object __r5559;
      Object __r5560 = ((IFn)const__39.getRawRoot()).invoke(pad_only44);
      if (__r5560 != null && !(__r5560 == Boolean.FALSE)) {
       __r5559 = ((IFn)const__8.getRawRoot()).invoke(strs41);
      } else {
       __r5559 = null;
      }
      Object __r5561;
      Object __r5562 = null;
      {
       Object or__3968__auto__45 = pad_only44;
       Object __r5563;
       Object __r5564 = or__3968__auto__45;
       if (__r5564 != null && !(__r5564 == Boolean.FALSE)) {
        __r5563 = or__3968__auto__45;
       } else {
        Object __r5565 = null;
        {
         Object or__3968__auto__46 = ((IFn)const__41.getRawRoot()).invoke(strs41);
         Object __r5566;
         Object __r5567 = or__3968__auto__46;
         if (__r5567 != null && !(__r5567 == Boolean.FALSE)) {
          __r5566 = or__3968__auto__46;
         } else {
          __r5566 = RT.get(params1, Keyword.intern(null, "at"));
         }
         __r5565 = __r5566;
        }
        __r5563 = __r5565;
       }
       __r5562 = __r5563;
      }
      Object __r5568 = __r5562;
      if (__r5568 != null && !(__r5568 == Boolean.FALSE)) {
       __r5561 = pad_str37;
      } else {
       __r5561 = null;
      }
      Object __r5569;
      if (clojure.lang.Numbers.isPos(((java.lang.Object)extra_pad40))) {
       __r5569 = RT.get(params1, Keyword.intern(null, "padchar"));
      } else {
       __r5569 = null;
      }
      ((IFn)const__37.getRawRoot()).invoke(((IFn)const__30.getRawRoot()).invoke(__r5559, __r5561, __r5569));
      long slots39___aux = clojure.lang.Numbers.dec((long)slots39);
      java.lang.Object extra_pad40___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)extra_pad40)));
      Object __r5570;
      Object __r5571 = pad_only44;
      if (__r5571 != null && !(__r5571 == Boolean.FALSE)) {
       __r5570 = strs41;
      } else {
       __r5570 = ((IFn)const__41.getRawRoot()).invoke(strs41);
      }
      java.lang.Object strs41___aux = __r5570;
      java.lang.Object pad_only44___aux = Boolean.FALSE;
      slots39 = slots39___aux;
      extra_pad40 = extra_pad40___aux;
      strs41 = strs41___aux;
      pad_only44 = pad_only44___aux;
      continue;
     } else {
     }
     break;
    }
   }
   return navigator26;
  }
 }
}
