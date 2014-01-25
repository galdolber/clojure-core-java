package clojure;

import clojure.lang.*;

public final class core_set_error_handler_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_set_error_handler_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object handler_fn2) {
  ((clojure.lang.Agent)a1).setErrorHandler((clojure.lang.IFn)((clojure.lang.IFn)handler_fn2));
  return null;
 }
}
