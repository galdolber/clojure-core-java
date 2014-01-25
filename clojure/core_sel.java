package clojure;

import clojure.lang.*;

public final class core_sel extends clojure.lang.AFunction {
 static {
 }
 public core_sel() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return Reflector.invokeConstructor(clojure.lang.Selector.class, new Object[]{s1});
 }
}
