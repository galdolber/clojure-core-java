package clojure;

import clojure.lang.*;

public final class pprint_parse_lb_options extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__2 = (java.lang.Object)2L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public pprint_parse_lb_options() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1, java.lang.Object body2) {
  {
   Object body3 = body2;
   Object acc4 = clojure.lang.PersistentVector.EMPTY;
   while(true) {
    Object __r5037 = ((IFn)opts1).invoke(((IFn)const__0.getRawRoot()).invoke(body3));
    if (__r5037 != null && !(__r5037 == Boolean.FALSE)) {
     java.lang.Object body3___aux = ((IFn)const__1.getRawRoot()).invoke(const__2, body3);
     java.lang.Object acc4___aux = ((IFn)const__3.getRawRoot()).invoke(acc4, ((IFn)const__4.getRawRoot()).invoke(const__2, body3));
     body3 = body3___aux;
     acc4 = acc4___aux;
     continue;
    } else {
     return RT.vector(((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), acc4), body3);
    }
   }
  }
 }
}
