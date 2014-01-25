package clojure;

import clojure.lang.*;

public final class core_compile extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*compile-files*");
 }
 public core_compile() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lib1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, Boolean.TRUE));
   ((IFn)new clojure.core_compile_fn__5044(lib1)).invoke();
  }
  return lib1;
 }
}
