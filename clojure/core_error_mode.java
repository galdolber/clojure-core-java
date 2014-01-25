package clojure;

import clojure.lang.*;

public final class core_error_mode extends clojure.lang.AFunction {
 static {
 }
 public core_error_mode() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return ((clojure.lang.Keyword)((clojure.lang.Agent)a1).getErrorMode());
 }
}
