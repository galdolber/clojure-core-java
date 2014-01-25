package clojure;

import clojure.lang.*;

public final class core_into1 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IEditableCollection.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "persistent!");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "conj!");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "transient");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_into1() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object to1, java.lang.Object from2) {
  if ((to1 instanceof clojure.lang.IEditableCollection)) {
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(to1), from2));
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(const__6.getRawRoot(), to1, from2);
  }
 }
}
