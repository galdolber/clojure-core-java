package clojure;

import clojure.lang.*;

public final class pprint_consume_while extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (java.lang.Object)2L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public pprint_consume_while() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object func1, java.lang.Object initial_context2) {
  {
   Object context3 = initial_context2;
   Object acc4 = clojure.lang.PersistentVector.EMPTY;
   while(true) {
    {
     Object vec__73185 = ((IFn)const__0.getRawRoot()).invoke(func1, RT.vector(context3));
     Object result6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73185), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object continue7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73185), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object new_context8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73185), (int)RT.intCast(2L), ((java.lang.Object)null)));
     Object __r4798 = ((IFn)const__5.getRawRoot()).invoke(continue7);
     if (__r4798 != null && !(__r4798 == Boolean.FALSE)) {
      return RT.vector(acc4, context3);
     } else {
      java.lang.Object context3___aux = new_context8;
      java.lang.Object acc4___aux = ((IFn)const__6.getRawRoot()).invoke(acc4, result6);
      context3 = context3___aux;
      acc4 = acc4___aux;
      continue;
     }
    }
   }
  }
 }
}
