package clojure;

import clojure.lang.*;

public final class core_agent_error extends clojure.lang.AFunction {
 static {
 }
 public core_agent_error() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return ((java.lang.Throwable)((clojure.lang.Agent)a1).getError());
 }
}
