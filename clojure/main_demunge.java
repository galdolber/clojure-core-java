package clojure;

import clojure.lang.*;

public final class main_demunge extends clojure.lang.AFunction {
 static {
 }
 public main_demunge() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fn_name1) {
  return ((java.lang.String)clojure.lang.Compiler.demunge((java.lang.String)((java.lang.String)fn_name1)));
 }
}
