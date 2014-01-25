package clojure;

import clojure.lang.*;

public final class core_intern extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_intern() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object name2, java.lang.Object val3) {
  {
   Object v4 = ((clojure.lang.Var)clojure.lang.Var.intern((clojure.lang.Namespace)((clojure.lang.Namespace)((IFn)const__0.getRawRoot()).invoke(ns1)), (clojure.lang.Symbol)((clojure.lang.Symbol)name2), ((java.lang.Object)val3)));
   Object __r3243 = ((IFn)const__1.getRawRoot()).invoke(name2);
   if (__r3243 != null && !(__r3243 == Boolean.FALSE)) {
    ((clojure.lang.Var)v4).setMeta((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((IFn)const__1.getRawRoot()).invoke(name2)));
   } else {
   }
   return v4;
  }
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object name2) {
  {
   Object v3 = ((clojure.lang.Var)clojure.lang.Var.intern((clojure.lang.Namespace)((clojure.lang.Namespace)((IFn)const__0.getRawRoot()).invoke(ns1)), (clojure.lang.Symbol)((clojure.lang.Symbol)name2)));
   Object __r3245 = ((IFn)const__1.getRawRoot()).invoke(name2);
   if (__r3245 != null && !(__r3245 == Boolean.FALSE)) {
    ((clojure.lang.Var)v3).setMeta((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)((IFn)const__1.getRawRoot()).invoke(name2)));
   } else {
   }
   return v3;
  }
 }
}
