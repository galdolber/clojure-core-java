package clojure;

import clojure.lang.*;

public final class core_await1 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "await");
 }
 public core_await1() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  if (clojure.lang.Numbers.isPos((long)((clojure.lang.Agent)a1).getQueueCount())) {
   ((IFn)const__1.getRawRoot()).invoke(a1);
  } else {
  }
  return a1;
 }
}
