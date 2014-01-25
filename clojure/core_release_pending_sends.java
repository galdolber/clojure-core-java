package clojure;

import clojure.lang.*;

public final class core_release_pending_sends extends clojure.lang.AFunction {
 static {
 }
 public core_release_pending_sends() {
  super();
 }
 public java.lang.Object invoke() {
  return Integer.valueOf(clojure.lang.Agent.releasePendingSends());
 }
}
