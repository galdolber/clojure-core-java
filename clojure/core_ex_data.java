package clojure;

import clojure.lang.*;

public final class core_ex_data extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IExceptionInfo.class;
 }
 public core_ex_data() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ex1) {
  if ((ex1 instanceof clojure.lang.IExceptionInfo)) {
   return ((clojure.lang.IPersistentMap)((clojure.lang.IExceptionInfo)ex1).getData());
  } else {
   return null;
  }
 }
}
