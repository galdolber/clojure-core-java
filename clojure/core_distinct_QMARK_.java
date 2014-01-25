package clojure;

import clojure.lang.*;

public final class core_distinct_QMARK_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_distinct_QMARK_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  Object __r3103 = ((IFn)const__2.getRawRoot()).invoke(x1, y2);
  if (__r3103 != null && !(__r3103 == Boolean.FALSE)) {
   {
    Object s4 = RT.set(y2, x1);
    Object G__49225 = more3;
    Object vec__49236 = G__49225;
    Object x7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__49236), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object etc8 = ((IFn)const__5.getRawRoot()).invoke(vec__49236, const__6);
    Object xs9 = vec__49236;
    {
     Object s10 = s4;
     Object G__492211 = G__49225;
     while(true) {
      {
       Object s12 = s10;
       Object vec__492413 = G__492211;
       Object x14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__492413), (int)RT.intCast(0L), ((java.lang.Object)null)));
       Object etc15 = ((IFn)const__5.getRawRoot()).invoke(vec__492413, const__6);
       Object xs16 = vec__492413;
       Object __r3105 = xs16;
       if (__r3105 != null && !(__r3105 == Boolean.FALSE)) {
        Object __r3107 = ((IFn)const__7.getRawRoot()).invoke(s12, x14);
        if (__r3107 != null && !(__r3107 == Boolean.FALSE)) {
         return Boolean.FALSE;
        } else {
         java.lang.Object s10___aux = ((IFn)const__8.getRawRoot()).invoke(s12, x14);
         java.lang.Object G__492211___aux = etc15;
         s10 = s10___aux;
         G__492211 = G__492211___aux;
         continue;
        }
       } else {
        return Boolean.TRUE;
       }
      }
     }
    }
   }
  } else {
   return Boolean.FALSE;
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return ((IFn)const__0.getRawRoot()).invoke((clojure.lang.Util.equiv(((java.lang.Object)x1), ((java.lang.Object)y2)) ? Boolean.TRUE : Boolean.FALSE));
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 2;
 }
}
