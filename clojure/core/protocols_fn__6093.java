package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6093 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__7 = (clojure.lang.Var)RT.var("clojure.core.protocols", "internal-reduce");
 }
 public protocols_fn__6093() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object f2, java.lang.Object val3) {
  {
   Object cls4 = ((IFn)const__0.getRawRoot()).invoke(s1);
   Object s5 = s1;
   Object f6 = f2;
   Object val7 = val3;
   while(true) {
    {
     Object temp__4115__auto__8 = ((IFn)const__1.getRawRoot()).invoke(s5);
     Object __r3857 = temp__4115__auto__8;
     if (__r3857 != null && !(__r3857 == Boolean.FALSE)) {
      {
       Object s9 = temp__4115__auto__8;
       if (clojure.lang.Util.identical(((java.lang.Object)((IFn)const__0.getRawRoot()).invoke(s9)), ((java.lang.Object)cls4))) {
        {
         Object ret10 = ((IFn)f6).invoke(val7, ((IFn)const__3.getRawRoot()).invoke(s9));
         if (clojure.lang.RT.isReduced(((java.lang.Object)ret10))) {
          return ((IFn)const__5.getRawRoot()).invoke(ret10);
         } else {
          java.lang.Object s5___aux = ((IFn)const__6.getRawRoot()).invoke(s9);
          java.lang.Object val7___aux = ret10;
          s5 = s5___aux;
          val7 = val7___aux;
          continue;
         }
        }
       } else {
        Object __r3860 = s9;
        if (!(__r3860 instanceof clojure.core.protocols.InternalReduce)) {
         return ((IFn)const__7.getRawRoot()).invoke(__r3860, f6, val7);
        } else {
         return ((clojure.core.protocols.InternalReduce) __r3860).internal_reduce(((java.lang.Object)f6), ((java.lang.Object)val7));
        }
       }
      }
     } else {
      return val7;
     }
    }
   }
  }
 }
}
