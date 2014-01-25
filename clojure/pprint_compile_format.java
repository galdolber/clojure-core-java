package clojure;

import clojure.lang.*;

public final class pprint_compile_format extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*format-str*");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "process-nesting");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public pprint_compile_format() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object format_str1) {
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, format_str1));
   try {
    return ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(new clojure.pprint_compile_format_fn__8192(), RT.vector(format_str1, const__6))));
   } finally {
    ((IFn)const__7.getRawRoot()).invoke();
   }
  }
 }
}
