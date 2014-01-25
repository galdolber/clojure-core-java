package clojure;

import clojure.lang.*;

public final class main_main extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.main", "init-dispatch");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__7 = (clojure.lang.Var)RT.var("clojure.main", "main-dispatch");
  const__8 = (clojure.lang.Var)RT.var("clojure.main", "repl-opt");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "flush");
 }
 public main_main() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  try {
   Object __r4486 = args1;
   if (__r4486 != null && !(__r4486 == Boolean.FALSE)) {
    {
     Object G__68464 = args1;
     Object vec__68475 = G__68464;
     Object opt6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68475), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object arg7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__68475), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object more8 = ((IFn)const__3.getRawRoot()).invoke(vec__68475, const__4);
     Object args9 = vec__68475;
     Object inits10 = clojure.lang.PersistentVector.EMPTY;
     {
      Object G__684611 = G__68464;
      Object inits12 = inits10;
      while(true) {
       {
        Object vec__684813 = G__684611;
        Object opt14 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__684813), (int)RT.intCast(0L), ((java.lang.Object)null)));
        Object arg15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__684813), (int)RT.intCast(1L), ((java.lang.Object)null)));
        Object more16 = ((IFn)const__3.getRawRoot()).invoke(vec__684813, const__4);
        Object args17 = vec__684813;
        Object inits18 = inits12;
        Object __r4488 = ((IFn)const__5.getRawRoot()).invoke(opt14);
        if (__r4488 != null && !(__r4488 == Boolean.FALSE)) {
         java.lang.Object G__684611___aux = more16;
         java.lang.Object inits12___aux = ((IFn)const__6.getRawRoot()).invoke(inits18, RT.vector(opt14, arg15));
         G__684611 = G__684611___aux;
         inits12 = inits12___aux;
         continue;
        } else {
         return ((IFn)((IFn)const__7.getRawRoot()).invoke(opt14)).invoke(args17, inits18);
        }
       }
      }
     }
    }
   } else {
    return ((IFn)const__8.getRawRoot()).invoke(null, null);
   }
  } finally {
   ((IFn)const__9.getRawRoot()).invoke();
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
