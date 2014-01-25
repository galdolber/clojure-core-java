package clojure;

import clojure.lang.*;

public final class core_ref_history_count extends clojure.lang.AFunction {
 static {
 }
 public core_ref_history_count() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ref1) {
  return Integer.valueOf(((clojure.lang.Ref)ref1).getHistoryCount());
 }
}
