package clojure;

import clojure.lang.*;

public final class core_send_off extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "send-via");
 }
 public core_send_off() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object f2, java.lang.Object args3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((clojure.lang.ExecutorService)clojure.lang.Agent.soloExecutor), a1, f2, args3);
 }
 public int getRequiredArity() {
  return 2;
 }
}
