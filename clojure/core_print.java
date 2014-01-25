package clojure;

import clojure.lang.*;

public final class core_print extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*print-readably*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_print() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object more1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, null));
   try {
    return ((IFn)const__3.getRawRoot()).invoke(const__4.get(), more1);
   } finally {
    ((IFn)const__5.getRawRoot()).invoke();
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
