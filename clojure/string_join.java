package clojure;

import clojure.lang.*;

public final class string_join extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public string_join() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object separator1, java.lang.Object coll2) {
  {
   Object sb3 = new java.lang.StringBuilder((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(coll2))));
   Object more4 = ((IFn)const__3.getRawRoot()).invoke(coll2);
   Object sep5 = ((IFn)const__1.getRawRoot()).invoke(separator1);
   while(true) {
    Object __r6333 = more4;
    if (__r6333 != null && !(__r6333 == Boolean.FALSE)) {
     java.lang.Object sb3___aux = ((java.lang.StringBuilder)((java.lang.StringBuilder)((java.lang.StringBuilder)((java.lang.StringBuilder)sb3).append((java.lang.String)((java.lang.String)sep5)))).append((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(more4)))));
     java.lang.Object more4___aux = ((IFn)const__3.getRawRoot()).invoke(more4);
     sb3 = sb3___aux;
     more4 = more4___aux;
     continue;
    } else {
     return ((IFn)const__1.getRawRoot()).invoke(sb3);
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), coll1);
 }
}
