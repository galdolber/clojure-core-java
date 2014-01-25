package clojure;

import clojure.lang.*;

public final class core_nthrest extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public core_nthrest() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object n2) {
  {
   Object n3 = n2;
   Object xs4 = coll1;
   while(true) {
    Object __r2573 = null;
    {
     boolean and__3966__auto__5 = clojure.lang.Numbers.isPos(((java.lang.Object)n3));
     Object __r2574;
     if (and__3966__auto__5) {
      __r2574 = ((IFn)const__1.getRawRoot()).invoke(xs4);
     } else {
      __r2574 = (and__3966__auto__5 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r2573 = __r2574;
    }
    Object __r2575 = __r2573;
    if (__r2575 != null && !(__r2575 == Boolean.FALSE)) {
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
