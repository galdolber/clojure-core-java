package clojure;

import clojure.lang.*;

public final class core_future_done_QMARK_ extends clojure.lang.AFunction {
 static {
 }
 public core_future_done_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return (((java.util.concurrent.Future)f1).isDone() ? Boolean.TRUE : Boolean.FALSE);
 }
}
