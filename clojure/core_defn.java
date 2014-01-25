package clojure;

import clojure.lang.*;

public final class core_defn extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Symbol const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Symbol.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "last");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "butlast");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "sigs");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "inline");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "fn");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
 }
 public core_defn() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object fdecl4) {
  if ((name3 instanceof clojure.lang.Symbol)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"First argument to defn must be a symbol")));
  }
  {
   Object __r2258;
   Object __r2259 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(fdecl4));
   if (__r2259 != null && !(__r2259 == Boolean.FALSE)) {
    __r2258 = RT.mapUniqueKeys(const__4, ((IFn)const__3.getRawRoot()).invoke(fdecl4));
   } else {
    __r2258 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   Object m5 = __r2258;
   Object __r2260;
   Object __r2261 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(fdecl4));
   if (__r2261 != null && !(__r2261 == Boolean.FALSE)) {
    __r2260 = ((IFn)const__5.getRawRoot()).invoke(fdecl4);
   } else {
    __r2260 = fdecl4;
   }
   Object fdecl6 = __r2260;
   Object __r2262;
   Object __r2263 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(fdecl6));
   if (__r2263 != null && !(__r2263 == Boolean.FALSE)) {
    __r2262 = ((IFn)const__7.getRawRoot()).invoke(m5, ((IFn)const__3.getRawRoot()).invoke(fdecl6));
   } else {
    __r2262 = m5;
   }
   Object m7 = __r2262;
   Object __r2264;
   Object __r2265 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(fdecl6));
   if (__r2265 != null && !(__r2265 == Boolean.FALSE)) {
    __r2264 = ((IFn)const__5.getRawRoot()).invoke(fdecl6);
   } else {
    __r2264 = fdecl6;
   }
   Object fdecl8 = __r2264;
   Object __r2266;
   Object __r2267 = ((IFn)const__8.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(fdecl8));
   if (__r2267 != null && !(__r2267 == Boolean.FALSE)) {
    __r2266 = ((IFn)const__9.getRawRoot()).invoke(fdecl8);
   } else {
    __r2266 = fdecl8;
   }
   Object fdecl9 = __r2266;
   Object __r2268;
   Object __r2269 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(fdecl9));
   if (__r2269 != null && !(__r2269 == Boolean.FALSE)) {
    __r2268 = ((IFn)const__7.getRawRoot()).invoke(m7, ((IFn)const__10.getRawRoot()).invoke(fdecl9));
   } else {
    __r2268 = m7;
   }
   Object m10 = __r2268;
   Object __r2270;
   Object __r2271 = ((IFn)const__6.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(fdecl9));
   if (__r2271 != null && !(__r2271 == Boolean.FALSE)) {
    __r2270 = ((IFn)const__11.getRawRoot()).invoke(fdecl9);
   } else {
    __r2270 = fdecl9;
   }
   Object fdecl11 = __r2270;
   Object m12 = ((IFn)const__7.getRawRoot()).invoke(RT.mapUniqueKeys(const__12, ((IFn)const__9.getRawRoot()).invoke(const__13, ((IFn)const__14.getRawRoot()).invoke(fdecl11))), m10);
   Object __r2272 = null;
   {
    Object inline13 = RT.get(m12, Keyword.intern(null, "inline"));
    Object ifn14 = ((IFn)const__3.getRawRoot()).invoke(inline13);
    Object iname15 = ((IFn)const__16.getRawRoot()).invoke(inline13);
    Object __r2273;
    Object __r2274;
    if (clojure.lang.Util.equiv(((java.lang.Object)const__17), ((java.lang.Object)ifn14))) {
     Object __r2275;
     if ((iname15 instanceof clojure.lang.Symbol)) {
      __r2275 = Boolean.FALSE;
     } else {
      __r2275 = Boolean.TRUE;
     }
     __r2274 = __r2275;
    } else {
     __r2274 = null;
    }
    Object __r2276 = __r2274;
    if (__r2276 != null && !(__r2276 == Boolean.FALSE)) {
     __r2273 = ((IFn)const__18.getRawRoot()).invoke(m12, const__15, ((IFn)const__19.getRawRoot()).invoke(ifn14, ((IFn)const__19.getRawRoot()).invoke(((clojure.lang.Symbol)clojure.lang.Symbol.intern((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)((clojure.lang.Symbol)name3).getName())).concat((java.lang.String)((java.lang.String)"__inliner")))))), ((IFn)const__5.getRawRoot()).invoke(inline13))));
    } else {
     __r2273 = m12;
    }
    __r2272 = __r2273;
   }
   Object m16 = __r2272;
   Object __r2277;
   Object __r2278 = ((IFn)const__20.getRawRoot()).invoke(name3);
   if (__r2278 != null && !(__r2278 == Boolean.FALSE)) {
    __r2277 = ((IFn)const__20.getRawRoot()).invoke(name3);
   } else {
    __r2277 = clojure.lang.PersistentArrayMap.EMPTY;
   }
   Object m17 = ((IFn)const__7.getRawRoot()).invoke(__r2277, m16);
   return ((IFn)const__9.getRawRoot()).invoke(const__21, ((IFn)const__22.getRawRoot()).invoke(name3, m17), ((IFn)const__19.getRawRoot()).invoke(const__23, fdecl11));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
