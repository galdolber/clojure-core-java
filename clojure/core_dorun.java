package clojure;

import clojure.lang.*;

public final class core_dorun extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "dec");
 }
 public core_dorun() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  while(true) {
   Object __r2561 = null;
   {
    Object and__3966__auto__3 = ((IFn)const__0.getRawRoot()).invoke(coll2);
    Object __r2562;
    Object __r2563 = and__3966__auto__3;
    if (__r2563 != null && !(__r2563 == Boolean.FALSE)) {
     __r2562 = (clojure.lang.Numbers.isPos(((java.lang.Object)n1)) ? Boolean.TRUE : Boolean.FALSE);
    } else {
     __r2562 = and__3966__auto__3;
    }
    __r2561 = __r2562;
   }
   Object __r2564 = __r2561;
   if (__r2564 != null && !(__r2564 == Boolean.FALSE)) {
    java.lang.Object n1___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)n1)));
    java.lang.Object coll2___aux = ((IFn)const__1.getRawRoot()).invoke(coll2);
    n1 = n1___aux;
    coll2 = coll2___aux;
    continue;
   } else {
    return null;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  while(true) {
   Object __r2566 = ((IFn)const__0.getRawRoot()).invoke(coll1);
   if (__r2566 != null && !(__r2566 == Boolean.FALSE)) {
    java.lang.Object coll1___aux = ((IFn)const__1.getRawRoot()).invoke(coll1);
    coll1 = coll1___aux;
    continue;
   } else {
    return null;
   }
  }
 }
}
