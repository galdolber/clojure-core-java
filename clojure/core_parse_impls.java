package clojure;

import clojure.lang.*;

public final class core_parse_impls extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "drop-while");
 }
 public core_parse_impls() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object specs1) {
  {
   Object ret2 = clojure.lang.PersistentArrayMap.EMPTY;
   Object s3 = specs1;
   while(true) {
    Object __r3707 = ((IFn)const__0.getRawRoot()).invoke(s3);
    if (__r3707 != null && !(__r3707 == Boolean.FALSE)) {
     java.lang.Object ret2___aux = ((IFn)const__1.getRawRoot()).invoke(ret2, ((IFn)const__2.getRawRoot()).invoke(s3), ((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(s3)));
     java.lang.Object s3___aux = ((IFn)const__6.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(s3));
     ret2 = ret2___aux;
     s3 = s3___aux;
     continue;
    } else {
     return ret2;
    }
   }
  }
 }
}
