package clojure;

import clojure.lang.*;

public final class core_supers extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "bases");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "disj");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
 }
 public core_supers() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object class1) {
  {
   Object ret2 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(class1));
   Object cs3 = ret2;
   while(true) {
    Object __r3035 = ((IFn)const__2.getRawRoot()).invoke(cs3);
    if (__r3035 != null && !(__r3035 == Boolean.FALSE)) {
     {
      Object c4 = ((IFn)const__3.getRawRoot()).invoke(cs3);
      Object bs5 = ((IFn)const__1.getRawRoot()).invoke(c4);
      java.lang.Object ret2___aux = ((IFn)const__4.getRawRoot()).invoke(ret2, bs5);
      java.lang.Object cs3___aux = ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(cs3, c4), bs5);
      ret2 = ret2___aux;
      cs3 = cs3___aux;
      continue;
     }
    } else {
     return ((IFn)const__6.getRawRoot()).invoke(ret2);
    }
   }
  }
 }
}
