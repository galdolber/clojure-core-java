package clojure;

import clojure.lang.*;

public final class core_clear_agent_errors extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "restart-agent");
 }
 public core_clear_agent_errors() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return ((IFn)const__0.getRawRoot()).invoke(a1, ((java.lang.Object)((clojure.lang.Agent)a1).deref()));
 }
}
