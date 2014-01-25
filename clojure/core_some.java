package clojure;

import clojure.lang.*;

public final class core_some extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_some() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object pred1, java.lang.Object coll2) {
  while(true) {
   Object __r2470 = ((IFn)const__0.getRawRoot()).invoke(coll2);
   if (__r2470 != null && !(__r2470 == Boolean.FALSE)) {
    {
     Object or__3968__auto__3 = ((IFn)pred1).invoke(((IFn)const__1.getRawRoot()).invoke(coll2));
     Object __r2472 = or__3968__auto__3;
     if (__r2472 != null && !(__r2472 == Boolean.FALSE)) {
      return or__3968__auto__3;
     } else {
      java.lang.Object coll2___aux = ((IFn)const__2.getRawRoot()).invoke(coll2);
      coll2 = coll2___aux;
      continue;
     }
    }
   } else {
    return null;
   }
  }
 }
}
