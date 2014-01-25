package clojure.java;

import clojure.lang.*;

public final class io_fn__8566 extends clojure.lang.AFunction {
 static {
 }
 public io_fn__8566() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object u1) {
  try {
   return ((java.net.URL)((java.net.URI)u1).toURL());
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
