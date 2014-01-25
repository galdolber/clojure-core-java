package clojure;

import clojure.lang.*;

public final class pprint_format_roman extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
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
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Keyword const__22;
 public static final java.lang.Object const__23;
 public static final clojure.lang.Keyword const__24;
 public static final java.lang.Object const__25;
 public static final clojure.lang.Keyword const__26;
 public static final java.lang.Object const__27;
 public static final clojure.lang.Keyword const__28;
 public static final clojure.lang.IPersistentMap const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.IPersistentMap const__31;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "number?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (java.lang.Object)4000L;
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "remainders");
  const__9 = (java.lang.Object)10L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__20 = (clojure.lang.Var)RT.var("clojure.pprint", "format-integer");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "mincol");
  const__22 = (clojure.lang.Keyword)Keyword.intern(null, "padchar");
  const__23 = (java.lang.Object)Character.valueOf((char)32);
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "commachar");
  const__25 = (java.lang.Object)Character.valueOf((char)44);
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "commainterval");
  const__27 = (java.lang.Object)3L;
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__29 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), Character.valueOf((char)44), Keyword.intern(null, "colon"), Boolean.TRUE, Keyword.intern(null, "padchar"), Character.valueOf((char)32), Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 3L);
  const__30 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__31 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "commachar"), 0L, Keyword.intern(null, "padchar"), 0L, Keyword.intern(null, "mincol"), 0L, Keyword.intern(null, "commainterval"), 0L);
 }
 public pprint_format_roman() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object table1, java.lang.Object params2, java.lang.Object navigator3, java.lang.Object offsets4) {
  {
   Object vec__77205 = ((IFn)const__0.getRawRoot()).invoke(navigator3);
   Object arg6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77205), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__77205), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5202 = null;
   {
    Object and__3966__auto__8 = ((IFn)const__4.getRawRoot()).invoke(arg6);
    Object __r5203;
    Object __r5204 = and__3966__auto__8;
    if (__r5204 != null && !(__r5204 == Boolean.FALSE)) {
     Object __r5205 = null;
     {
      boolean and__3966__auto__9 = clojure.lang.Numbers.gt(((java.lang.Object)arg6), (long)0L);
      Object __r5206;
      if (and__3966__auto__9) {
       __r5206 = (clojure.lang.Numbers.lt(((java.lang.Object)arg6), (long)4000L) ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r5206 = (and__3966__auto__9 ? Boolean.TRUE : Boolean.FALSE);
      }
      __r5205 = (java.lang.Boolean)__r5206;
     }
     __r5203 = __r5205;
    } else {
     __r5203 = and__3966__auto__8;
    }
    __r5202 = __r5203;
   }
   Object __r5207 = __r5202;
   if (__r5207 != null && !(__r5207 == Boolean.FALSE)) {
    {
     Object digits10 = ((IFn)const__8.getRawRoot()).invoke(const__9, arg6);
     {
      Object acc11 = clojure.lang.PersistentVector.EMPTY;
      long pos12 = clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)digits10)));
      Object digits13 = digits10;
      while(true) {
       Object __r5209 = ((IFn)const__12.getRawRoot()).invoke(digits13);
       if (__r5209 != null && !(__r5209 == Boolean.FALSE)) {
        ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), acc11));
       } else {
        {
         Object digit14 = ((IFn)const__16.getRawRoot()).invoke(digits13);
         Object __r5210;
         if (clojure.lang.Util.equiv((long)0L, ((java.lang.Object)digit14))) {
          __r5210 = acc11;
         } else {
          __r5210 = ((IFn)const__18.getRawRoot()).invoke(acc11, ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)table1), (int)RT.intCast(pos12)))), (int)RT.intCast(((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)digit14)))))));
         }
         java.lang.Object acc11___aux = __r5210;
         long pos12___aux = clojure.lang.Numbers.dec((long)pos12);
         java.lang.Object digits13___aux = ((IFn)const__19.getRawRoot()).invoke(digits13);
         acc11 = acc11___aux;
         pos12 = pos12___aux;
         digits13 = digits13___aux;
         continue;
        }
       }
       break;
      }
     }
    }
   } else {
    ((IFn)const__20.getRawRoot()).invoke(const__9, const__29, ((IFn)const__30.getRawRoot()).invoke(RT.vector(arg6)), const__31);
   }
   return navigator7;
  }
 }
}
