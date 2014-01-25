package clojure;

import clojure.lang.*;

public final class core_sigs extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assert-valid-fdecl");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "list");
 }
 public core_sigs() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fdecl1) {
  ((IFn)const__0.get()).invoke(fdecl1);
  {
   Object asig2 = new clojure.core_sigs_asig__3887();
   Object __r2250 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(fdecl1));
   if (__r2250 != null && !(__r2250 == Boolean.FALSE)) {
    {
     Object ret3 = clojure.lang.PersistentVector.EMPTY;
     Object fdecls4 = fdecl1;
     while(true) {
      Object __r2252 = fdecls4;
      if (__r2252 != null && !(__r2252 == Boolean.FALSE)) {
       java.lang.Object ret3___aux = ((IFn)const__3.getRawRoot()).invoke(ret3, ((IFn)asig2).invoke(((IFn)const__2.getRawRoot()).invoke(fdecls4)));
       java.lang.Object fdecls4___aux = ((IFn)const__4.getRawRoot()).invoke(fdecls4);
       ret3 = ret3___aux;
       fdecls4 = fdecls4___aux;
       continue;
      } else {
       return ((IFn)const__5.getRawRoot()).invoke(ret3);
      }
     }
    }
   } else {
    return ((IFn)const__6.getRawRoot()).invoke(((IFn)asig2).invoke(fdecl1));
   }
  }
 }
}
