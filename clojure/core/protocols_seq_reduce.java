package clojure.core;

import clojure.lang.*;

public final class protocols_seq_reduce extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core.protocols", "internal-reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public protocols_seq_reduce() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2, java.lang.Object val3) {
  {
   Object s4 = ((IFn)const__0.getRawRoot()).invoke(coll1);
   Object __r3847 = s4;
   if (!(__r3847 instanceof clojure.core.protocols.InternalReduce)) {
    return ((IFn)const__1.getRawRoot()).invoke(__r3847, f2, val3);
   } else {
    return ((clojure.core.protocols.InternalReduce) __r3847).internal_reduce(((java.lang.Object)f2), ((java.lang.Object)val3));
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2) {
  {
   Object temp__4115__auto__3 = ((IFn)const__0.getRawRoot()).invoke(coll1);
   Object __r3849 = temp__4115__auto__3;
   if (__r3849 != null && !(__r3849 == Boolean.FALSE)) {
    {
     Object s4 = temp__4115__auto__3;
     Object __r3850 = ((IFn)const__2.getRawRoot()).invoke(s4);
     if (!(__r3850 instanceof clojure.core.protocols.InternalReduce)) {
      return ((IFn)const__1.getRawRoot()).invoke(__r3850, f2, ((IFn)const__3.getRawRoot()).invoke(s4));
     } else {
      return ((clojure.core.protocols.InternalReduce) __r3850).internal_reduce(((java.lang.Object)f2), ((java.lang.Object)((IFn)const__3.getRawRoot()).invoke(s4)));
     }
    }
   } else {
    return ((IFn)f2).invoke();
   }
  }
 }
}
