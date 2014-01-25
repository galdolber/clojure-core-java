package clojure;

import clojure.lang.*;

public final class pprint_column_writer_fn__7410 extends clojure.lang.AFunction {
 static {
 }
 Object writer1;
 public pprint_column_writer_fn__7410(final Object writer1) {
  super();
  this.writer1 = writer1;
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  return Reflector.invokeNoArgInstanceMember(this.writer1, "flush");
 }
}
