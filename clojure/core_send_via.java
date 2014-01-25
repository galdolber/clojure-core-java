package clojure;

import clojure.lang.*;

public final class core_send_via extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*agent*");
 }
 public core_send_via() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object executor1, java.lang.Object a2, java.lang.Object f3, java.lang.Object args4) {
  Object __r2440 = null;
  {
   ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, a2));
   __r2440 = ((IFn)new clojure.core_send_via_fn__4140(f3)).invoke();
  }
  return ((java.lang.Object)((clojure.lang.Agent)a2).dispatch((clojure.lang.IFn)((clojure.lang.IFn)__r2440), (clojure.lang.ISeq)((clojure.lang.ISeq)args4), (java.util.concurrent.Executor)((java.util.concurrent.Executor)executor1)));
 }
 public int getRequiredArity() {
  return 3;
 }
}
