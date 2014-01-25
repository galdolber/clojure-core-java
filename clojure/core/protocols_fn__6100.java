package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6100 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core.protocols", "internal-reduce");
 }
 public protocols_fn__6100() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object f2, java.lang.Object val3) {
  while(true) {
   {
    Object temp__4115__auto__4 = ((IFn)const__0.getRawRoot()).invoke(s1);
    Object __r3866 = temp__4115__auto__4;
    if (__r3866 != null && !(__r3866 == Boolean.FALSE)) {
     {
      Object s5 = temp__4115__auto__4;
      Object __r3868 = ((IFn)const__1.getRawRoot()).invoke(s5);
      if (__r3868 != null && !(__r3868 == Boolean.FALSE)) {
       {
        Object ret6 = ((java.lang.Object)((clojure.lang.IChunk)((IFn)const__2.getRawRoot()).invoke(s5)).reduce((clojure.lang.IFn)((clojure.lang.IFn)f2), ((java.lang.Object)val3)));
        if (clojure.lang.RT.isReduced(((java.lang.Object)ret6))) {
         return ((IFn)const__4.getRawRoot()).invoke(ret6);
        } else {
         java.lang.Object s1___aux = ((IFn)const__5.getRawRoot()).invoke(s5);
         java.lang.Object val3___aux = ret6;
         s1 = s1___aux;
         val3 = val3___aux;
         continue;
        }
       }
      } else {
       Object __r3870 = s5;
       if (!(__r3870 instanceof clojure.core.protocols.InternalReduce)) {
        return ((IFn)const__6.getRawRoot()).invoke(__r3870, f2, val3);
       } else {
        return ((clojure.core.protocols.InternalReduce) __r3870).internal_reduce(((java.lang.Object)f2), ((java.lang.Object)val3));
       }
      }
     }
    } else {
     return val3;
    }
   }
  }
 }
}
