package clojure.core;

import clojure.lang.*;

public final class protocols_fn__6081 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduced?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
 }
 public protocols_fn__6081() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2, java.lang.Object val3) {
  {
   Object iter4 = ((java.util.Iterator)((java.lang.Iterable)coll1).iterator());
   {
    Object ret5 = val3;
    while(true) {
     if (((java.util.Iterator)iter4).hasNext()) {
      {
       Object ret6 = ((IFn)f2).invoke(ret5, ((java.lang.Object)((java.util.Iterator)iter4).next()));
       if (clojure.lang.RT.isReduced(((java.lang.Object)ret6))) {
        return ((IFn)const__1.getRawRoot()).invoke(ret6);
       } else {
        java.lang.Object ret5___aux = ret6;
        ret5 = ret5___aux;
        continue;
       }
      }
     } else {
      return ret5;
     }
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object f2) {
  {
   Object iter3 = ((java.util.Iterator)((java.lang.Iterable)coll1).iterator());
   if (((java.util.Iterator)iter3).hasNext()) {
    {
     Object ret4 = ((java.lang.Object)((java.util.Iterator)iter3).next());
     while(true) {
      if (((java.util.Iterator)iter3).hasNext()) {
       {
        Object ret5 = ((IFn)f2).invoke(ret4, ((java.lang.Object)((java.util.Iterator)iter3).next()));
        if (clojure.lang.RT.isReduced(((java.lang.Object)ret5))) {
         return ((IFn)const__1.getRawRoot()).invoke(ret5);
        } else {
         java.lang.Object ret4___aux = ret5;
         ret4 = ret4___aux;
         continue;
        }
       }
      } else {
       return ret4;
      }
     }
    }
   } else {
    return ((IFn)f2).invoke();
   }
  }
 }
}
