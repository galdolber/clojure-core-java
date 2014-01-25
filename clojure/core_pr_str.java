package clojure;

import clojure.lang.*;

public final class core_pr_str extends clojure.lang.RestFn {
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
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_pr_str() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object xs1) {
  {
   Object s__4646__auto__2 = new java.io.StringWriter();
   {
    ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, s__4646__auto__2));
    try {
     ((IFn)const__3.getRawRoot()).invoke(const__4.get(), xs1);
     return ((IFn)const__5.getRawRoot()).invoke(s__4646__auto__2);
    } finally {
     ((IFn)const__6.getRawRoot()).invoke();
    }
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
