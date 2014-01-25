package clojure;

import clojure.lang.*;

public final class string_lower_case extends clojure.lang.AFunction {
 static {
 }
 public string_lower_case() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Object)s1).toString())).toLowerCase());
 }
}
