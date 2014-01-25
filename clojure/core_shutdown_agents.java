package clojure;

import clojure.lang.*;

public final class core_shutdown_agents extends clojure.lang.AFunction {
 static {
 }
 public core_shutdown_agents() {
  super();
 }
 public java.lang.Object invoke() {
  clojure.lang.Agent.shutdown();
  return null;
 }
}
