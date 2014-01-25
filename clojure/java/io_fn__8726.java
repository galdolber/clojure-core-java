package clojure.java;

import clojure.lang.*;

public final class io_fn__8726 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "do-copy");
 }
 public io_fn__8726() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object input1, java.lang.Object output2, java.lang.Object opts3) {
  try {
   {
    Object in4 = new java.io.FileInputStream((java.io.File)((java.io.File)input1));
    try {
     return ((IFn)const__0.getRawRoot()).invoke(in4, output2, opts3);
    } finally {
     ((java.io.FileInputStream)in4).close();
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
