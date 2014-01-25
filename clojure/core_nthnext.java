package clojure;

import clojure.lang.*;

public final class core_nthnext extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_nthnext() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object n2) {
  {
   Object n3 = n2;
   Object xs4 = ((IFn)const__0.getRawRoot()).invoke(coll1);
   while(true) {
    Object __r2568 = null;
    {
     Object and__3966__auto__5 = xs4;
     Object __r2569;
     Object __r2570 = and__3966__auto__5;
     if (__r2570 != null && !(__r2570 == Boolean.FALSE)) {
      __r2569 = (clojure.lang.Numbers.isPos(((java.lang.Object)n3)) ? Boolean.TRUE : Boolean.FALSE);
     } else {
      __r2569 = and__3966__auto__5;
     }
     __r2568 = __r2569;
    }
    Object __r2571 = __r2568;
    if (__r2571 != null && !(__r2571 == Boolean.FALSE)) {
     java.lang.Object n3___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)n3)));
     java.lang.Object xs4___aux = ((IFn)const__3.getRawRoot()).invoke(xs4);
     n3 = n3___aux;
     xs4 = xs4___aux;
     continue;
    } else {
     return xs4;
    }
   }
  }
 }
}
