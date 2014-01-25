package clojure;

import clojure.lang.*;

public final class core_to_array_2d extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "aset");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_to_array_2d() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  try {
   {
    Object ret2 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class)java.lang.Class.forName((java.lang.String)((java.lang.String)"[Ljava.lang.Object;"))), Integer.valueOf(((java.util.Collection)coll1).size()));
    {
     long i3 = 0L;
     Object xs4 = ((IFn)const__2.getRawRoot()).invoke(coll1);
     while(true) {
      Object __r2718 = xs4;
      if (__r2718 != null && !(__r2718 == Boolean.FALSE)) {
       Reflector.invokeStaticMethod(clojure.lang.RT.class, "aset", new Object[]{ret2, Integer.valueOf(clojure.lang.RT.intCast((long)i3)), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(xs4))});
       long i3___aux = clojure.lang.Numbers.inc((long)i3);
       java.lang.Object xs4___aux = ((IFn)const__8.getRawRoot()).invoke(xs4);
       i3 = i3___aux;
       xs4 = xs4___aux;
       continue;
      } else {
      }
      break;
     }
    }
    return ret2;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
