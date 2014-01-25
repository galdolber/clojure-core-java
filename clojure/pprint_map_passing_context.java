package clojure;

import clojure.lang.*;

public final class pprint_map_passing_context extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public pprint_map_passing_context() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object func1, java.lang.Object initial_context2, java.lang.Object lis3) {
  {
   Object context4 = initial_context2;
   Object lis5 = lis3;
   Object acc6 = clojure.lang.PersistentVector.EMPTY;
   while(true) {
    Object __r4794 = ((IFn)const__0.getRawRoot()).invoke(lis5);
    if (__r4794 != null && !(__r4794 == Boolean.FALSE)) {
     return RT.vector(acc6, context4);
    } else {
     {
      Object this7 = ((IFn)const__1.getRawRoot()).invoke(lis5);
      Object remainder8 = ((IFn)const__2.getRawRoot()).invoke(lis5);
      Object vec__73149 = ((IFn)const__3.getRawRoot()).invoke(func1, RT.vector(this7, context4));
      Object result10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73149), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object new_context11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73149), (int)RT.intCast(1L), ((java.lang.Object)null)));
      java.lang.Object context4___aux = new_context11;
      java.lang.Object lis5___aux = remainder8;
      java.lang.Object acc6___aux = ((IFn)const__7.getRawRoot()).invoke(acc6, result10);
      context4 = context4___aux;
      lis5 = lis5___aux;
      acc6 = acc6___aux;
      continue;
     }
    }
   }
  }
 }
}
