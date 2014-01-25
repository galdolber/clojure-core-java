package clojure;

import clojure.lang.*;

public final class core_sigs_asig__3887 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "&form");
  const__2 = (java.lang.Object)2L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_sigs_asig__3887() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fdecl1) {
  {
   Object arglist2 = ((IFn)const__0.getRawRoot()).invoke(fdecl1);
   Object __r2242;
   if (clojure.lang.Util.equals(((java.lang.Object)const__1), ((java.lang.Object)((IFn)const__0.getRawRoot()).invoke(arglist2)))) {
    __r2242 = ((clojure.lang.IPersistentVector)clojure.lang.RT.subvec((clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)arglist2), (int)RT.intCast(2L), (int)clojure.lang.RT.count(((java.lang.Object)arglist2))));
   } else {
    __r2242 = arglist2;
   }
   Object arglist3 = __r2242;
   Object body4 = ((IFn)const__3.getRawRoot()).invoke(fdecl1);
   Object __r2244 = ((IFn)const__4.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(body4));
   if (__r2244 != null && !(__r2244 == Boolean.FALSE)) {
    Object __r2246 = ((IFn)const__3.getRawRoot()).invoke(body4);
    if (__r2246 != null && !(__r2246 == Boolean.FALSE)) {
     Object __r2247;
     Object __r2248 = ((IFn)const__7.getRawRoot()).invoke(arglist3);
     if (__r2248 != null && !(__r2248 == Boolean.FALSE)) {
      __r2247 = ((IFn)const__7.getRawRoot()).invoke(arglist3);
     } else {
      __r2247 = clojure.lang.PersistentArrayMap.EMPTY;
     }
     return ((IFn)const__5.getRawRoot()).invoke(arglist3, ((IFn)const__6.getRawRoot()).invoke(__r2247, ((IFn)const__0.getRawRoot()).invoke(body4)));
    } else {
     return arglist3;
    }
   } else {
    return arglist3;
   }
  }
 }
}
