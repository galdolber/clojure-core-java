package clojure;

import clojure.lang.*;

public final class core_drop_while_step__4275 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public core_drop_while_step__4275() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  while(true) {
   {
    Object s3 = ((IFn)const__0.getRawRoot()).invoke(coll2);
    Object __r2516 = null;
    {
     Object and__3966__auto__4 = s3;
     Object __r2517;
     Object __r2518 = and__3966__auto__4;
     if (__r2518 != null && !(__r2518 == Boolean.FALSE)) {
      __r2517 = ((IFn)pred1).invoke(((IFn)const__1.getRawRoot()).invoke(s3));
     } else {
      __r2517 = and__3966__auto__4;
     }
     __r2516 = __r2517;
    }
    Object __r2519 = __r2516;
    if (__r2519 != null && !(__r2519 == Boolean.FALSE)) {
     java.lang.Object coll2___aux = ((IFn)const__2.getRawRoot()).invoke(s3);
     coll2 = coll2___aux;
     continue;
    } else {
     return s3;
    }
   }
  }
 }
}
