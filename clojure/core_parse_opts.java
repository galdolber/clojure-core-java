package clojure;

import clojure.lang.*;

public final class core_parse_opts extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public core_parse_opts() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object opts2 = clojure.lang.PersistentArrayMap.EMPTY;
   Object G__57543 = s1;
   Object vec__57554 = G__57543;
   Object k5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57554), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object v6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__57554), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object rs7 = ((IFn)const__3.getRawRoot()).invoke(vec__57554, const__4);
   Object s8 = vec__57554;
   {
    Object opts9 = opts2;
    Object G__575410 = G__57543;
    while(true) {
     {
      Object opts11 = opts9;
      Object vec__575612 = G__575410;
      Object k13 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__575612), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object v14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__575612), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object rs15 = ((IFn)const__3.getRawRoot()).invoke(vec__575612, const__4);
      Object s16 = vec__575612;
      Object __r3705 = ((IFn)const__5.getRawRoot()).invoke(k13);
      if (__r3705 != null && !(__r3705 == Boolean.FALSE)) {
       java.lang.Object opts9___aux = ((IFn)const__6.getRawRoot()).invoke(opts11, k13, v14);
       java.lang.Object G__575410___aux = rs15;
       opts9 = opts9___aux;
       G__575410 = G__575410___aux;
       continue;
      } else {
       return RT.vector(opts11, s16);
      }
     }
    }
   }
  }
 }
}
