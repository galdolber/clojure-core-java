package clojure;

import clojure.lang.*;

public final class core_file_seq_fn__4680 extends clojure.lang.AFunction {
 static {
 }
 public core_file_seq_fn__4680() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return (((java.io.File)f1).isDirectory() ? Boolean.TRUE : Boolean.FALSE);
 }
}
