package clojure;

import clojure.lang.*;

public final class core_set_error_mode_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_set_error_mode_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object mode_keyword2) {
  ((clojure.lang.Agent)a1).setErrorMode((clojure.lang.Keyword)((clojure.lang.Keyword)mode_keyword2));
  return null;
 }
}
