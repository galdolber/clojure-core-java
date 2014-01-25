package clojure;

import clojure.lang.*;

public final class core_future_cancel extends clojure.lang.AFunction {
 static {
 }
 public core_future_cancel() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return (((java.util.concurrent.Future)f1).cancel((boolean)((Boolean)Boolean.TRUE).booleanValue()) ? Boolean.TRUE : Boolean.FALSE);
 }
}
