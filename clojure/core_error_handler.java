package clojure;

import clojure.lang.*;

public final class core_error_handler extends clojure.lang.AFunction {
 static {
 }
 public core_error_handler() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return ((clojure.lang.IFn)((clojure.lang.Agent)a1).getErrorHandler());
 }
}
