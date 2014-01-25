package clojure;

import clojure.lang.*;

public final class set_join extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.set", "intersection");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "keys");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "<=");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__8 = (java.lang.Object)0L;
  const__9 = (java.lang.Object)1L;
  const__10 = (clojure.lang.Var)RT.var("clojure.set", "index");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__12 = (clojure.lang.Var)RT.var("clojure.set", "map-invert");
  const__13 = (java.lang.Object)2L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "vals");
 }
 public set_join() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object xrel1, java.lang.Object yrel2, java.lang.Object km3) {
  {
   Object __r4505;
   if (clojure.lang.Numbers.lte((long)clojure.lang.RT.count(((java.lang.Object)xrel1)), (long)clojure.lang.RT.count(((java.lang.Object)yrel2)))) {
    __r4505 = RT.vector(xrel1, yrel2, ((IFn)const__12.getRawRoot()).invoke(km3));
   } else {
    __r4505 = RT.vector(yrel2, xrel1, km3);
   }
   Object vec__69004 = __r4505;
   Object r5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69004), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object s6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69004), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object k7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__69004), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object idx8 = ((IFn)const__10.getRawRoot()).invoke(r5, ((IFn)const__14.getRawRoot()).invoke(k7));
   return ((IFn)const__11.getRawRoot()).invoke(new clojure.set_join_fn__6901(k7, idx8), clojure.lang.PersistentHashSet.EMPTY, s6);
  }
 }
 public java.lang.Object invoke(java.lang.Object xrel1, java.lang.Object yrel2) {
  Object __r4507 = null;
  {
   Object and__3966__auto__3 = ((IFn)const__0.getRawRoot()).invoke(xrel1);
   Object __r4508;
   Object __r4509 = and__3966__auto__3;
   if (__r4509 != null && !(__r4509 == Boolean.FALSE)) {
    __r4508 = ((IFn)const__0.getRawRoot()).invoke(yrel2);
   } else {
    __r4508 = and__3966__auto__3;
   }
   __r4507 = __r4508;
  }
  Object __r4510 = __r4507;
  if (__r4510 != null && !(__r4510 == Boolean.FALSE)) {
   {
    Object ks4 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(xrel1))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(yrel2))));
    Object __r4511;
    if (clojure.lang.Numbers.lte((long)clojure.lang.RT.count(((java.lang.Object)xrel1)), (long)clojure.lang.RT.count(((java.lang.Object)yrel2)))) {
     __r4511 = RT.vector(xrel1, yrel2);
    } else {
     __r4511 = RT.vector(yrel2, xrel1);
    }
    Object vec__68955 = __r4511;
    Object r6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68955), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object s7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68955), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object idx8 = ((IFn)const__10.getRawRoot()).invoke(r6, ks4);
    return ((IFn)const__11.getRawRoot()).invoke(new clojure.set_join_fn__6896(ks4, idx8), clojure.lang.PersistentHashSet.EMPTY, s7);
   }
  } else {
   return clojure.lang.PersistentHashSet.EMPTY;
  }
 }
}
