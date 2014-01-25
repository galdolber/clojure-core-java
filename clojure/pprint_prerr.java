package clojure;

import clojure.lang.*;

public final class pprint_prerr extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*err*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public pprint_prerr() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, const__3.get()));
   try {
    return ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), args1);
   } finally {
    ((IFn)const__6.getRawRoot()).invoke();
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
