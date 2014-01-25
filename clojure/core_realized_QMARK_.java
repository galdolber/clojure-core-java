package clojure;

import clojure.lang.*;

public final class core_realized_QMARK_ extends clojure.lang.AFunction {
 static {
 }
 public core_realized_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return (((clojure.lang.IPending)x1).isRealized() ? Boolean.TRUE : Boolean.FALSE);
 }
}
