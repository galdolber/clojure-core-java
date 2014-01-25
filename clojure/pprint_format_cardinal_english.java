package clojure;

import clojure.lang.*;

public final class pprint_format_cardinal_english extends clojure.lang.AFunction {
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
 public static final java.lang.Object const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Keyword const__20;
 public static final java.lang.Object const__21;
 public static final clojure.lang.Keyword const__22;
 public static final java.lang.Object const__23;
 public static final clojure.lang.Keyword const__24;
 public static final java.lang.Object const__25;
 public static final clojure.lang.Keyword const__26;
 public static final clojure.lang.IPersistentMap const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.IPersistentMap const__29;
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
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "add-english-scales");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "format-integer");
  const__18 = (java.lang.Object)10L;
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__21 = (java.lang.Object)Character.valueOf((char)32);
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "commachar");
  const__23 = (java.lang.Object)Character.valueOf((char)44);
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "commainterval");
  const__25 = (java.lang.Object)3L;
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__27 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), Character.valueOf((char)44), Keyword.intern(null, "colon"), Boolean.TRUE, Keyword.intern(null, "padchar"), Character.valueOf((char)32), Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 3L);
  const__28 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__29 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), 0L, Keyword.intern(null, "padchar"), 0L, Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 0L);
 }
 public pprint_format_cardinal_english() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77074 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object arg5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77074), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77074), (int)RT.intCast(1L), ((java.lang.Object)null)));
   if (clojure.lang.Util.equiv((long)0L, ((java.lang.Object)arg5))) {
    ((IFn)const__5.getRawRoot()).invoke("zero");
   } else {
    {
     Object __r5155;
     if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
      __r5155 = ((java.lang.Number)clojure.lang.Numbers.minus(((java.lang.Object)arg5)));
     } else {
      __r5155 = arg5;
     }
     Object abs_arg7 = __r5155;
     Object parts8 = ((IFn)const__8.getRawRoot()).invoke(const__9, abs_arg7);
     if (clojure.lang.Numbers.lte((long)clojure.lang.RT.count(((java.lang.Object)parts8)), (long)clojure.lang.RT.count(((java.lang.Object)const__12.getRawRoot())))) {
      {
       Object parts_strs9 = ((IFn)const__13.getRawRoot()).invoke(const__14.getRawRoot(), parts8);
       Object full_str10 = ((IFn)const__15.getRawRoot()).invoke(parts_strs9, const__2);
       Object __r5157;
       if (clojure.lang.Numbers.isNeg(((java.lang.Object)arg5))) {
        __r5157 = "minus ";
       } else {
        __r5157 = null;
       }
       ((IFn)const__5.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(__r5157, full_str10));
      }
     } else {
      ((IFn)const__17.getRawRoot()).invoke(const__18, const__27, ((IFn)const__28.getRawRoot()).invoke(RT.vector(arg5)), const__29);
     }
    }
   }
   return navigator6;
  }
 }
}
