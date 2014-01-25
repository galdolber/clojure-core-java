package clojure;

import clojure.lang.*;

public final class core_reduce1 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-next");
 }
 public core_reduce1() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object val2, java.lang.Object coll3) {
  while(true) {
   {
    Object s4 = ((IFn)const__0.getRawRoot()).invoke(coll3);
    Object __r2344 = s4;
    if (__r2344 != null && !(__r2344 == Boolean.FALSE)) {
     Object __r2346 = ((IFn)const__4.getRawRoot()).invoke(s4);
     if (__r2346 != null && !(__r2346 == Boolean.FALSE)) {
      java.lang.Object val2___aux = ((java.lang.Object)((clojure.lang.IChunk)((IFn)const__5.getRawRoot()).invoke(s4)).reduce((clojure.lang.IFn)((clojure.lang.IFn)f1), ((java.lang.Object)val2)));
      java.lang.Object coll3___aux = ((IFn)const__6.getRawRoot()).invoke(s4);
      val2 = val2___aux;
      coll3 = coll3___aux;
      continue;
     } else {
      java.lang.Object val2___aux = ((IFn)f1).invoke(val2, ((IFn)const__2.getRawRoot()).invoke(s4));
      java.lang.Object coll3___aux = ((IFn)const__3.getRawRoot()).invoke(s4);
      val2 = val2___aux;
      coll3 = coll3___aux;
      continue;
     }
    } else {
     return val2;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  {
   Object s3 = ((IFn)const__0.getRawRoot()).invoke(coll2);
   Object __r2348 = s3;
   if (__r2348 != null && !(__r2348 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(f1, ((IFn)const__2.getRawRoot()).invoke(s3), ((IFn)const__3.getRawRoot()).invoke(s3));
   } else {
    return ((IFn)f1).invoke();
   }
  }
 }
}
