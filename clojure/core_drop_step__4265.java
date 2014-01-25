package clojure;

import clojure.lang.*;

public final class core_drop_step__4265 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 public core_drop_step__4265() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object coll2) {
  while(true) {
   {
    Object s3 = ((IFn)const__0.getRawRoot()).invoke(coll2);
    Object __r2510 = null;
    {
     boolean and__3966__auto__4 = clojure.lang.Numbers.isPos(((java.lang.Object)n1));
     Object __r2511;
     if (and__3966__auto__4) {
      __r2511 = s3;
     } else {
      __r2511 = (and__3966__auto__4 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r2510 = __r2511;
    }
    Object __r2512 = __r2510;
    if (__r2512 != null && !(__r2512 == Boolean.FALSE)) {
     java.lang.Object n1___aux = ((java.lang.Number)clojure.lang.Numbers.dec(((java.lang.Object)n1)));
     java.lang.Object coll2___aux = ((IFn)const__3.getRawRoot()).invoke(s3);
     n1 = n1___aux;
     coll2 = coll2___aux;
     continue;
    } else {
     return s3;
    }
   }
  }
 }
}
