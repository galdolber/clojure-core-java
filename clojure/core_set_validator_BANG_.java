package clojure;

import clojure.lang.*;

public final class core_set_validator_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_set_validator_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object iref1, java.lang.Object validator_fn2) {
  ((clojure.lang.IRef)iref1).setValidator((clojure.lang.IFn)((clojure.lang.IFn)validator_fn2));
  return null;
 }
}
