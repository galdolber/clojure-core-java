package clojure;

import clojure.lang.*;

public final class pprint_fn__8011_fn__8012 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.IPersistentStack const__4;
 public static final clojure.lang.IPersistentStack const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "relative-reposition");
  const__2 = (java.lang.Object)(-1L);
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__4 = (clojure.lang.IPersistentStack)RT.vector("y", "ies");
  const__5 = (clojure.lang.IPersistentStack)RT.vector("", "s");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__8 = (java.lang.Object)0L;
  const__9 = (java.lang.Object)1L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "second");
 }
 public pprint_fn__8011_fn__8012() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  {
   Object __r5659;
   Object __r5660 = RT.get(params1, Keyword.intern(null, "colon"));
   if (__r5660 != null && !(__r5660 == Boolean.FALSE)) {
    __r5659 = ((IFn)const__1.getRawRoot()).invoke(navigator2, const__2);
   } else {
    __r5659 = navigator2;
   }
   Object navigator4 = __r5659;
   Object __r5661;
   Object __r5662 = RT.get(params1, Keyword.intern(null, "at"));
   if (__r5662 != null && !(__r5662 == Boolean.FALSE)) {
    __r5661 = const__4;
   } else {
    __r5661 = const__5;
   }
   Object strs5 = __r5661;
   Object vec__80136 = ((IFn)const__6.getRawRoot()).invoke(navigator4);
   Object arg7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80136), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object navigator8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__80136), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r5663;
   if (clojure.lang.Util.equiv(((java.lang.Object)arg7), (long)1L)) {
    __r5663 = ((IFn)const__12.getRawRoot()).invoke(strs5);
   } else {
    __r5663 = ((IFn)const__13.getRawRoot()).invoke(strs5);
   }
   ((IFn)const__10.getRawRoot()).invoke(__r5663);
   return navigator8;
  }
 }
}
