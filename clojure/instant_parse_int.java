package clojure;

import clojure.lang.*;

public final class instant_parse_int extends clojure.lang.AFunction {
 static {
 }
 public instant_parse_int() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return Numbers.num(java.lang.Long.parseLong((java.lang.String)((java.lang.String)s1)));
 }
}
