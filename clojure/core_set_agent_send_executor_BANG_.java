package clojure;

import clojure.lang.*;

public final class core_set_agent_send_executor_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_set_agent_send_executor_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object executor1) {
  clojure.lang.Agent.pooledExecutor = (clojure.lang.ExecutorService)executor1;
  return ((clojure.lang.ExecutorService)clojure.lang.Agent.pooledExecutor);
 }
}
