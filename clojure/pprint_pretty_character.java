package clojure;

import clojure.lang.*;

public final class pprint_pretty_character extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Keyword const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__6 = (java.lang.Object)127L;
  const__7 = (java.lang.Object)128L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "special-chars");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__13 = (java.lang.Object)32L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__17 = (java.lang.Object)64L;
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public pprint_pretty_character() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object vec__77264 = ((IFn)const__0.getRawRoot()).invoke(navigator2);
   Object c5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77264), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77264), (int)RT.intCast(1L), ((java.lang.Object)null)));
   int as_int7 = clojure.lang.RT.intCast(((java.lang.Object)c5));
   long base_char8 = clojure.lang.Numbers.and((long)as_int7, (long)127L);
   long meta9 = clojure.lang.Numbers.and((long)as_int7, (long)128L);
   Object special10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__9.getRawRoot()), ((java.lang.Object)Numbers.num(base_char8))));
   if (clojure.lang.Numbers.gt((long)meta9, (long)0L)) {
    ((IFn)const__11.getRawRoot()).invoke("Meta-");
   } else {
   }
   Object __r5212;
   Object __r5213 = special10;
   if (__r5213 != null && !(__r5213 == Boolean.FALSE)) {
    __r5212 = special10;
   } else {
    Object __r5214;
    if (clojure.lang.Numbers.lt((long)base_char8, (long)32L)) {
     __r5214 = ((IFn)const__14.getRawRoot()).invoke("Control-", Character.valueOf(clojure.lang.RT.charCast((long)clojure.lang.Numbers.add((long)base_char8, (long)64L))));
    } else {
     Object __r5215;
     if (clojure.lang.Util.equiv((long)base_char8, (long)127L)) {
      __r5215 = "Control-?";
     } else {
      Object __r5216;
      Object __r5217 = const__19;
      if (__r5217 != null && !(__r5217 == Boolean.FALSE)) {
       __r5216 = Character.valueOf(clojure.lang.RT.charCast((long)base_char8));
      } else {
       __r5216 = null;
      }
      __r5215 = __r5216;
     }
     __r5214 = __r5215;
    }
    __r5212 = __r5214;
   }
   ((IFn)const__11.getRawRoot()).invoke(__r5212);
   return navigator6;
  }
 }
}
