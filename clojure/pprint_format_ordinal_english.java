package clojure;

import clojure.lang.*;

public final class pprint_format_ordinal_english extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Keyword const__22;
 public static final clojure.lang.Var const__23;
 public static final java.lang.Object const__24;
 public static final clojure.lang.Keyword const__25;
 public static final clojure.lang.Keyword const__26;
 public static final java.lang.Object const__27;
 public static final clojure.lang.Keyword const__28;
 public static final java.lang.Object const__29;
 public static final clojure.lang.Keyword const__30;
 public static final java.lang.Object const__31;
 public static final clojure.lang.Keyword const__32;
 public static final clojure.lang.IPersistentMap const__33;
 public static final clojure.lang.Var const__34;
 public static final clojure.lang.IPersistentMap const__35;
 public static final clojure.lang.Var const__36;
 public static final java.lang.Object const__37;
 public static final clojure.lang.Var const__38;
 public static final java.lang.Object const__39;
 public static final clojure.lang.Var const__40;
 public static final java.lang.Object const__41;
 public static final clojure.lang.Var const__42;
 public static final java.lang.Object const__43;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "remainders");
  const__9 = (java.lang.Object)1000L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "english-scale-numbers");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "format-simple-cardinal");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "drop-last");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "add-english-scales");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "format-simple-ordinal");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "last");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__23 = (clojure.lang.Var)RT.var("clojure.pprint", "format-integer");
  const__24 = (java.lang.Object)10L;
  const__25 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__27 = (java.lang.Object)Character.valueOf((char)32);
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "commachar");
  const__29 = (java.lang.Object)Character.valueOf((char)44);
  const__30 = (clojure.lang.Keyword)Keyword.intern(null, "commainterval");
  const__31 = (java.lang.Object)3L;
  const__32 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__33 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), Character.valueOf((char)44), Keyword.intern(null, "colon"), Boolean.TRUE, Keyword.intern(null, "padchar"), Character.valueOf((char)32), Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 3L);
  const__34 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__35 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), 0L, Keyword.intern(null, "padchar"), 0L, Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 0L);
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__37 = (java.lang.Object)100L;
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__39 = (java.lang.Object)11L;
  const__40 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__41 = (java.lang.Object)19L;
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "==");
  const__43 = (java.lang.Object)2L;
 }
 public pprint_format_ordinal_english() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77134 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77134), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77134), (int)RT.intCast(1L), ((java.lang.Object)null)));
   if (clojure.lang.Util.equiv((long)0L, ((java.lang.Object)arg5))) {
    ((IFn)const__5.getRawRoot()).invoke("zeroth");
   } else {
    {
     Object __r5176;
     if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
      __r5176 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg5)));
     } else {
      __r5176 = arg5;
     }
     Object abs_arg7 = __r5176;
     Object parts8 = ((IFn)const__8.getRawRoot()).invoke(const__9, abs_arg7);
     if (clojure.lang.Numbers.lte((long)clojure.lang.RT.count(((java.lang.Object)parts8)), (long)clojure.lang.RT.count(((java.lang.Object)const__12.getRawRoot())))) {
      {
       Object parts_strs9 = ((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__15.getRawRoot()).invoke(parts8));
       Object head_str10 = ((IFn)const__16.getRawRoot()).invoke(parts_strs9, const__3);
       Object tail_str11 = ((IFn)const__17.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(parts8));
       Object __r5178;
       if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
        __r5178 = "minus ";
       } else {
        __r5178 = null;
       }
       Object __r5179;
       Object __r5180 = null;
       {
        Object and__3966__auto__12 = ((IFn)const__20.getRawRoot()).invoke(((IFn)const__21.getRawRoot()).invoke(head_str10));
        Object __r5181;
        Object __r5182 = and__3966__auto__12;
        if (__r5182 != null && !(__r5182 == Boolean.FALSE)) {
         __r5181 = ((IFn)const__20.getRawRoot()).invoke(((IFn)const__21.getRawRoot()).invoke(tail_str11));
        } else {
         __r5181 = and__3966__auto__12;
        }
        __r5180 = __r5181;
       }
       Object __r5183 = __r5180;
       if (__r5183 != null && !(__r5183 == Boolean.FALSE)) {
        __r5179 = ((IFn)const__19.getRawRoot()).invoke(head_str10, ", ", tail_str11);
       } else {
        Object __r5184;
        Object __r5185 = ((IFn)const__20.getRawRoot()).invoke(((IFn)const__21.getRawRoot()).invoke(head_str10));
        if (__r5185 != null && !(__r5185 == Boolean.FALSE)) {
         __r5184 = ((IFn)const__19.getRawRoot()).invoke(head_str10, "th");
        } else {
         Object __r5186;
         Object __r5187 = const__22;
         if (__r5187 != null && !(__r5187 == Boolean.FALSE)) {
          __r5186 = tail_str11;
         } else {
          __r5186 = null;
         }
         __r5184 = __r5186;
        }
        __r5179 = __r5184;
       }
       ((IFn)const__5.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(__r5178, __r5179));
      }
     } else {
      ((IFn)const__23.getRawRoot()).invoke(const__24, const__33, ((IFn)const__34.getRawRoot()).invoke(RT.vector(arg5)), const__35);
      {
       Object low_two_digits13 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)arg5), (long)100L));
       Object __r5188 = null;
       boolean or__3968__auto__14 = clojure.lang.Numbers.lt((long)11L, ((java.lang.Object)low_two_digits13));
       Object __r5189;
       if (or__3968__auto__14) {
        __r5189 = or__3968__auto__14;
       } else {
        __r5189 = clojure.lang.Numbers.gt((long)19L, ((java.lang.Object)low_two_digits13));
       }
       boolean not_teens15 = (java.lang.Boolean)__r5189;
       Object low_digit16 = ((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)low_two_digits13), (long)10L));
       Object __r5190;
       Object __r5191 = null;
       boolean and__3966__auto__17 = clojure.lang.Numbers.equiv(((java.lang.Object)low_digit16), (long)1L);
       Object __r5192;
       if (and__3966__auto__17) {
        __r5192 = not_teens15;
       } else {
        __r5192 = and__3966__auto__17;
       }
       if ((java.lang.Boolean)__r5192) {
        __r5190 = "st";
       } else {
        Object __r5193;
        Object __r5194 = null;
        boolean and__3966__auto__18 = clojure.lang.Numbers.equiv(((java.lang.Object)low_digit16), (long)2L);
        Object __r5195;
        if (and__3966__auto__18) {
         __r5195 = not_teens15;
        } else {
         __r5195 = and__3966__auto__18;
        }
        if ((java.lang.Boolean)__r5195) {
         __r5193 = "nd";
        } else {
         Object __r5196;
         Object __r5197 = null;
         boolean and__3966__auto__19 = clojure.lang.Numbers.equiv(((java.lang.Object)low_digit16), (long)3L);
         Object __r5198;
         if (and__3966__auto__19) {
          __r5198 = not_teens15;
         } else {
          __r5198 = and__3966__auto__19;
         }
         if ((java.lang.Boolean)__r5198) {
          __r5196 = "rd";
         } else {
          Object __r5199;
          Object __r5200 = const__22;
          if (__r5200 != null && !(__r5200 == Boolean.FALSE)) {
           __r5199 = "th";
          } else {
           __r5199 = null;
          }
          __r5196 = __r5199;
         }
         __r5193 = __r5196;
        }
        __r5190 = __r5193;
       }
       ((IFn)const__5.getRawRoot()).invoke(__r5190);
      }
     }
    }
   }
   return navigator6;
  }
 }
}
