package clojure;

import clojure.lang.*;

public final class core_load_reader extends clojure.lang.AFunction {
 static {
 }
 public core_load_reader() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object rdr1) {
  return ((java.lang.Object)clojure.lang.Compiler.load((java.io.Reader)((java.io.Reader)rdr1)));
 }
}
