package clojure;

import clojure.lang.*;

public final class pprint_upcase_writer_fn__7873 extends clojure.lang.AFunction {
 static {
 }
 Object writer1;
 public pprint_upcase_writer_fn__7873(final Object writer1) {
  super();
  this.writer1 = writer1;
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  try {
   ((java.io.Writer)this.writer1).flush();
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
