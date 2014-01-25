package clojure;

import clojure.lang.*;

public final class core_proxy_fn__5335 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object fs5;
 public core_proxy_fn__5335(final Object fs5) {
  super();
  this.fs5 = fs5;
 }
 public java.lang.Object invoke() {
  {
   Object fmap1 = clojure.lang.PersistentArrayMap.EMPTY;
   Object fs2 = this.fs5;
   while(true) {
    Object __r3397 = fs2;
    if (__r3397 != null && !(__r3397 == Boolean.FALSE)) {
     {
      Object vec__53363 = ((IFn)const__0.getRawRoot()).invoke(fs2);
      Object sym4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__53363), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object meths5 = ((IFn)const__3.getRawRoot()).invoke(vec__53363, const__4);
      Object __r3398;
      Object __r3399 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(meths5));
      if (__r3399 != null && !(__r3399 == Boolean.FALSE)) {
       __r3398 = ((IFn)const__6.getRawRoot()).invoke(meths5);
      } else {
       __r3398 = meths5;
      }
      Object meths6 = __r3398;
      Object meths7 = ((IFn)const__7.getRawRoot()).invoke(new clojure.core_proxy_fn__5335_fn__5338(), meths6);
      Object __r3401 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(fmap1, ((IFn)const__10.getRawRoot()).invoke(sym4)));
      if (__r3401 != null && !(__r3401 == Boolean.FALSE)) {
       java.lang.Object fmap1___aux = ((IFn)const__11.getRawRoot()).invoke(fmap1, ((IFn)const__10.getRawRoot()).invoke(sym4), ((IFn)const__12.getRawRoot()).invoke(const__13, meths7));
       java.lang.Object fs2___aux = ((IFn)const__14.getRawRoot()).invoke(fs2);
       fmap1 = fmap1___aux;
       fs2 = fs2___aux;
       continue;
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__15.getRawRoot()).invoke("Method '", ((IFn)const__10.getRawRoot()).invoke(sym4), "' redefined"))));
       return null;
      }
     }
    } else {
     return fmap1;
    }
   }
  }
 }
}
